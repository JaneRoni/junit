package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;

import by.academy.After;
import by.academy.AfterClass;
import by.academy.Before;
import by.academy.BeforeClass;


	
	public class MachTest extends Assert {

		@BeforeClass
		public void BeforeClass() {
			System.out.println("Before Class");
		}

		@AfterClass
		public void AfterClass() {
			System.out.println("After Class");
		}

		@Before
		public void Befores() {
			System.out.println("Before ");
		}

		@After
		public void After() {
			System.out.println("After");
		}

		@Test
		public void assertEquals() {
			System.out.println("@Test assertEquals 2+2=4");
			assertEquals(Math.min(2, 3), 3,5);
		}

		@Test(timeout = 100)
		public void timeoutTest() {
			for (int i = 0; i < 100; i++) {
				System.out.println("���� �� �������");
			}
		}

		@Test(expected = ArithmeticException.class)
		public void testMathDivide() {

			System.out.println("���� �� �������");
//				int[] a = 
		}

		@Test(expected = ArithmeticException.class)
		public void testIgnore() {

			System.out.println("���� �� �������");
//				int[] a = 

		}
		
	}


