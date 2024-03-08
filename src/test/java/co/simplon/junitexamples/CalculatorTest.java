package co.simplon.junitexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest {

	@ParameterizedTest
	@MethodSource("doubleProvider")

	void shouldDivide(double a, double b, double expected) {
		double actual = Calculator.divide(a,b);

		assertEquals(expected, actual);
		// Double.MIN_VALUE, Double.MAX_VALUE
		//4/2
		//0/2
		//0/0
		//2/0 > positif infinity
		//Nan not a number > 0/0
		//-2/0 > negatif infinity
		// -4/2, -4/1, 4/-1, 
	}
	
	public static Stream<Arguments> doubleProvider() {
        return Stream.of(
                Arguments.of(4.0, 2.0, 2.0),
                Arguments.of(0.0, 0.0, Double.NaN)
                // Add more test cases as needed
        );
    }
}
