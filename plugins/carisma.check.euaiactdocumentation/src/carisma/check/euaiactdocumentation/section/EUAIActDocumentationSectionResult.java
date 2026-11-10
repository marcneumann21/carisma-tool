package carisma.check.euaiactdocumentation.section;

import java.util.List;

/**
 * Data container for the result of one section of the documentation.
 *
 * @param sectionName          the section of Annex IV
 * @param foundDocumentation   list of the documentation found in the model
 * @param missingDocumentation list of the missing documentation
 * @param notes                list of the notes
 */
public record EUAIActDocumentationSectionResult(EUAIActDocumentationSection sectionName,
		List<String> foundDocumentation, List<String> missingDocumentation, List<String> notes) {
};
