import java.util.*;

class Bill
{
	String item;
	int price, subtotal, quan;
    //constructor for class Bill 
	Bill(String item,int price,int quan, int subtotal)
	{
		this.item=item;
		this.price=price;
		this.quan=quan;
		this.subtotal=subtotal;
    }
    //tostring method which prints the instance variables
	public String toString()
	{
		return item+"	"+price+"	"+quan+"	"+subtotal;
	}
}

//Driver class/driver code
class  BillingSystem
{
	public static void main(String[] args) 
	{
        //creating array list to store non homogeneous data of menu
		ArrayList<Bill> al = new ArrayList<Bill>();
		int grandTotal=0,subtotal=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome, please enter your name:");
		String name = scan.nextLine();
		System.out.println("Enter your mobile number:");
		String mobile = scan.next();
		String item ="";
		int quan=0,price=0; 
		char c='y';
		System.out.println("______________________________________________");
		System.out.println("__________________   Menu   __________________");
		System.out.println("______________________________________________");
		System.out.println("1                    Idly                   30");
		System.out.println("2                    Dosa                   50");
		System.out.println("3                Water bottle               20");
		System.out.println("4                    Tea                    08");
		System.out.println("5                   Coffee                  10");
		System.out.println("6                    Boost                  12");
		System.out.println("______________________________________________");
        
        //while loop  to iterate until required no items ordered 
		while(c=='y')
		{	
			System.out.println("What do you want to buy? \nEnter the code:");
			int choice = scan.nextInt();
			System.out.println("Can you enter the quantity:");
            quan = scan.nextInt();
            //selection statement to to select required no of items
			switch(choice)
			{
				case 1:
					item = "Idly";
					price = 30;
					subtotal = price*quan;
					break;
				case 2:
					item = "Dosa";
					price = 50;
					subtotal = price*quan;
					break;
				case 3:
					item = "Water";
					price = 20;
					subtotal = price*quan;
					break;
				case 4:
					item = "Tea";
					price = 8;
					subtotal = price*quan;
					break;
				case 5:
					item = "Coffee";
					price = 10;
					subtotal = price*quan;
					break;
				case 6:
					item = "Boost";
					price = 12;
					subtotal = price*quan;
					break;
				default:
					System.out.println("Invalid input!!!");
					break;
            }
            //calculating grand total by adding each selected item in an array list
			grandTotal += subtotal;
            al.add(new Bill(item,price,quan,subtotal));
            
			System.out.println("Do you want to continue(y/n)?");//Y,N,Yes, No, y, n 
			c = scan.next().toLowerCase().charAt(0);//storing user entered choice (yes/no) to continue
		}
		//finally printing grandtotal of customers orders along with his detailssss
		System.out.println("----------------------------------------------------");
		System.out.println("____________________Bill Generator__________________");
		System.out.println("____________________________________________________");
		System.out.println("Customer Name: "+name);
		System.out.println("Customer Mobile: "+mobile);
        System.out.println("____________________________________________________");
        
		for(Bill a:al)
		{
            System.out.println(a);
        }

		System.out.println("___________________________________________________");
		System.out.println("Grand total		:		"+grandTotal);
        System.out.println("___________________________________________________");
        scan.close();
	}
}
