package StringBufferClass;
    class Coordinates {

         int x, y;
        public Coordinates(int x, int y)//constructor with parameters
        {
            this.x = x;
            this.y = y;
        }
        /*// toString() Method.
        public String toString() {
            return "X=" + x + " " + "Y=" + y;
        }*/
    }
    
    public class ToStringExample 
    {
    
        public static void main(String args[]) {
            Coordinates c = new Coordinates(10, 10);
            System.out.println(c);
            String s = c +"working";
            System.out.println(s);
        }
    }

