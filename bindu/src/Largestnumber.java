public class Largestnumber {
    public static void main(String[] args) {
        int K = 300;
        int H = 240;
        int B = 310;
        if(K>B && K>H)
        {
            System.out.println("largest number is:" +K);
        }
        else if(H>B)
        {
            System.out.println("largest number is:" +H);
        }
        else
        {
            System.out.println("largest number is:" +B);
        }

    }
    
}
