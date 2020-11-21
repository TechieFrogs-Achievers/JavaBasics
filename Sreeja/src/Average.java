public class Average 
{
    float firstNumber;
    float secondNumber;
    float thirdNumber;

    void insert(float a,float b,float c)
    {
        firstNumber = a;
        secondNumber = b;
        thirdNumber = c;

    }

    public void average()
    {
        float average = (firstNumber+secondNumber+thirdNumber)/3;
        System.out.println(average); 
    }
     public static void main(String[] args) 
     {
        Average av = new Average();
        av.insert(1,2,4);
        av.average();
    } 
}
