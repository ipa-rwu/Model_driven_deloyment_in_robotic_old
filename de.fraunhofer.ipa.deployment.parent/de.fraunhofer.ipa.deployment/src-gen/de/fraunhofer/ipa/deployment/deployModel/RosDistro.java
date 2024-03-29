/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ros Distro</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getRosDistro()
 * @model
 * @generated
 */
public enum RosDistro implements Enumerator
{
  /**
   * The '<em><b>Melodic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MELODIC_VALUE
   * @generated
   * @ordered
   */
  MELODIC(0, "melodic", "melodic"),

  /**
   * The '<em><b>Noetic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOETIC_VALUE
   * @generated
   * @ordered
   */
  NOETIC(1, "noetic", "noetic"),

  /**
   * The '<em><b>Foxy</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOXY_VALUE
   * @generated
   * @ordered
   */
  FOXY(2, "foxy", "foxy"),

  /**
   * The '<em><b>Galactic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GALACTIC_VALUE
   * @generated
   * @ordered
   */
  GALACTIC(3, "galactic", "galactic");

  /**
   * The '<em><b>Melodic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MELODIC
   * @model name="melodic"
   * @generated
   * @ordered
   */
  public static final int MELODIC_VALUE = 0;

  /**
   * The '<em><b>Noetic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOETIC
   * @model name="noetic"
   * @generated
   * @ordered
   */
  public static final int NOETIC_VALUE = 1;

  /**
   * The '<em><b>Foxy</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOXY
   * @model name="foxy"
   * @generated
   * @ordered
   */
  public static final int FOXY_VALUE = 2;

  /**
   * The '<em><b>Galactic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GALACTIC
   * @model name="galactic"
   * @generated
   * @ordered
   */
  public static final int GALACTIC_VALUE = 3;

  /**
   * An array of all the '<em><b>Ros Distro</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RosDistro[] VALUES_ARRAY =
    new RosDistro[]
    {
      MELODIC,
      NOETIC,
      FOXY,
      GALACTIC,
    };

  /**
   * A public read-only list of all the '<em><b>Ros Distro</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RosDistro> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Ros Distro</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RosDistro get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RosDistro result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Ros Distro</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RosDistro getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RosDistro result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Ros Distro</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RosDistro get(int value)
  {
    switch (value)
    {
      case MELODIC_VALUE: return MELODIC;
      case NOETIC_VALUE: return NOETIC;
      case FOXY_VALUE: return FOXY;
      case GALACTIC_VALUE: return GALACTIC;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private RosDistro(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //RosDistro
