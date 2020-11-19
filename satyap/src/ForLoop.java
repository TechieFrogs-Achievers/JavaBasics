public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

 // Nested for loop for Numbers
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+" "+j);
            }
        }        
// Nested for loop for *
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();

// Nested for loop for * in reverse order
            
        for(int i=1;i<=6;i++){
             for(int j=5;j>=i;j--){
                  System.out.print("* ");
                }
                System.out.println();
            }
            
        }
    }







