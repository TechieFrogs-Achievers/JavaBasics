//import jdk.javadoc.internal.tool.resources.javadoc;

public class LabledForLoop {
    public static void main(String[] args) {
        label1:
            for(int i=1;i<=10;i++)
            {
                System.out.println();
                
                        for(int j=0;j<=10;j++)
                        {
                            System.out.print(j + " ");
                            if (j==5)
                            break label1;  //break label 1
                        }
            }

    }
}
