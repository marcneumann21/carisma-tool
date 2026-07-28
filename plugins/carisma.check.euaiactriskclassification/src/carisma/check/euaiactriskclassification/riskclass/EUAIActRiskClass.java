package carisma.check.euaiactriskclassification.riskclass;

/**
 * Risk classes of the EU AI Act in the context of the risk classification
 * check.
 *
 * @author Marc Neumann
 */
public enum EUAIActRiskClass {
	Unacceptable("Unnacceptable Risk (Article 5)"), High("High Risk (Article 6 and Annex I/III)"),
	Limited("Limited Risk (Article 50)"), Minimal("Minimal Risk"), Undetermined("No Risk Class appliciable");

	private final String readableName;

	EUAIActRiskClass(String readableName) {
		this.readableName = readableName;
	}

	@Override
	public String toString() {
		return readableName;
	}
}