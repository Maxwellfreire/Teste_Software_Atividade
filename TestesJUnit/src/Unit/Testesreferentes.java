package Unit;

import org.junit.Assert;
import org.junit.Test;

public class Testesreferentes {

	@Test
	public void testConverteFahrenheitParaCelsius() {

		Assert.assertEquals(1.66667, ConversorTemperatura.converteFahrenheitParaCelsius(35.0), 0.1);

	}
	@Test
	public void testConverteCelsiusParaFahrenheit() {

		Assert.assertEquals(10.0, ConversorTemperatura.converteFahrenheitParaCelsius(50.0), 0.0);

	}

	//public void testConverteCelsiusParaFahrenheit() {

		//TemperaturaCelsius instance = new TemperaturaCelsius(0);
		//double expResult = 32.0;

	//}

}
