package org.example.calculator;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static void main(String args[]){
        boolean open = true;
        while(open){
            GetInput input = new GetNumbers();
            List<Double> numbers= input.scan();
            double num1 =numbers.get(0);
            double num2 =numbers.get(1);

            GetCharacter character = new GetOperator();
            String operator = character.scan();

            Exception exception = new LogicalException();
            if(exception.handle(num1,num2,operator))
                continue;

            Operate.operation(num1,num2,operator);

            System.out.println("Enter STOP to close the calculator or press Enter to continue.");
            Scanner scanner = new Scanner(System.in);
            if("STOP".equalsIgnoreCase(scanner.nextLine())) open=false;
        }
    }
}
