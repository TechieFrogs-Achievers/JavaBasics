public class Average {
    void calculateAverage(double num1,double num2,double num3)
    {
        double avg=(num1+num2+num3)/3;
        System.out.println(avg);

    }
    public static void main(String[] args) {
        Average a=new Average();
        a.calculateAverage(2, 3, 4);
    }
    
}
