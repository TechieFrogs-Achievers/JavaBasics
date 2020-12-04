package Interface;

interface interface4{
    //interface data members
    String name = "Ramya";
    int age = 20;
}

public class InterfaceExcercise4 
 //implements interface4
 {
    public static void main(String[] args) {
        //name = "rama";       
        //error --The final field interface4.name cannot be assigned
        //the data members in interface by default static and final

        String name = "Kondapalli";  //local data member
        System.out.println(name);    //it will print local data member "name"

        //by default they are static so need 
        //to create any object
        System.out.println(interface4.name);
        System.out.println(interface4.age);

        //after implementing we call it directly
        //System.out.println(name);
        //System.out.println(age);
    }
}
