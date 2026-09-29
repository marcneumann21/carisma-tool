package carisma.profile.euaiactcompliance;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UseCase;

import carisma.modeltype.uml2.StereotypeApplication;
import carisma.modeltype.uml2.TaggedValue;
import carisma.modeltype.uml2.UMLHelper;

/**
 * The implementation of the EU AI Act compliance profile. Provides easy access
 * to the profile's stereotypes and to applications of those.
 *
 */
public final class EUAIActComplianceUtil {

	/**
	 * Hide constructor.
	 */
	private EUAIActComplianceUtil() {
	}

	/**
	 * Checks, whether the Element <code>elem</code> has applied the Stereotype
	 * <code>stereo</code>.
	 *
	 * @param elem   the Element to check
	 * @param stereo the Stereotype of interest
	 * @return true, if <code>stereo</code> is applied to <code>elem</code>
	 */
	public static boolean hasStereotype(final Element elem, final EUAIActCompliance stereo) {
		for (Stereotype appliedStereo : elem.getAppliedStereotypes()) {
			if (stereo == null) {
				if (EUAIActCompliance.contains(appliedStereo)) {
					return true;
				}
			} else if (stereo.isEqual(appliedStereo)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns a {@code Set} of {@code Element} elements contained in the
	 * {@code Element} that are instances of {@code type} and have the stereotype
	 * {@code stereo}. The set can also contain the {@code Element} itself, if it
	 * matches the class and stereotype criteria.
	 *
	 * @param <T>    The type of the elements in the returned set.
	 * @param model  The model that contains the element candidates.
	 * @param type   The class (including subclasses) the returned elements are
	 *               instances of.
	 * @param stereo The stereotype the returned elements have to have.
	 * @return Set of Elements of class {@code Class<T>} with stereotype
	 *         {@code stereo}
	 */
	public static <T extends Element> Set<T> getStereotypedElements(final Element model, final Class<T> type,
			final EUAIActCompliance stereo) {
		Set<T> elements = new LinkedHashSet<T>(UMLHelper.getAllElementsOfType(model, type));
		elements.removeIf(e -> !(hasStereotype(e, stereo)));
		if ((type.isInstance(model)) && hasStereotype(model, stereo)) {
			elements.add(type.cast(model));
		}
		return elements;
	}

	/**
	 * Check whether the {@code attribute} of the {@code stereotype} attached to
	 * {@code element} is set to {@code true}.
	 *
	 * @param element    the element to look for the stereotype.
	 * @param stereotype the stereotype containing the attribute of interest.
	 * @param attribute  the attribute of interest.
	 * @return true, if the attribute is present and set to 'true'.
	 */
	public static boolean isTaggedValueTrue(final Element element, final EUAIActCompliance stereotype,
			final String attribute) {
		List<Object> tag = getTaggedValues(attribute, stereotype, element);
		return !tag.isEmpty() && Boolean.TRUE.equals(tag.get(0));
	}

	/**
	 * Returns a list of the tag values of the UMLsec stereotype at the given
	 * element stereoParent.
	 * 
	 * @param tagName      - The name of the tag to read the values of
	 * @param stereo       - the stereotype with the tag
	 * @param stereoParent - the element the stereotype is applied to
	 * @return - a list of tag values; empty if the stereotype doesn't have the tag
	 */
	@SuppressWarnings("unchecked")
	private static List<Object> getTaggedValues(final String tagName, final EUAIActCompliance stereo,
			final Element stereoParent) {
		List<Object> tagValues = new ArrayList<Object>();
		if (stereoParent == null) {
			return tagValues;
		}
		StereotypeApplication stereoApp = getStereotypeApplication(stereoParent, stereo);
		if (stereoApp == null) {
			return tagValues;
		}
		TaggedValue tv = stereoApp.getTaggedValue(tagName);
		if (tv == null) {
			return tagValues;
		}
		Object tagValueObject = tv.getValue();
		if (tagValueObject instanceof EList<?>) {
			EList<Object> valueList = (EList<Object>) tagValueObject;
			tagValues.addAll(valueList);
		} else {
			tagValues.add(tagValueObject);
		}
		return tagValues;
	}

	/**
	 * Returns the StereotypeApplication of the given stereotype if it is applied.
	 * 
	 * @param stereo  - stereotype
	 * @param element - element
	 * @return stereotypeApplication if found, null otherwise
	 */
	private static StereotypeApplication getStereotypeApplication(final Element element,
			final EUAIActCompliance stereo) {
		for (StereotypeApplication stereoApp : getStereotypeApplications(element)) {
			EUAIActCompliance type = EUAIActCompliance.getValue(stereoApp.getAppliedStereotype().getName());
			if (stereo.equals(type)) {
				return stereoApp;
			}
		}
		return null;
	}

	/**
	 * Returns the UMLsec stereotype applications to the given element.
	 * 
	 * @param element - the element to inspect
	 * @return - list of UMLsec stereotype applications
	 */
	private static List<StereotypeApplication> getStereotypeApplications(final Element element) {
		List<StereotypeApplication> result = new ArrayList<StereotypeApplication>();
		for (Stereotype stereo : element.getAppliedStereotypes()) {
			if (EUAIActCompliance.contains(stereo)) {
				result.add(new StereotypeApplication(stereo, element));
			}
		}
		return result;
	}

	/**
	 * Checks whether at least one of the given boolean tags is set to {@code true}.
	 *
	 * @param element    the element to look for the stereotype.
	 * @param stereotype the stereotype containing the attributes of interest.
	 * @param tags       the tags of interest.
	 * @return {@code true}, if at least one of the attributes is set to
	 *         {@code true}.
	 */
	public static boolean isAnyTaggedValueTrue(final Element element, final EUAIActCompliance stereotype,
			final String[] tags) {
		for (String tag : tags) {
			if (isTaggedValueTrue(element, stereotype, tag)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the names of all boolean tags from the given list that are set to
	 * {@code true}.
	 *
	 * @param element    the element to look for the stereotype.
	 * @param stereotype the stereotype containing the attributes of interest.
	 * @param tags       the tags of interest.
	 * @return list of tag names whose value is {@code true}, empty otherwise.
	 */
	public static List<String> getTrueTags(final Element element, final EUAIActCompliance stereotype,
			final String[] tags) {
		List<String> trueTags = new ArrayList<>();
		for (String tag : tags) {
			if (isTaggedValueTrue(element, stereotype, tag)) {
				trueTags.add(tag);
			}
		}
		return trueTags;
	}

	/**
	 * Returns the name of the enumeration literal that the given enumeration
	 * attribute is set to.
	 *
	 * @param element    the element to look for the stereotype.
	 * @param stereotype the stereotype containing the attribute of interest.
	 * @param attribute  the attribute of interest.
	 * @return the name of the enumeration literal, or {@code null} if the tag is
	 *         not set.
	 */
	public static String getEnumValue(final Element element, final EUAIActCompliance stereotype,
			final String attribute) {
		String enumValue = null;
		List<Object> taggedValues = getTaggedValues(attribute, stereotype, element);
		for (Object oj : taggedValues) {
			if (oj instanceof Enumerator) {
				enumValue = ((Enumerator) oj).getName();
			} else if (oj instanceof EnumerationLiteral) {
				enumValue = ((EnumerationLiteral) oj).getName();
			}
		}
		return enumValue;
	}

	/**
	 * Returns the names of the enumeration literals that the given enumeration
	 * attribute is set to.
	 *
	 * @param element    the element to look for the stereotype.
	 * @param stereotype the stereotype containing the attribute of interest.
	 * @param attribute  the attribute of interest.
	 * @return the names of the enumeration literals, empty if the tag is not set.
	 */
	public static List<String> getEnumValues(final Element element, final EUAIActCompliance stereotype,
			String attribute) {
		List<String> enumValues = new ArrayList<>();
		List<Object> taggedValues = getTaggedValues(attribute, stereotype, element);
		for (Object oj : taggedValues) {
			if (oj instanceof Enumerator) {
				enumValues.add(((Enumerator) oj).getName());
			} else if (oj instanceof EnumerationLiteral) {
				enumValues.add(((EnumerationLiteral) oj).getName());
			}
		}
		return enumValues;
	}

	/**
	 * Returns the value of the given string tag.
	 *
	 * @param element    the element to look for the stereotype.
	 * @param stereotype the stereotype containing the attribute of interest.
	 * @param attribute  the attribute of interest.
	 * @return the value of the tag, or {@code null} if the tag is not set.
	 */
	public static String getStringValue(final Element element, final EUAIActCompliance stereotype,
			final String attribute) {
		String stringValue = null;
		List<Object> taggedValues = getTaggedValues(attribute, stereotype, element);
		for (Object oj : taggedValues) {
			if (oj instanceof String) {
				stringValue = oj.toString();
			}
		}
		return stringValue;
	}

	/**
	 * Returns all elements of the given type and stereotype that belong to the
	 * given system, either by containment, by a dependency or manifestation.
	 *
	 * @param <T>        the type of the elements in the returned set.
	 * @param system     the AI system or model element to start from.
	 * @param type       the class (including subclasses) the returned elements are
	 *                   instances of.
	 * @param stereotype the stereotype the returned elements have to have.
	 * @return set of connected elements, empty if none is found.
	 */
	public static <T extends Element> Set<T> getConnectedElements(final Component system, final Class<T> type,
			final EUAIActCompliance stereotype) {
		Set<T> elements = new LinkedHashSet<T>(getStereotypedElements(system, type, stereotype));
		elements.remove(system);

		for (Dependency dep : system.getClientDependencies()) {
			for (Element el : dep.getSuppliers()) {
				if (type.isInstance(el) && hasStereotype(el, stereotype)) {
					elements.add(type.cast(el));
				}
			}
		}

	    for (DirectedRelationship rel : system.getTargetDirectedRelationships()) {
	        if (rel instanceof Manifestation) {
	            for (Element el : ((Manifestation) rel).getSources()) {
	                if (type.isInstance(el) && hasStereotype(el, stereotype)) {
	                    elements.add(type.cast(el));
	                }
	            }
	        }
	    }

	    return elements;
	}

	/**
	 * Returns the components that are directly contained in the given system.
	 *
	 * @param system the AI system to inspect.
	 * @return set of directly contained components, empty if the system has no
	 *         parts.
	 */
	public static Set<Component> getNestedComponents(final Component system) {
		Set<Component> components = new LinkedHashSet<Component>();
		for (Element el : system.getOwnedElements()) {
			if (el instanceof Component) {
				components.add((Component) el);
			}
		}

		return components;
	}

	/**
	 * Returns the components that are connected via a dependency with the given
	 * system.
	 *
	 * @param system the AI system to inspect.
	 * @return set of components the system depends on, empty if the system has no
	 *         dependencies.
	 */
	public static Set<Component> getDependencyComponents(final Component system) {
		Set<Component> components = new LinkedHashSet<Component>();
		for (Dependency dep : system.getClientDependencies()) {
			for (NamedElement el : dep.getSuppliers()) {
				if (el instanceof Component) {
					components.add((Component) el);
				}
			}
		}

		return components;
	}

	/**
	 * Returns for each use case in the given AI system its name together with the
	 * applied EU AI Act compliance stereotypes.
	 *
	 * @param system the AI system to inspect
	 * @return list of descriptions, one per use case, empty if no use case is
	 *         assigned
	 */
	public static List<String> getUseCasePurposes(final Component system) {
		List<String> purposes = new ArrayList<>();
		for (UseCase uc : system.getUseCases()) {
			List<String> stereotypes = new ArrayList<>();
			for (Stereotype stereo : uc.getAppliedStereotypes()) {
				if (EUAIActCompliance.contains(stereo)) {
					stereotypes.add(stereo.getName());
				}
			}
			if (stereotypes.isEmpty()) {
				purposes.add("'" + uc.getName() + "'");
			} else {
				purposes.add("'" + uc.getName() + "' (" + String.join(", ", stereotypes) + ")");
			}
		}
		return purposes;
	}
}
