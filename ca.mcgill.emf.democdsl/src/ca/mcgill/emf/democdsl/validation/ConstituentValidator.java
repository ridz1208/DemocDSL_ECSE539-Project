/**
 *
 * $Id$
 */
package ca.mcgill.emf.democdsl.validation;

import ca.mcgill.emf.democdsl.Belief;
import ca.mcgill.emf.democdsl.Constituent;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.mcgill.emf.democdsl.Constituent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConstituentValidator {
    boolean validate();

    boolean validateName(String value);
    boolean validateIndependence(int value);
    boolean validateAtomicConstituent(EList<Constituent> value);
    boolean validateBeliefs(EList<Belief> value);
}