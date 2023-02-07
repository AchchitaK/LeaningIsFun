package Achchita;

public class Program {

	public static void main(String[] args) {
		System.out.println("It's a cold day");
	
		int temp = 36;
		String[] name = {"Houston", "Austin", "Chicago", "Atlanta"};
			int[] temperature = {35,21,24,36};
			System.out.println("after initialization");
		
			System.out.println(name[1] + ": "+temperature[1]+" F");
			
			
			//for loop initiation, condition, increment/decrement    
			//Retrieve all items using for loop
				for (int i=0; i<4; i++)
				{	
				//System.out.println(name[i]);
				System.out.println(name[i] + "-" + temperature[i]);
				
	            }
				System.out.print(name.length);
	
			
			}
   }

        