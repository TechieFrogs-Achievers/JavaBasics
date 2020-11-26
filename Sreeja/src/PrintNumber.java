class Numbers
{
    public int printn(int number)   //method to print integer variable
    {
       return number;
    }

    public float printn(float number)   //method to print float variable
    {
        return number;
    }

    public double printn(double value)      //method to print double variable
    {
        return value;
    }

    public long printn(long data)   //method to print long variable
    {
        return data;
    }

    public byte printn(byte sample)         //method to print byte variable
    {
        return sample;
    }

    public short printn(short sample)       //method to print short variable
    {
        return sample;
    }
}

public class PrintNumber
 {
     public static void main(String[] args)
      {
         
        Numbers n = new Numbers();      //object creation for the number class
        
        //printing the values

        System.out.println("Integer: "+n.printn(567));
        System.out.println("Float:"+n.printn(56.7));
        System.out.println("Long:"+n.printn(4764657767l));
        System.out.println("Byte:"+n.printn(6));
        System.out.println("Short:"+n.printn(56));
        System.out.println("Double:"+n.printn(56789d));

       
        
    } 
    
   
}
