package org.example.calculator;

public class ValidateOperator {
    public boolean isValidOperator(String oper){
        return switch(oper) {
            case "+", "-", "*", "/", "%" -> true;
            default -> false;
        };
    }
}
