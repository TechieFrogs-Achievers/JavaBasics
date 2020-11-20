public class SwitchCaseexamp2 
{
  public static void main(String[] args) 
  {

    String  colour = " WHITE " ;
     
    // switch case 
     
     switch ( colour)
     {
        case  "RED" : 
            System.out.println( " Red colour " );
            break;
        case  " GREEN " :
            System.out.println( "Green colour " );
            break;
        case " YELLOW  ": 
             System.out.println( " Yellow colour " ); 
             break;
        case " WHITE " :
              System.out.println( " White colour " );
              break;
        default:
          System.out.println( " Please enter a valid colour name " ); 

     }
      
  }
    
}
