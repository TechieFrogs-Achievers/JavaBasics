class AddDistance
{
    public void distance(int inch1,int inch2, float feet1,float feet2)
    {
        int inches= inch1 + inch2;
        float feet=feet1 + feet2;
        if(inches > 12)
        {
            feet++;
            inches=inches-12;

        }
        System.out.println("Inches : " +inches +"  " +"Feet : " +feet);
    }
}
public class ClassesAndObjectsProgram11 {
    public static void main(String[] args) {
        AddDistance ad= new AddDistance();
        ad.distance(6, 4, 5, 4);
    }
    
}
