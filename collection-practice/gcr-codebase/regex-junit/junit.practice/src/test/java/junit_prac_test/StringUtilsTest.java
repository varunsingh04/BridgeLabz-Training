package junit_prac_test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import junit_prac.StringUtils;

public class StringUtilsTest {

    // create object of stringutils class
    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void testPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(utils.isPalindrome("java"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("JAVA", utils.toUpperCase("java"));
    }
}

