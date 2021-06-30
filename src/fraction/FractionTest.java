package fraction;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

	@Test
	public void testFraction_1() {
		new Fraction(3, 5);
	}
	
	//Testing if the denominator is equal to 0
	@Test(expected=IllegalArgumentException.class)
	public void testFraction_2() {
		new Fraction(5, 0);
	}
	
	@Test
	public void testSum() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,5);
		Fraction result = f1.sum(f2);
		
		//Testing if the result of the multiplication is right
		assertEquals(new Fraction(4, 7), result);
	}
	
	@Test
	public void testSub() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,5);
		Fraction result = f1.sub(f2);
		
		//Testing if the result of the multiplication is right
		assertEquals(new Fraction(-2, -3), result);
	}
		
	@Test
	public void testMult() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,5);
		Fraction result = f1.mult(f2);
		
		//Testing if the result of the multiplication is right
		assertEquals(new Fraction(3, 10), result);
	}
	
	@Test
	public void testDiv() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,2);
		Fraction result = f1.div(f2);
		
		//Testing if the result of the multiplication is right
		assertEquals(new Fraction(1, 1), result);
	}
	
	@Test
	public void testEquals() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,2);
		Fraction f3 = new Fraction(3,5);
		
		assertEquals(f1, f1);
		assertEquals(f1, f2);
		assertFalse(f1.equals(f3));
	}
	
}
