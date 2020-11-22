//import jdk.vm.ci.code.ValueKindFactory;

public class AbcPattern {
    public static void main(String[] args) {
        String str ="(";
        char c='a';
        for (int i=0;i<=8;i++)
        {
          System.out.println();
          String  s = str+ String.valueOf(c); //printning the string at 'c'
          System.out.println(s +  ")");  
          c++;                        //increase character
          str=s + " + ";
        }
    }
}
