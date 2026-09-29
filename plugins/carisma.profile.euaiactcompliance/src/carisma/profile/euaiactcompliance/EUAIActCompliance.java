package carisma.profile.euaiactcompliance;

import org.eclipse.uml2.uml.Stereotype;

import carisma.modeltype.uml2.CarismaProfileDescriptor;

public enum EUAIActCompliance {

	// System elements
	AISystem("AISystem"), SelfDevelopedModel("SelfDevelopedModel"), TrainingData("TrainingData"),
	ThirdPartyComponent("ThirdPartyComponent"), ProductEmbedding("ProductEmbedding"),

	// Unacceptable risk (Art. 5)
	ManipulativeBehaviour("ManipulativeBehaviour"), ExploitingHumanVulnerability("ExploitingHumanVulnerability"),
	SocialScoring("SocialScoring"), FacialImageScraping("FacialImageScraping"),

	// High risk (Art. 6, Annex III)
	BiometricIdentification("BiometricIdentification"), BiometricCategorisation("BiometricCategorisation"),
	EmotionRecognition("EmotionRecognition"), CriticalInfrastructure("CriticalInfrastructure"), Education("Education"),
	HumanEmployment("HumanEmployment"), EssentialService("EssentialService"), LawEnforcement("LawEnforcement"),
	MigrationBorder("MigrationBorder"), AdministrationJusticeDemocracy("AdministrationJusticeDemocracy"), Profiling("Profiling"),
	RiskManagementSystem("RiskManagementSystem"),

	// Limited risk / transparency obligations only for provider (Art. 50)
	HumanInteraction("HumanInteraction"), SyntheticContent("SyntheticContent");

	private static final String PROFILE_NAME = "euaiactcompliance";
	private static final String PROFILE_VERSION = "1";
	private static final String PROFILE_URI = "platform:/plugin/carisma.profile.euaiactcompliance/profile/euaiactcompliance.profile.uml";

	public static final CarismaProfileDescriptor DESCRIPTOR = new CarismaProfileDescriptor(PROFILE_NAME,
			PROFILE_VERSION, PROFILE_URI);

	private final String readableName;

	private EUAIActCompliance(final String newName) {
		readableName = newName;
	}

	@Override
	public String toString() {
		return readableName;
	}

	public static EUAIActCompliance getValue(final String name) {
		for (EUAIActCompliance type : EUAIActCompliance.values()) {
			if (type.toString().equalsIgnoreCase(name)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * Checks whether the given stereotype corresponds to the one represented by
	 * this enum literal.
	 *
	 * @param stereotype the stereotype to compare with
	 * @return true if the stereotype matches this literal
	 */
	public boolean isEqual(Stereotype stereotype) {
		return contains(stereotype) && stereotype.getName().equalsIgnoreCase(this.readableName);
	}

	/**
	 * Checks whether the given Stereotype belongs to the EU AI Act compliance
	 * profile.
	 *
	 * @param stereotype the stereotype to check
	 * @return true if the stereotype is part of this profile
	 */
	public static boolean contains(Stereotype stereotype) {
		return (stereotype.getProfile().getDefinition().getNsURI().contains(DESCRIPTOR.getProfileName()));
	}

}