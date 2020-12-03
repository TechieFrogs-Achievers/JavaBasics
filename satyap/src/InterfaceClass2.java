interface Measurable
{
    public double getMeasure(double measure);
    
}
class Employee2 implements Measurable
{
    public double average(double avg)
    {
        return avg;
    }
    public double getMeasure(double measure)
    {
        return measure;
    }
}
class InterfaceClass2
{
    public static void main(String[] args) {
        Employee2 e=new Employee2();
        System.out.println(e.average(6.0));
       System.out.println( e.getMeasure(5.0));
    }
}
