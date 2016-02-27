package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		@Test
		public void isEvenTest() {
			MyInteger a = new MyInteger(66);
			MyInteger b = new MyInteger(73);	
			assertTrue(a.isEven());
			assertFalse(b.isEven());
		}

		@Test
		public void isOddTest() {
			MyInteger a = new MyInteger(47);
			MyInteger b = new MyInteger(88);	
			assertTrue(a.isOdd());
			assertFalse(b.isOdd());

		}

		@Test
		public void isPrimeTest() {
			MyInteger a = new MyInteger(100030001);
			MyInteger b = new MyInteger(999999999);	
			assertTrue(a.isPrime());
			assertFalse(b.isPrime());

		}

		
		@Test
		public void isEvenValTest(){
			assertTrue(MyInteger.isEven(666));
			assertFalse(MyInteger.isEven(667));
		}
		
		@Test
		public void isOddValTest() {
			assertTrue(MyInteger.isOdd(667));
			assertFalse(MyInteger.isOdd(666));
		}
		
		@Test
		public void isPrimeValTest() {
			assertTrue(MyInteger.isPrime(100707001));
			assertFalse(MyInteger.isPrime(10000000));
		}

		// 
		@Test
		public void isEvenMyIntegerTest() {
			MyInteger a = new MyInteger(4444);
			MyInteger b = new MyInteger(3737);	
			assertTrue(a.isEven());
			assertFalse(b.isEven());
		}
		
		@Test
		public void isOddMyIntegerTest() {
			MyInteger a = new MyInteger(667);
			MyInteger b = new MyInteger(668);	
			assertTrue(a.isOdd());
			assertFalse(b.isOdd());
		}
		
		@Test
		public void isPrimeMyIntegerTest() {
			MyInteger a = new MyInteger(100999001);
			MyInteger b = new MyInteger(700000000);	
			assertTrue(a.isPrime());
			assertFalse(b.isPrime());
		}
		
		
		//
		@Test
		public void equalsValTest() {
			MyInteger val = new MyInteger(777);
			assertTrue(val.equals(777));
			assertFalse(val.equals(666));
		}
		
		public void equalsMyIntegerTest() {
			MyInteger val1 = new MyInteger(888);
			MyInteger val2 = new MyInteger(888);
			MyInteger val3 = new MyInteger(999);
			assertTrue(val1.equals(val2));
			assertFalse(val1.equals(val3));
		}

}
