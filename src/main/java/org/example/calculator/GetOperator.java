package org.example.calculator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GetOperator implements GetCharacter{
    public String scan(){
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-","/","*","%"));
        System.out.println("Choose an operator:");
        operators.forEach(i->{ System.out.print(i+" "); });
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        ValidateOperator validation = new ValidateOperator();
        while(!validation.isValidOperator(op)){
            System.out.print("Reenter a valid operator: ");
            op = sc.nextLine();
        }
        return op;
    }
}
