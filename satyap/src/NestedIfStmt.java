public class NestedIfStmt {
    public static void main(String[] args) {

        // IfLadder Statement for Donate Blood
        int age=20;
        int weight=58;
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }
  //IfLadder Statement for Interview Exam

        int ssc=95;
        int inter=75;
        int degree=65;
        if(ssc>=75){
            if(inter>=75){
                if(degree>=75){
                    System.out.println("You are eliglible to attempt Exam for Interview process");
                }
            }
        }
        System.out.println("Not eliglible for this exam");

 // NestedIf  Stmt for Postive num and Language
        int num=10;
        String language="Java";
        if(num>0){
            if(language=="Java"){
                System.out.println("Best Programming Language");
                System.out.println("The number is postive");
            }
        }
            System.out.println("Statement outside if block");
    
        

    }
    
}
