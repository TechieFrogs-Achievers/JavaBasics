public class Method2 
{
    int num;
    char letter;
    // creating method using with parameters
    void display(int n, char c)
    {
        num = n;
        letter = 's';
        System.out.println(num +" "+letter); 
    }
    void display(char c, int n)
    {
        letter = 'A';
        num = n;
        System.out.println(letter + " "+ num);
    }
    public static void main(String[] args) 
    {
        Method2 m = new Method2();// creating object for class
        //calling methods with object
        m.display(21,'s');
        m.display('A', 45);
        
    }
    
}
