package carisma.profile.euaiactcompliance;

import org.eclipse.uml2.uml.Stereotype;

import carisma.modeltype.uml2.CarismaProfileDescriptor;

public enum EUAIActCompliance {

	// AI System
	AISystem("AISystem"),

	// Actors
	Provider("Provider"), Deployer("Deployer"), AffectedPerson("AffectedPerson"),

	// Actor associations
	Operates("Operates"), AffectedBy("AffectedBy"),

	// Documentation dependency
	Documents("Documents"),

	// Unacceptable Risk
	ManipulativeBehaviour("ManipulativeBehaviour"), ExploitingVulnerability("ExploitingVulnerability"),
	SocialScoring("SocialScoring"), PredictivePolicing("PredictivePolicing"), FacialRecognition("FacialRecognition"),
	EmotionRecognition("EmotionRecognition"), BiometricCategorisation("BiometricCategorisation"),
	BiometricIdentification("BiometricIdentification"),

	// High Risk
	SafetyComponent("SafetyComponent"), AnnexIIIUseCase("AnnexIIIUseCase"), Profiling("Profiling"),

	// Limited Risk
	HumanInteraction("HumanInteraction"), SyntheticContent("SyntheticContent"),
	EmotionRecognitionNotification("EmotionRecognitionNotification"), Deepfake("Deepfake"),
	PublicInterestText("PublicInterestText"),
	BiometricCategorizationNotification("BiometricCategorizationNotification"),

	// Documentation
	GeneralDescriptionAISystem("GeneralDescriptionAISystem"),
	DetailedDescriptionAISystem("DetailedDescriptionAISystem"),
	DetailedInformationAISystem("DetailedInformationAISystem"),
	DescriptionPerformanceMetrics("DescriptionPerformanceMetrics"),
	DescriptionRiskManagement("DescriptionRiskManagement"),
	DescriptionProviderRelevantChanges("DescriptionProviderRelevantChanges"),
	ListHarmonisedStandards("ListHarmonisedStandards"), CopyEUConformityDeclaration("CopyEUConformityDeclaration"),
	DescriptionAISystemPostMarketPhase("DescriptionAISystemPostMarketPhase"),
	
	// Documentation Limited Risk
	TransparencyObligation("TransparencyObligation");

	private static final String PROFILE_NAME = "euaiactcompliance";
	private static final String PROFILE_VERSION = "1";
	private static final String PROFILE_URI = "platform:/carisma.profile.euaiactcompliance/profile/euaiactcompliance.profile.uml";

	public static final CarismaProfileDescriptor DESCRIPTOR = new CarismaProfileDescriptor(PROFILE_NAME,
			PROFILE_VERSION, PROFILE_URI);

	private final String readableName;

	private EUAIActCompliance(final String newName) {
		readableName = newName;
	}

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
	 * @param stereotype
	 * @return
	 */
	public boolean isEqual(Stereotype stereotype) {
		return contains(stereotype) && stereotype.getName().equalsIgnoreCase(this.readableName);
	}

	/**
	 * Checks whether the given Stereotype is a UMLsec stereotype.
	 * 
	 * @param stereotype
	 * @return
	 */
	public static boolean contains(Stereotype stereotype) {
		return (stereotype.getProfile().getDefinition().getNsURI().contains(DESCRIPTOR.getProfileName()));
	}

}
