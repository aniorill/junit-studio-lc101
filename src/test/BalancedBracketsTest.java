package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void doubleBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void onlyOneFrontBracketReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyOneEndBracketReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void onlyFrontBracketsReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[[[[["));
    }
    @Test
    public void onlyEndBracketsReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]]]]]]"));
    }
    @Test
    public void doubleFrontOneBackReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void doubleBackOneFrontReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]]["));
    }
    @Test
    public void matchedPairPlusOneReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[]]"));
    }
    @Test
    public void matchedPairWithNonBracketCharactersReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void unmatchedPairWithNonBracketCharactersReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }
    @Test
    public void misorderedPairReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void misorderedPairsReturnsFalse() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("][]["));
    }


}
