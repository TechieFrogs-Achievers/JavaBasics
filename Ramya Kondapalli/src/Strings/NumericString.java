package Strings;

import java.util.Random;

public class NumericString {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("ramya");

        Random r = new Random(); //creating object to random class

        sb.append(r.nextInt());  //appending integer values to stirng

        System.out.println(sb);   //it prints alphanumeric string
    }
}
