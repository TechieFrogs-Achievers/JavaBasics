package mypackage;//creating a package or folder

 //creating a class in package
public class Compare {
  int num1, num2;
 //constructor to initialize instance variables
  Compare(int n, int m) {
     num1 = n;
     num2 = m;
}
//method to check max no
public void getmax(){
    if ( num1 > num2 ) {
        System.out.println("Maximum value of two numbers is " + num1);
  }
    else {
        System.out.println("Maximum value of two numbers is " + num2);
    }
}
 
 
public static void main(String args[]) {
    //instantiation of a class
        Compare current = new Compare(4,6);
         current.getmax();
              }
       }
