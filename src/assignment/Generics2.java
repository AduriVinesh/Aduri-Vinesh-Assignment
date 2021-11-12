package assignment;
import java.util.*;  
public class Generics2{  
 public static void main(String args[]){  
   HashMap<Integer,Double> map=new HashMap<Integer,Double>();//Creating HashMap    
   map.put(1,10.2);  //Put elements in Map  
   map.put(2,10.3);
   map.put(3,10.4);
   map.put(4,10.5);
   map.put(5,10.6);
   map.put(6,10.7);
   map.put(7,10.8);
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  