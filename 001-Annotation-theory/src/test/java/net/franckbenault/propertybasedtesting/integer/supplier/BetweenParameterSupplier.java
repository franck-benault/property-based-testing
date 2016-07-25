package net.franckbenault.propertybasedtesting.integer.supplier;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.PotentialAssignment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class BetweenParameterSupplier extends ParameterSupplier {


	// The annotation for input parameters:
	@Retention(RetentionPolicy.RUNTIME)
	@ParametersSuppliedBy(BetweenParameterSupplier.class)
	public @interface Between {

		int first();

		int last();
	}

	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		List<PotentialAssignment> list = new ArrayList<PotentialAssignment>();
		Between annotation = (Between) sig.getAnnotation(Between.class);
		for (int i = annotation.first(); i <= annotation.last(); i++)
			list.add(PotentialAssignment.forValue("ints", i));
		return list;
	}


}
