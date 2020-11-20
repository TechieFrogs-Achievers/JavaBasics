public class IfElseIfLadder {
    public static void main(String args[]){
    int marks=75;
    if(marks<50){
        System.out.println("fail");
    }

    else if(marks>=50 && marks<60){
        System.out.println("D grade");
    }
    else if(marks>=60 && marks<70){
        System.out.println("C grade");
    }
    else if(marks>=70 && marks<80){
        System.out.println("B grade");
    }
    else if(marks>=80 && marks<90){
        System.out.println("A grade");
    }
    else if(marks>=90 && marks<100){
        System.out.println("O grade");
    }
    else{
        System.out.println("Invalid");
    }

 // IfElseIf Ladder for Numbers

    int num=50;
    if(num>0){
        System.out.println("Number is Postive:"+num);
    }   
    else if(num<0){
        System.out.println("Number is Negative:"+num);
    }
    else{
        System.out.println("Number is zero"+num);
    }

}
}
    

