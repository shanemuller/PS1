package PS2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void isEven_Test1() {
		int iValue = 2;
		MyInteger MyInt = new MyInteger(iValue);
		
		assertTrue(MyInt.isEven());
		assertTrue(MyInteger.isEven(iValue));
		assertTrue(MyInteger.isEven(MyInt));
	}
	@Test
	public void isEven_Test2() {
		int iValue = 3;
		MyInteger MyInt = new MyInteger(iValue);
		
		assertFalse(MyInt.isEven());
		assertFalse(MyInteger.isEven(iValue));
		assertFalse(MyInteger.isEven(MyInt));
	}
	
	@Test
	public void isOdd_Test1() {
		int iValue = 3;
		MyInteger MyInt = new MyInteger(iValue);
		
		assertTrue(MyInt.isOdd());
		assertTrue(MyInteger.isOdd(iValue));
		assertTrue(MyInteger.isOdd(MyInt));
	}
	@Test
	public void isOdd_Test2() {
		int iValue = 4;
		MyInteger MyInt = new MyInteger(iValue);
		
		assertFalse(MyInt.isOdd());
		assertFalse(MyInteger.isOdd(iValue));
		assertFalse(MyInteger.isOdd(MyInt));
	}
	
	@Test
	public void isPrime_Test1() {
		int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		for(int i: primeNums) {
			MyInteger MyInt = new MyInteger(i);
			
			assertTrue(MyInt.isPrime());
			assertTrue(MyInteger.isPrime(i));
			assertTrue(MyInteger.isPrime(MyInt));
		}
	}
	@Test
	public void isPrime_Test2() {
		int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		boolean isFound = false;
		for(int i: primeNums) {
			for(int ix = 2; i < 100; i++) {
				if(ix == i) {
					isFound = true;
				}
			}
			if (!isFound) {
				MyInteger MyInt = new MyInteger(i);
				
				assertFalse(MyInt.isPrime());
				assertFalse(MyInteger.isPrime(i));
				assertFalse(MyInteger.isPrime(MyInt));
			}
		}
	}
	
	@Test
	public void isEqual_Test1() {
		int iValue = 3;
		MyInteger MyInt = new MyInteger(iValue);
		
		int iValue2 = 3;
		MyInteger MyInt2 = new MyInteger(iValue2);
		
		assertTrue(MyInt.isEquals(iValue2));
		assertTrue(MyInt.isEquals(MyInt2));
	}
	@Test
	public void isEqual_Test2() {
		int iValue = 3;
		MyInteger MyInt = new MyInteger(iValue);
		
		int iValue2 = 4;
		MyInteger MyInt2 = new MyInteger(iValue2);
		
		assertFalse(MyInt.isEquals(iValue2));
		assertFalse(MyInt.isEquals(MyInt2));
	}
}
