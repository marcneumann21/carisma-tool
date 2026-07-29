package carisma.check.euaiactdocumentation.section;

public enum EUAIActDocumentationSection {
	
	GeneralDescriptionAISystem("General description of the AI system"),
	DetailedDescriptionAISystem("Detailed description of the elements and the development process"),
	DetailedInformationAISystem("Detailed information about monitoring, functioning and control"),
	DescriptionPerformanceMetrics("Appropriateness of the performance metrics"),
	DescriptionRiskManagement("Description of the risk management system according to Article 9"),
	DescriptionProviderRelevantChanges("Relevant changes made by the provider through the lifecycle"),
	ListHarmonisedStandards("List of the applied harmonised standards"),
	CopyEUConformityDeclaration("Copy of the EU declaration of conformity according to Article 47"),
	DescriptionAISystemPostMarketPhase("System to evaluate the performance in the post-market phase");

	private final String readableName;

	private EUAIActDocumentationSection(String readableName) {
		this.readableName = readableName;
	}

	@Override
	public String toString() {
		return readableName;
	}
}
