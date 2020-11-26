public class IntegerCharacter2 {
    
    int marks;
    char letter;
    void show(int k,char m) //creating method and assigning the parameters
    {
        marks = k; //assigning the variables
        letter = 'M';
        System.out.println(marks +" "+letter);
    }
    void show(char m,int k)
    {
        letter ='K';
        marks = k;
        System.out.println(letter+" "+marks);
    }    
    public static void main(String[] args) {
        IntegerCharacter2 i = new IntegerCharacter2();     //creating objects for the class 
        i.show(75,'M'); //calling method with object  
        i.show('K',80);
    }
}
