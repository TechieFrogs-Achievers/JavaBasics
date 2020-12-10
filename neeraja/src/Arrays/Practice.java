package Arrays;
//program to pass array as an argument

class Demo{

    //method to perform some operation taking array as an argument
    int[] method(int g[]){
        int []p;
        p=g;//assigning one array to another array

        for(int i=0; i<g.length; i++){
            System.out.println("iterate through "+i+" th element");
        }
        return p;//returning array
        
    }
}
public class Practice {
    public static void main(String[] k){
    //instantiation of a class
     Demo d=new Demo();
     //passing annonymus array to a method as an rgument
     int []l =  d.method(new int[]{1,2,3,4,5,});//annonymus array

     System.out.println(l);//prints class name as " [I@372f7a8d "
     System.out.println(l.getClass());//class [I
     for(int j=0; j<l.length; j++){//prints array values
    System.out.print(l[j]+" ");//1 2 3 4 5 
     }
     
    }
    
}
