package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumResult = sum(1);
        int minusResult = minus(2);
        int divideResult = calculator.divide(3);
        int multiplyResult = calculator.multiply(4);
        int sumAllResult = calculator.sumAllOperation(5);

        System.out.println("Sum: " + sumResult);
        System.out.println("Minus: " + minusResult);
        System.out.println("Divide: " + divideResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Sum all operations: " + sumAllResult);
    }
}