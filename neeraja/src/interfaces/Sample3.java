package interfaces;

//interface with abstract methos getmeasure
interface Measurable{
    double getMeasure(double salary);
}

//class implementing abstract method
class Employee implements Measurable{
    double sum=0;
    public double getMeasure(double salary){
         sum=sum+salary;//condition summing all employees salries
        return sum;//return sum
    }
}


//driver class
public class Sample3 {
     
    public static void main(String[] r){
        //instantiating an array of objects
        double sum1=0;
        Measurable[] m=new Employee[5];
        
        //passing salary of eact employee
       for(int i=0; i<m.length; i++){
           double u=1000;
           sum1=m[i].getMeasure(10000+(i*u));
        }
        //calculating average of an employee
        double average=sum1/(m.length);

        System.out.println("avarage salary of employees "+average);
    }
    
}
