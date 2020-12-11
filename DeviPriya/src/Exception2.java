public class Exception2 {
    public static void main(String[] args) {
        try {
          int array[] = new int[10];
          //array[11] = 30 / 2; // it shows ArrayIndexOutOfn
          array[10] = 30 / 0; //  it shows ArithmeticException
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException  e )
        {
          System.out.println(e.getMessage());
        }
          catch (Exception e)
          {
           System.out.println(e.getMessage());
          }
        }
      }
    
    

