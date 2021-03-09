public class Psedo {

    public static void main(String[] n){
        int p=1,q=2,r=3;
        if((p & r) > (p^r)){
            p=p&r;
        }
           else {
               p=p^r;
           }
           q=q&r;
           System.out.println(p+q+r);
        }

    }
    

