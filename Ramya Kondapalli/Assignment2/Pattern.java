import java.util.regex.Matcher;

public class Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            System.out.println();
                for(int j=5;j>=1;j--)
                {
                     if(j == i)
                        System.out.print("*");    //If j==i then print *
                    else
                    System.out.print(j);    //if j != i print numbers
                }
        }
    }

	public static Pattern compile(String string) {
		return null;
	}

	public Matcher matcher(String string) {
		return null;
	}

	public static boolean matches(String string, String string2) {
		return false;
	}
}

