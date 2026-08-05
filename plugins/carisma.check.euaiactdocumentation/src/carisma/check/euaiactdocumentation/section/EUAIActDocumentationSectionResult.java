package carisma.check.euaiactdocumentation.section;

import java.util.List;

//TODO JavaDoc
/**
 * Data container for the documentation.
 *
 */
public record EUAIActDocumentationSectionResult(EUAIActDocumentationSection sectionName,
		List<String> foundDocumentation, List<String> missingDocumentation, List<String> notes) {
};
