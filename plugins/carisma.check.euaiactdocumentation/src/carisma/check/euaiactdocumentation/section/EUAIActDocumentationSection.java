package carisma.check.euaiactdocumentation.section;

public enum EUAIActDocumentationSection {
	
	GeneralDescriptionAISystem("Annex IV(1) General description of the AI system"),
	DetailedDescriptionAISystem("Annex IV(2) Detailed description of the elements and the development process of the AI system"),
	DetailedInformationAISystem("Annex IV(3) Detailed information about monitoring, functioning and control of the AI system"),
	DescriptionPerformanceMetrics("Annex IV(4) Description of the appropriateness of the performance metrics for the specifiy AI system"),
	DescriptionRiskManagement("Annex IV(5) Description of the risk management system according to Article 9"),
	DescriptionProviderRelevantChanges("Annex IV(6) Description of relevant changes made by the provider to the AI system through its lifecycle"),
	ListHarmonisedStandards("Annex IV(7) List of the harmonised standards applied in full or in part"),
	CopyEUConformityDeclaration("Annex IV(8) Copy of the EU declaration of conformity according to Article 47"),
	DescriptionAISystemPostMarketPhase("Annex IV(9) Detailed description to evaluate the AI systems performance in the post-market phase"), 
	TransparencyObligations("Article 50 Transparency obligations for providers and deployers");

	private final String readableName;

	private EUAIActDocumentationSection(String readableName) {
		this.readableName = readableName;
	}

	@Override
	public String toString() {
		return readableName.toUpperCase() + ":";
	}
}
