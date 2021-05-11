package in.ruchitha.leetcode.easy.linkedlist_arrays.simple_interpreter_part_two.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Expr1Test {

    @Test
    public void testCaseEvalPlus(){
        Expr1 expr = new Expr1();
        int result = expr.evaluate("10+10");
        Assertions.assertEquals(20,result);
    }

    @Test
    public void testCaseEvalMinus(){
        Expr1 expr = new Expr1();
        int result = expr.evaluate("20-10");
        Assertions.assertEquals(10,result);
    }

    @Test
    public void testCaseEvalMultiply(){
        Expr1 expr = new Expr1();
        int result = expr.evaluate("20*10");
        Assertions.assertEquals(200,result);
    }

    @Test
    public void testCaseEvalDivide(){
        Expr1 expr = new Expr1();
        int result = expr.evaluate("20/10");
        Assertions.assertEquals(2,result);
    }

    @Test
    public void testCaseEvalIllegalInput() {
        // set up user
        Expr1 expr = new Expr1();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate("+1023"));
        Assertions.assertEquals("The input is invalid : Valid is : <int>operator<int> where <int> cab be any digit " +
                "and allowed operators are [+,-,*,/]", exception.getMessage());
    }

    @Test
    public void testCaseZeroDivideError() {
        Expr1 expr = new Expr1();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate("20/0"));
        Assertions.assertEquals("The input is invalid : Valid is : <int>/<int> where second <int> should be greater than 0", exception.getMessage());
    }

    @Test
    public void testCasePassingNullAsArgument() {
        Expr1 expr = new Expr1();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate(null));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }

    @Test
    public void testCasePassingEmptyStringAsInput() {
        Expr1 expr = new Expr1();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate(""));
        Assertions.assertEquals("Empty String not allowed", exception.getMessage());

    }

}
