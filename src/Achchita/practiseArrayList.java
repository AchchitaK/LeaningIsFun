package Achchita;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;


public class practiseArrayList {

	public static void main(String[] args) {
		ArrayList<String> storenames = new ArrayList<String>();	
        storenames.add("forever");
        storenames.add("puma");
        storenames.add("hm");
        storenames.add("zara");
     /*   System.out.println(storenames);
        
        storenames.set(1,"aldo");
        System.out.println(storenames.size());
       
        //for loop for arraylist
        for(int i = 0; i < storenames.size(); i++)
        {
 			System.out.println(i);
 			System.out.println(storenames.get(i));	
        }   */   
   

  //collections HashMap
      HashMap<String, Integer> stores = new HashMap<String, Integer>();
	  stores.put("Aldo", 20);
      stores.put("puma", 30);
      stores.put("zara", 40);
      
      System.out.println(stores);
      
      //different methods
      System.out.println(stores.get("zara"));
      System.out.println(stores.size());
      System.out.println(stores.replace("puma", 30, 50));
      System.out.println(stores.get("puma"));
      
      //Retrieve elements using for each loop
            for (String i :stores.keySet())
                {
    	     	 // System.out.println("key:" +i);
    	    	  System.out.println("key:" +i+ " value:"+stores.get(i));
                }
    	  
    	  for (int i:stores.values())
    	  {  
    	  //System.out.println("value:" +i);
    
      
      }
}

	String stores = "puma";
	System.out.println(StringUtils.isEmpty(stores));
	
	
}