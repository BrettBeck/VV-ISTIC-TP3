package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static fr.istic.vv.StringUtils.isBalanced;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {


    @Test
    public void test1() {
        assertTrue(isBalanced("()"));
    }


    @Test
    public void test2() {
        assertTrue(isBalanced("{}"));
    }

    @Test
    public void test3() {
        assertTrue(isBalanced("[]"));
    }

    @Test
    public void test4() {
        assertTrue(isBalanced("([])"));
    }

    @Test
    public void test5() {
        assertTrue(isBalanced("[()]"));
    }

    @Test
    public void test6() {
        assertTrue(isBalanced("{[]}"));
    }

    @Test
    public void test7() {
        assertTrue(isBalanced("(())"));
    }

    @Test
    public void test8() {
        assertTrue(isBalanced("(a)"));
    }

    @Test
    public void test9() {
        assertTrue(isBalanced("{a}"));
    }

    @Test
    public void test10() {
        assertTrue(isBalanced("(a[]a)"));
    }

    @Test
    public void test11() {
        assertTrue(isBalanced("[(a)]"));
    }

    @Test
    public void test12() {
        assertTrue(isBalanced("a{a[a]a}a"));
    }

    @Test
    public void test13() {
        assertTrue(isBalanced("a(())a"));
    }

    @Test
    public void testfalse1() {
        assertFalse(isBalanced("("));
    }

    @Test
    public void testfalse2() {
        assertFalse(isBalanced(")"));
    }

    @Test
    public void testfalse3() {
        assertFalse(isBalanced("{"));
    }

    @Test
    public void testfalse4() {
        assertFalse(isBalanced("}"));
    }

    @Test
    public void testfalse5() {
        assertFalse(isBalanced("(})"));
    }

    @Test
    public void testfalse6() {
        assertFalse(isBalanced("{{"));
    }

    @Test
    public void testfalse7() {
        assertFalse(isBalanced("(){"));
    }

    @Test
    public void testfalse8() {
        assertFalse(isBalanced("()()()(a"));
    }

    @Test
    public void testfalse9() {
        assertFalse(isBalanced("(a"));
    }

    @Test
    public void testfalse10() {
        assertFalse(isBalanced("a}a"));
    }

    @Test
    public void testfalse11() {
        assertFalse(isBalanced("([a)"));
    }

    @Test
    public void testfalse12() {
        assertFalse(isBalanced("{{a"));
    }

    @Test
    public void testfalse13() {
        assertFalse(isBalanced("()(a)((a"));
    }

    @Test
    public void testLimit1() {
        assertFalse(isBalanced(null));
    }

    @Test
    public void testLimit2() {
        assertTrue(isBalanced("8"));
    }

    @Test
    public void testLimit3() {
        assertTrue(isBalanced(""));
    }

    @Test
    public void testLimit4() {
        assertTrue(isBalanced("'"));
    }

    @Test
    public void testLimit5() {
        assertTrue(isBalanced("~"));
    }

    @Test
    public void testLimit6() {
        assertTrue(isBalanced("\\(a)"));
    }
}