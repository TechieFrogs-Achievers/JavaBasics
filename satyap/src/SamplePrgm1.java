public class SamplePrgm1 {
    // Addition of two interger numbers
    public static void main(String args[])
    {
    int a=30,b=20;
    int c=a+b;
    System.out.println(" Sum of two numbers is:" +c);


  // compute Quotient and Remainder
    int quotient=a/b;
    int remainder=a%b;
    System.out.println("Quotient of two numbers:"+quotient);
    System.out.println("Remainder of two numbers:"+remainder);
    
 // Swapping of two numbers
    int t;
    t=a;
    a=b;
    b=t; 
    System.out.println(a+" "+b);

 // Number is even or odd
    if(a%2==0){
        System.out.println( a+" " + "is Even ");
    }  
    else{
        System.out.println( a+" " + "is odd ");
    }

 // Largest among of three numbers
    int p=60;
    int q=45;
    int r=50;
    if(p>q){
        System.out.println(p+" "+" is largest");

    }  
    else if(q>r){
        System.out.println( q+" "+" is largest");
    }
    else if(r>p){
        System.out.println(r+" "+" is largest");
    }
    else{
        System.out.println("Invalid");
    }

  // Given number is an alphabet or not

    char alphabet='#';
    if((alphabet>='a' && alphabet<='z')|| (alphabet>='A' && alphabet<='Z')){
        System.out.println(alphabet+" "+"is an alphabet");

    }
    else{
        System.out.println(alphabet+" "+"is not an alphabet");
    }

  // Factorial of a number
    int n=5;
    long fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
        System.out.println(fact);
    }

  
}
}


    

