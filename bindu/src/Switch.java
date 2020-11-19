public class Switch {
    public static void main(String[] args) {
        int cost = 1200;
        String Products="Biotique";
        switch(Products)
        {
            case "Biotique":
            cost = 1200;
             System.out.println("products is Biotique" +cost);
            break;
            case "Goodvibes" :
            cost =1250;
            System.out.println("products is Goodvibes" +cost);
            break;
            case "Mamaearth":
            cost =1200;
            System.out.println("products is Mamaearth" +cost);
            break;
            case "Himalaya":
            cost =1270;
            System.out.println("products is Himalaya" +cost);
            break;
            case "Loreal":
            cost =1300;
            System.out.println("products is Loreal" +cost);
            break;

            default:
            System.out.println("this are not products:");
        } 
        

        
    }


    
}
