//import jdk.vm.ci.code.ValueKindFactory;

public class AbcPattern {
    public static void main(String[] args) {
        String str ="(";
        char c='a';
        for (int i=0;i<=8;i++)
        {
          System.out.println();
          String  s = str+ String.valueOf(c);
          System.out.println(s +  ")");  
          c++;
          str=s + " + ";
        }
    }
}
