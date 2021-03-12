import java.util.Scanner;
class Higher{
  public static void main(String[] k){
  Scanner scan=new Scanner(System.in);
  System.out.println("enter first number");
  int firstNo=scan.nextInt();
  System.out.println("enter second number");
  int secondNo=scan.nextInt();
  scan.close();
  if(firstNo>secondNo){
   System.out.println("firstNo"+  firstNo+" is greater than "+secondNo);
}
else if(firstNo==secondNo){
   System.out.println("both are equal");
}
  else{
System.out.println("firstNo"+  firstNo+" is lesser than "+secondNo);
}
}
}

