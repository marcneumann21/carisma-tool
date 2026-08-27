package carisma.check.euaiactdocumentation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Model;
import org.junit.After;
import org.junit.Test;

import carisma.check.euaiactdocumentation.check.EUAIActDocumentationCheck;
import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSection;
import carisma.core.analysis.AnalysisHost;
import carisma.core.analysis.RegisterInUseException;
import carisma.core.analysis.RegisterNotInUseException;
import carisma.core.analysis.UserAbortedAnalysisException;
import carisma.core.analysis.result.AnalysisResultMessage;
import carisma.tests.modelutils.uml.TestHelper;

/**
 * JUnit tests for the EU AI Act documentation check.
 * 
 * @author Marc Neumann
 *
 */
@SuppressWarnings("java:S5960")
public class EUAIActDocumentationTest {

	/**
	 * MokHost to save and deliver the model and to collect the report messages.
	 *
	 * @author Marc Neumann
	 *
	 */
	private class TestHost implements AnalysisHost {

		@Override
		public void addResultMessage(final AnalysisResultMessage detail) {
			System.out.println(detail.getText());
		}

		@Override
		public void appendToReport(final String text) {
			System.out.println(text);
		}

		@Override
		public void appendLineToReport(final String text) {
			System.out.println(text);
		}

		@Override
		public Resource getAnalyzedModel() {
			if (model != null) {
				return model.eResource();
			} else {
				return null;
			}
		}

		@Override
		public String getCurrentModelFilename() {
			return model.eResource().getURI().toFileString();
		}

		@Override
		public void putToRegister(final String registerName, final Object data) throws RegisterInUseException {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isRegisterInUse(final String registerName) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object getFromRegister(final String registerName) throws RegisterNotInUseException {
			return null;
		}

		@Override
		public Object removeFromRegister(final String registerName) throws RegisterNotInUseException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void displayError(final String message) {
			// TODO Auto-generated method stub
			System.out.println(message);
		}

		@Override
		public File getFileToBeWritten(final File file) throws UserAbortedAnalysisException {
			// TODO Auto-generated method stub
			return file;
		}

	}

	/**
	 * the path to the testmodel.
	 */
	private String filepath = "resources/models/";

	/**
	 * the test model.
	 */
	private Model model;

	/**
	 * Unloads the model.
	 */
	@After
	public final void cleanUp() {
		if (this.model != null) {
			TestHelper.unloadModel(this.model);
			this.model = null;
		}
	}

}