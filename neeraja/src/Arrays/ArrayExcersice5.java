package Arrays;
//program to print arrat elements in normal and reverse oredrs
 public class  ArrayExcersice5 {
    public static void main(String k[]){
      //declaring and initializing an array a
        int a[];
        a=new int[10];
        a[0]=1; a[1]=2;a[2]=2;a[3]=2;a[4]=2;

      //declaring and initializing an array a
        int b[]=new int[]{2,3,4,5,6,};
        System.out.println(b);

       // for(int i=0; i<a.length;i++){
       // System.out.println(a[i]);
      //  }
      
      //printing in normal order
      for(int c:a){
        System.out.println(c);
        }
         for(int d:b){
        System.out.println(d);//[I@4517d9a3(classname)
        }
        //to print elements in reverse order
        for(int i=a.length-1; i>=0;i--){
          System.out.println(a[i]);
        }

}
}

