package org.example.calculator;

public class LogicalException implements Exception{
    public boolean handle(double num1, double num2,String operator){
        return switch(operator){
            case "/","%" -> {
                if (num2 == 0) {
                    System.out.println("Divide by zero exception");
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }
}
