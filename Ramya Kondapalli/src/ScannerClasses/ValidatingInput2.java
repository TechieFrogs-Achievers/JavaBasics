package ScannerClasses;

import java.util.Scanner;

public class ValidatingInput2 {
    public static void main(String[] args) {
        //String str = "Ramya";
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        //System.out.println("Name :" + str);
        boolean b=false;
        //int n= s.nextInt();
        for(;s.hasNextInt()==true;){
            
            if(b==true){
                System.out.println("Yeah! It is Integer" );
                break;
            }
            else {
                System.out.println("That's not correct number");
                b =  s.hasNextInt();
            }
            s.close();
        }
        //System.out.println("Number :" + n);
        
    }
}
