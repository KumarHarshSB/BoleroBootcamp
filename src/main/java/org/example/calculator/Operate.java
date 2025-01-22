package org.example.calculator;

public class Operate {
    public static void operation(double num1, double num2, String operator){
        double res=switch (operator) {
                       case "+" -> (num1 + num2);
                       case "-" -> (num1 - num2);
                       case "*" -> (num1 * num2);
                       case "/" -> (num1 / num2);
                       case "%" -> (num1 % num2);
                       default -> 0;
                   };
        System.out.println("Output: "+res);
    }
}
