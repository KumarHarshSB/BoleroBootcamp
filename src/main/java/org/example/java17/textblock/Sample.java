package org.example.java17.textblock;

public class Sample {
    public static void main(String args[]){
        String str = """
        Nitai Gaur
            Radhe Shyam      \s
        Hare Krishna
            Hare Rama""";
        System.out.println(str.replaceAll(" ","~"));
    }
}
