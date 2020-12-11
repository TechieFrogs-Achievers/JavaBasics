package Exceptions;

import javax.naming.NamingException;
//program to show multiple try and ctch blocks
public class Multiplehandlers {

    public static void main(String[] k) throws NamingException {
        //try block having complicated logic
        try {
            char[] ch = { 'c', 'v', 'i', 'o' };
            System.out.println(ch[2]);
            //nested try block
            try {
                System.out.println(ch[-3] / 0);
            } 
            //unable to catch any exception another block will handle it
            catch (NegativeArraySizeException e) {
                e.printStackTrace();
            } 
            finally {
                System.out.println("this is finally block");
            }
        }
        //exception handler
         catch (Exception a) {
            System.out.println(a);
        } 
        finally {
            //exception handler inside finally block
            try {  //try without catch

                System.out.println(30 / 0);
            }
            catch(Exception e){
                System.out.println("catch inside finally");
            }
            finally{
                System.out.println("final block");
            }
        }
        //statement out of handlers
        System.out.println("i am neeraja");
        }
    }
    

