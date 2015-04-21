/** 
 * 
 * @author haa2224
 * This is a  main method that is in a separate class that will display outputs..
 *
 */
// A class that defines the specifec details that were used in the 
//previous class Room.
public class RoomDriver 
                           


{
public static void main(String[]args)
     {//display the first room's details.
    Room Constructor1 = new Room("Yellow", "Hardwood", 1);
    //print the first room's details.
	System.out.println(Constructor1); 
	//display the second room's details.
	Room Constructor2 = new Room("Purple", "Tiled Floor", 0); 
	//print the second room's details.
	System.out.println(Constructor2);  
	//display the third room's details.
	Room Constructor3 = new Room("White", "Carpet Floor", 3); 
	//print the third room's details.
	System.out.println(Constructor3);  
	
       }
}
