package Arrays;
//program to clone() an object
public class ArrayCloning {
    public static void main(String[] k){

        String []s={"neeru","sri","josh","arun"};
        String []i=s.clone();//clone() method to create exact copy of object
        //printing array object
        for(String one:s){
            System.out.println(one);
        }
        //printing copy object
        for(String one:i){
            System.out.println(one);
        }
      
            System.out.println(s.equals(i));//false
            System.out.println(s==i);//false

        }

    }
    

