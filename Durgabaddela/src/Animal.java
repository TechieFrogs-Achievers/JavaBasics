class Animal//parent class
{
    public void sound()
    {
        System.out.println("Animal is making sound");
    }
}
    //child class inherites the parent class

    class Doggy extends Animal
    {
        //override a method

        public void sound()
        {
            System.out.println("Bow Bow");//method overloading
        }

    public static void main(String[] args)
    {
        Animal obj = new Doggy();//creating child object has a parent reference
        obj.sound();//calling the mathod
    }
}

