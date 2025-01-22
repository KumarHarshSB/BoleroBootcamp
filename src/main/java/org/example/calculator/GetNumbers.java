package org.example.calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNumbers implements GetInput {
    public List<Double> scan(){
        List<Double> list = new ArrayList<>();
        System.out.println("Enter two numbers:");

        Scanner sc = new Scanner(System.in);

        while(list.size()<2) {
            try {
                String num = sc.nextLine();
                double val = Double.parseDouble(num);
                list.add(val);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return list;
    }
}
