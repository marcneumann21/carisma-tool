package carisma.profile.euaiactcompliance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

import carisma.modeltype.uml2.StereotypeApplication;
import carisma.modeltype.uml2.TaggedValue;
import carisma.modeltype.uml2.UMLHelper;

/**
 * The implementation of the UMLsec profile. Provides easy access to the
 * profile's stereotypes and to applications of those.
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
		Set<T> elements = new HashSet<T>(UMLHelper.getAllElementsOfType(model, type));
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
	 * @return true, if at least one of the attributes is set to 'true'.
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
	 * @return list of tag names whose value is 'true', empty otherwise.
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

	// TODO JavaDoc
	public static String getEnumValue(final Element element, final EUAIActCompliance stereotype, String attribute) {
		String enumValue = null;
		List<Object> taggedValues = getTaggedValues(attribute, stereotype, element);
		for (Object oj : taggedValues) {
			if (oj instanceof EnumerationLiteral) {
				enumValue = ((EnumerationLiteral) oj).getName();
			}
		}
		return enumValue;
	}

	// TODO JavaDoc
	public static String getStringValue(Element element, EUAIActCompliance stereotype, String attribute) {
		String stringValue = null;
		List<Object> taggedValues = getTaggedValues(attribute, stereotype, element);
		for (Object oj : taggedValues) {
			if (oj instanceof String) {
				stringValue = oj.toString();
			}
		}
		return stringValue;
	}

	// TODO JavaDoc
	public static Boolean getBooleanValue(Element element, EUAIActCompliance stereotype, String attribute) {
		Boolean booleanValue = null;
		List<Object> taggedValues = getTaggedValues(attribute, stereotype, element);
		for (Object oj : taggedValues) {
			if (oj instanceof Boolean) {
				booleanValue = (Boolean) oj;
			}
		}
		return booleanValue;
	}

	// TODO JavaDoc
	public static String getAssociationActorEnd(Component component, EUAIActCompliance associationStereotype,
			EUAIActCompliance actorStereotype) {
		for (Association ass : component.getAssociations()) {
			if (!hasStereotype(ass, associationStereotype)) {
				continue;
			}
			for (Element el : ass.getRelatedElements()) {
				if ((el instanceof Actor) && hasStereotype(el, actorStereotype)) {
					return ((NamedElement) el).getName();
				}
			}
		}
		return null;
	}

	// TODO JavaDoc
	public static <T extends Element> Set<T> getConnectedElements(Component system, Class<T> type,
			EUAIActCompliance stereotype) {
		Set<T> elements = new HashSet<T>(getStereotypedElements(system, type, stereotype));
		elements.remove(system);

		for (Dependency dep : system.getClientDependencies()) {
			for (Element el : dep.getSuppliers()) {
				if (type.isInstance(el) && hasStereotype(el, stereotype)) {
					elements.add(type.cast(el));
				}
			}
		}

		return elements;
	}

	// TODO JavaDoc
	public static List<String> getAllConnectedElements(Component system) {
		List<String> elements = new ArrayList<>();

		// nested components
		for (Element element : system.getOwnedElements()) {
			if (element instanceof Component) {
				String relation = "'" + system.getName() + "' contains '" + ((Component) element).getName() + "'";
				if (!elements.contains(relation)) {
					elements.add(relation);
				}
			}
		}

		// dependencies to other components
		for (Dependency dependency : system.getClientDependencies()) {
			for (NamedElement supplier : dependency.getSuppliers()) {
				if (supplier instanceof Component) {
					String relation = "'" + system.getName() + "' uses '" + supplier.getName() + "'";
					if (!elements.contains(relation)) {
						elements.add(relation);
					}
				}
			}
		}

		return elements;
	}
}
