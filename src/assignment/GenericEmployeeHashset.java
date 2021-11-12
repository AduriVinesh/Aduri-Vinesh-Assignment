package assignment;

import java.util.HashSet;

public class GenericEmployeeHashset {  
public static void main(String[] args) {  
    HashSet<GenericsEmployee> set=new HashSet<GenericsEmployee>();  
    //Creating Books  
    GenericsEmployee b1=new GenericsEmployee(101,"vinesh","electronics",25000);  
    GenericsEmployee b2=new GenericsEmployee(102,"Aduri","Computers",30000);  
    GenericsEmployee b3=new GenericsEmployee(103,"Ramesh","MBA",50000);  
    //Adding Books to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing HashSet  
    for(GenericsEmployee b:set){  
    System.out.println(b.id+" "+b.name+" "+b.dept+" "+b.salary);  
    }  
}  
}  