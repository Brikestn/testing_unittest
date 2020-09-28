package com.unittest.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	
Fahrenheit object;
	
	@Before
	public void newClassFahrenheit() {
		object = new Fahrenheit(); 
	}
	
	@Test
	public void testResult0Input0() {
		double input = 0;
		double expected = 0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResult1000Input1000() {
		double input = 1000;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResultMinus1000InputMinus1000() {
		double input = -1000;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected, actual, 2);
	}
	
	@Test
	public void testResultTrueInput0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinus1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinas2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinas1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinas1001() {
		double input = -1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinas999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinas501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinas500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinas499() {
		double input = -499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInputMinas1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResultTrueInput1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	
//	@Test
//	public void pub() {
//		assertEquals(1, 1);
//	}
//	@Test
//	  public void testAssertArrayEquals() {
//		int[] expected = {1,2,3,4,5};
//		int[] actual = {1,2,3,4,5};
//	    assertArrayEquals(expected, actual);
//	  }
//
//	  @Test
//	  public void testAssertEquals() {
//	    assertEquals("failure - strings are not equal", "text", "text");
//	  }
//
//	  @Test
//	  public void testAssertFalse() {
//	    assertFalse("failure - should be false", false);
//	  }
//
//	  @Test
//	  public void testAssertNotNull() {
//	    assertNotNull("should not be null", new Object());
//	  }
//
//	  @Test
//	  public void testAssertNotSame() {
//	    assertNotSame("should not be same Object", new Object(), new Object());
//	  }
//
//	  @Test
//	  public void testAssertNull() {
//	    assertNull("should be null", null);
//	  }
//
//	  @Test
//	  public void testAssertSame() {
//	    Integer aNumber = Integer.valueOf(768);
//	    assertSame("should be same", aNumber, aNumber);
//	  }
//
//	  // JUnit Matchers assertThat
//	  @Test
//	  public void testAssertThatBothContainsString() {
//	    assertThat("albumen", both(containsString("a")).and(containsString("b")));
//	  }
//
//	  @Test
//	  public void testAssertThatHasItems() {
//	    assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
//	  }
//
//	  @Test
//	  public void testAssertThatEveryItemContainsString() {
//	    assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
//	  }
//
//	  @Test
//	  public void testAssertTrue() {
//	    assertTrue("failure - should be true", true);
//	  }

	  
}
