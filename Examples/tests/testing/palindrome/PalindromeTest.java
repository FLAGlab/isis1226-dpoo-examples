package testing.palindrome;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import testing.coverage.Palindrome;

public class PalindromeTest {
	
	@Test
	public void testEmptyString() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
}
