import java.util.Scanner;
public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nameOne;
	    String nameTwo;

	    int sumOne = 0;
	    int sumTwo = 0;
	    
	    	
	    Scanner readme = new Scanner(System.in);
		
	    System.out.println(" Please enter the first name. ");
	       nameOne = readme.nextLine();
	    System.out.println(" Please enter the last name. ");
	       nameTwo = readme.nextLine();

	       
	       char[] one = nameOne.toCharArray();
	       char[] two = nameTwo.toCharArray(); 
	       

	       for(int i = 0; i < one.length; i++) {
	    	   System.out.println(one[i] + ": " + (int)one[i]);
	       }
	       
	       for(int i = 0; i < two.length; i++) {
	    	   System.out.println(two[i] + ": " + (int)two[i]);
	       }
	       
	       for(int i = 0; i < one.length; i++) {
	    	   sumOne = sumOne + one[i];
	       }
	       
	       for(int i = 0; i < two.length; i++) {
	    	   sumTwo = sumTwo + two[i];
	       }
	       
	       System.out.println("Difference (as an absolute value): " + Math.abs(sumOne - sumTwo));
	       	       
	
	}

}
