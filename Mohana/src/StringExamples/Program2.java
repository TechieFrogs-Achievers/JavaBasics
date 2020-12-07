package StringExamples;

class LexicographicalOrder{
    void order(){ //method to show details
        String[] str={"Java","Is","A","Simple","Language"};//string

        for(int i = 0;i< 5;i++){

            for (int j=i+1;j<5;j++){

                if(str[i].compareTo(str[j])>0)//conition to check 
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0;i<5;i++){ //loop to print output
            System.out.println(str[i]);
        }
    }
}
public class  Program2  {
    public static void main(String[] args) { 
       LexicographicalOrder l = new  LexicographicalOrder(); //object creation
       l.order();
    }
    
}
