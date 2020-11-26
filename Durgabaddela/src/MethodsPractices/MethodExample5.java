package MethodsPractices;

//parent class as Data

class Data
{ 
    //declaring the data member

    int i;

    //method to print i value

    public void printNum(int n) 
    {
        i = n;
        System.out.println("value of i is "+i);
    }
}

//subclass inherites the parent class

class SubData extends Data
{ 
    //declaring the data member

    int j;
    
    //method to print j value

    public void printNum(int k ) 
    {
        i = k;
        System.out.println("value of j is "+k);
    }
}

public class MethodExample5 
{
    public static void main (String[] args)
    {
        //creating the object for child class

        SubData sd = new SubData();

        //assigning the values for both i and j by using sunclass object

        sd.printNum(5);
        sd.printNum(8);


    }
    
}
