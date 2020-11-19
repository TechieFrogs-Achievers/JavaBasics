import org.graalvm.compiler.lir.stackslotalloc.StackSlotAllocatorUtil;

public class Pattern25 {
    public static void main(String[] args) {
        int count=1,row=1,alphabet=65;
        for(int i=1;i<=5;i++){
            if(i%2==0){
                int reverse=row+count-1;
                for(int j=0;j<i;j++){
                    System.out.print((char)(reverse+alphabet-1)+" ");
                    reverse--;
                    count++;
                }
            }
            else{
                for(int j=1;j<=i;j++){
                    System.out.print((char)(count+alphabet-1)+" ");
                    count++;
                }
            }
            System.out.println();
            row++;
        }
    }
    
}
