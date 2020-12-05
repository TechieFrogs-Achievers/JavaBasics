package Strings;
class DictionaryOrder{
    void showOrder(){
    
            String[] str={"i" ,"a", "gud","girl"};

        for(int i = 0;i< 4;i++){

            for (int j=i+1;j<4;j++){

                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0;i<4;i++){
            System.out.println(str[i]);
        }
    }
}
public class SecondExample {
    public static void main(String[] args) {
        DictionaryOrder l = new  DictionaryOrder();
       l.showOrder();
    }
}