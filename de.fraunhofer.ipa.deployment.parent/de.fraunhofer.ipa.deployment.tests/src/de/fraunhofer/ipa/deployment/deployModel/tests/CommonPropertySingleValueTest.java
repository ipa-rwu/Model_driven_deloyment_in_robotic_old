/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.tests;

import de.fraunhofer.ipa.deployment.deployModel.CommonPropertySingleValue;
import de.fraunhofer.ipa.deployment.deployModel.DeployModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Common Property Single Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonPropertySingleValueTest extends PropertyExpressTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommonPropertySingleValueTest.class);
	}

	/**
	 * Constructs a new Common Property Single Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPropertySingleValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Common Property Single Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommonPropertySingleValue getFixture() {
		return (CommonPropertySingleValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeployModelFactory.eINSTANCE.createCommonPropertySingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CommonPropertySingleValueTest