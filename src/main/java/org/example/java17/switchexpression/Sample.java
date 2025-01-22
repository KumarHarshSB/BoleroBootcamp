package org.example.java17.switchexpression;

public class Sample {

    public static String Process(int a ){
        return switch(a) {
            case 1-> "one";
            case 2,3-> "two or three";
            case 4-> {
                System.out.println("called");
                yield "four";
            }
            default -> "unmatched";
        };
    }
    public static void main(String args[]){
        System.out.println(Process(1));
        System.out.println(Process(2));
        System.out.println(Process(3));
        System.out.println(Process(4));
    }
}
