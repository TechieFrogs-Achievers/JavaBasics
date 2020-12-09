package Strings;

import java.util.Scanner;

public class Random 
{
    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         String string=sc.nextLine();
       // String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer(string); // create random string builder
       
        Random random = new Random();     // create an object of Random class
         //int length = 7; //// specify length of random string
         for(int i = 0; i < string.length(); i++) 
         {
            // String alphabet;
             int index = random.nextInt(string.length());// generate random index number
          char randomChar = string.charAt(index);//// get character specified by indexv from string
          sb.append(randomChar); /// append the character to string builder
         }
           String randomString = sb.toString();
           System.out.println("Random String is: " + randomString);
           sc.close();
         }

         int nextInt(int length) {
             return 0;
         }
    
      }

    
