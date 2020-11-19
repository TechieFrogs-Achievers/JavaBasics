public class LabeledFor {
    public static void main(String[] args) {
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for( int j=1;j<=3;j++){
                if(i==2 && j==2){
                    break bb; // break bb;
                }
                System.out.println(i+" "+j);
            }
        }

// Labeledfor 
        first:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1){
                    continue first;

                }
                System.out.println(i+" "+j);
            }
        } 
        System.out.println();
        second:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1){
                break second;
                }
            }
        }


    }
    
}
