//procted access modifiers example
// if we give protect to this class name ,error is coming as illegal modifier for class name
// protected class ProtectedExample
class ProtectedExample
{
    int number;
    String name;
    ProtectedExample()
    {
        int a;
        String str;
        a = number;
        str = name; 
        // System.out.println(a +"  " +str);
    }
}

public class AccessModifiersPraciceProgram1 {
    
    public static void main(String[] args) {
    
        ProtectedExample p = new ProtectedExample();
        p.number=50;
        p.name = "eswari";
        System.out.println(p.number +"  " +p.name);

         
    }
}
