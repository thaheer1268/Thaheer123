package arram;
import java.util.*;

public class Arrayl {
	 ArrayList<String>List = new ArrayList<String>();
//        	   Scanner sc =new scanner(System.in);
        	   
//        	   
//        	   ArrayList<String>List = new ArrayList<String>();
        	   public void display() {
        		   List.add("cse");
        		   List.add("me");
        		   List.add("ise");
        		   System.out.println(List);
        		   		
        	   }
        	   public void appendatend() {
        		   Scanner sc =new Scanner(System.in);
        		   System.out.println("enter the string");
        		   String arele=sc.next();
        		   List.add(arele);
//        		   list.add("me");
//        		   list.add("ise");
        		   System.out.println(List);
        		   		
        	   }
//        	   public 
           public static void main(String[] args) {
        	   Arrayl obj=new Arrayl();
        	     obj.display();
        	     obj.appendatend();
           }
           }
	
	
	
	

