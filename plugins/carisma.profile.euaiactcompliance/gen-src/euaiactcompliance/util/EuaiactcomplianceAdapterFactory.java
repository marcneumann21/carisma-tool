/**
 */
package euaiactcompliance.util;

import euaiactcompliance.AISystem;
import euaiactcompliance.AdministrationJusticeDemocracy;
import euaiactcompliance.BiometricCategorisation;
import euaiactcompliance.BiometricIdentification;
import euaiactcompliance.CriticalInfrastructure;
import euaiactcompliance.Education;
import euaiactcompliance.EmotionRecognition;
import euaiactcompliance.EssentialService;
import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.ExploitingHumanVulnerability;
import euaiactcompliance.FacialImageScraping;
import euaiactcompliance.HumanEmployment;
import euaiactcompliance.HumanInteraction;
import euaiactcompliance.LawEnforcement;
import euaiactcompliance.ManipulativeBehaviour;
import euaiactcompliance.MigrationBorder;
import euaiactcompliance.ProductEmbedding;
import euaiactcompliance.Profiling;
import euaiactcompliance.RiskManagementSystem;
import euaiactcompliance.SelfDevelopedModel;
import euaiactcompliance.SocialScoring;
import euaiactcompliance.SyntheticContent;
import euaiactcompliance.ThirdPartyComponent;
import euaiactcompliance.TrainingData;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see euaiactcompliance.EuaiactcompliancePackage
 * @generated
 */
public class EuaiactcomplianceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EuaiactcompliancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EuaiactcomplianceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EuaiactcompliancePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EuaiactcomplianceSwitch<Adapter> modelSwitch =
		new EuaiactcomplianceSwitch<Adapter>() {
			@Override
			public Adapter caseProfiling(Profiling object) {
				return createProfilingAdapter();
			}
			@Override
			public Adapter caseProductEmbedding(ProductEmbedding object) {
				return createProductEmbeddingAdapter();
			}
			@Override
			public Adapter caseHumanInteraction(HumanInteraction object) {
				return createHumanInteractionAdapter();
			}
			@Override
			public Adapter caseSyntheticContent(SyntheticContent object) {
				return createSyntheticContentAdapter();
			}
			@Override
			public Adapter caseManipulativeBehaviour(ManipulativeBehaviour object) {
				return createManipulativeBehaviourAdapter();
			}
			@Override
			public Adapter caseExploitingHumanVulnerability(ExploitingHumanVulnerability object) {
				return createExploitingHumanVulnerabilityAdapter();
			}
			@Override
			public Adapter caseSocialScoring(SocialScoring object) {
				return createSocialScoringAdapter();
			}
			@Override
			public Adapter caseFacialImageScraping(FacialImageScraping object) {
				return createFacialImageScrapingAdapter();
			}
			@Override
			public Adapter caseAISystem(AISystem object) {
				return createAISystemAdapter();
			}
			@Override
			public Adapter caseCriticalInfrastructure(CriticalInfrastructure object) {
				return createCriticalInfrastructureAdapter();
			}
			@Override
			public Adapter caseSelfDevelopedModel(SelfDevelopedModel object) {
				return createSelfDevelopedModelAdapter();
			}
			@Override
			public Adapter caseEducation(Education object) {
				return createEducationAdapter();
			}
			@Override
			public Adapter caseHumanEmployment(HumanEmployment object) {
				return createHumanEmploymentAdapter();
			}
			@Override
			public Adapter caseTrainingData(TrainingData object) {
				return createTrainingDataAdapter();
			}
			@Override
			public Adapter caseThirdPartyComponent(ThirdPartyComponent object) {
				return createThirdPartyComponentAdapter();
			}
			@Override
			public Adapter caseEssentialService(EssentialService object) {
				return createEssentialServiceAdapter();
			}
			@Override
			public Adapter caseLawEnforcement(LawEnforcement object) {
				return createLawEnforcementAdapter();
			}
			@Override
			public Adapter caseMigrationBorder(MigrationBorder object) {
				return createMigrationBorderAdapter();
			}
			@Override
			public Adapter caseAdministrationJusticeDemocracy(AdministrationJusticeDemocracy object) {
				return createAdministrationJusticeDemocracyAdapter();
			}
			@Override
			public Adapter caseBiometricIdentification(BiometricIdentification object) {
				return createBiometricIdentificationAdapter();
			}
			@Override
			public Adapter caseBiometricCategorisation(BiometricCategorisation object) {
				return createBiometricCategorisationAdapter();
			}
			@Override
			public Adapter caseEmotionRecognition(EmotionRecognition object) {
				return createEmotionRecognitionAdapter();
			}
			@Override
			public Adapter caseRiskManagementSystem(RiskManagementSystem object) {
				return createRiskManagementSystemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.Profiling <em>Profiling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.Profiling
	 * @generated
	 */
	public Adapter createProfilingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.ProductEmbedding <em>Product Embedding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.ProductEmbedding
	 * @generated
	 */
	public Adapter createProductEmbeddingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.HumanInteraction <em>Human Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.HumanInteraction
	 * @generated
	 */
	public Adapter createHumanInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.SyntheticContent <em>Synthetic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.SyntheticContent
	 * @generated
	 */
	public Adapter createSyntheticContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.ManipulativeBehaviour <em>Manipulative Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.ManipulativeBehaviour
	 * @generated
	 */
	public Adapter createManipulativeBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.ExploitingHumanVulnerability <em>Exploiting Human Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.ExploitingHumanVulnerability
	 * @generated
	 */
	public Adapter createExploitingHumanVulnerabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.SocialScoring <em>Social Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.SocialScoring
	 * @generated
	 */
	public Adapter createSocialScoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.FacialImageScraping <em>Facial Image Scraping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.FacialImageScraping
	 * @generated
	 */
	public Adapter createFacialImageScrapingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.AISystem <em>AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.AISystem
	 * @generated
	 */
	public Adapter createAISystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.CriticalInfrastructure <em>Critical Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.CriticalInfrastructure
	 * @generated
	 */
	public Adapter createCriticalInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.SelfDevelopedModel <em>Self Developed Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.SelfDevelopedModel
	 * @generated
	 */
	public Adapter createSelfDevelopedModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.Education <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.Education
	 * @generated
	 */
	public Adapter createEducationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.HumanEmployment <em>Human Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.HumanEmployment
	 * @generated
	 */
	public Adapter createHumanEmploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.TrainingData <em>Training Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.TrainingData
	 * @generated
	 */
	public Adapter createTrainingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.ThirdPartyComponent <em>Third Party Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.ThirdPartyComponent
	 * @generated
	 */
	public Adapter createThirdPartyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.EssentialService <em>Essential Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.EssentialService
	 * @generated
	 */
	public Adapter createEssentialServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.LawEnforcement <em>Law Enforcement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.LawEnforcement
	 * @generated
	 */
	public Adapter createLawEnforcementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.MigrationBorder <em>Migration Border</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.MigrationBorder
	 * @generated
	 */
	public Adapter createMigrationBorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.AdministrationJusticeDemocracy <em>Administration Justice Democracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.AdministrationJusticeDemocracy
	 * @generated
	 */
	public Adapter createAdministrationJusticeDemocracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.BiometricIdentification <em>Biometric Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.BiometricIdentification
	 * @generated
	 */
	public Adapter createBiometricIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.BiometricCategorisation <em>Biometric Categorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.BiometricCategorisation
	 * @generated
	 */
	public Adapter createBiometricCategorisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.EmotionRecognition <em>Emotion Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.EmotionRecognition
	 * @generated
	 */
	public Adapter createEmotionRecognitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.RiskManagementSystem <em>Risk Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.RiskManagementSystem
	 * @generated
	 */
	public Adapter createRiskManagementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EuaiactcomplianceAdapterFactory
