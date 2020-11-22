class AddDistance{

    //method for  adding distance 
public void addDistance(int inch1,int inch2,float feet1,float feet2)
{
    int inches=inch1+inch2;
    float feet=feet1+feet2;
        if(inches>12)
        {
            feet++;
            inches=inches-12;
        }
        System.out.println("inches: " + inches + "  feet: "+feet);
}
}
public class ConstructorProgram11 {
    public static void main(String[] args) {
    AddDistance a = new AddDistance();  
    a.addDistance(4, 9, 5, 3);//method calling

    }
}
