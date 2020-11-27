 class MotorBike{

    public void start(){
        System.out.println("Please use kick paddle to start");
    }
}

class SelfStartMotorBike extends MotorBike {

    //redefine the method body
    public void start(){
        System.out.println("Please use self start button to start");
    }
}

 public class MethodOverriding 
    {
    public static void main(String[] arg){
        SelfStartMotorBike motorBike = new SelfStartMotorBike();
        motorBike.start();
    }
}
    

