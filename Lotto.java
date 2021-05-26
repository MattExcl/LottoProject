package loto;
import java.util.Scanner;

public class Lotto {
/*
 * to do:
 * import numbers
 * number genorator
 
 * number checker
 * total $
 * frequency table
 * 
 * 
 * 
 * 
 */
public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);
		int numofjackpot = 0;
		int numofmatching;
		int input=-1;
		int [] given = new int[5]; 
		int [] round = new int[5]; 
		int [] winnings = new int[5]; 
		System.out.println("Welcom to lotto, What are your 5 numbers? press return after each number:");
		
		for(int i =0;i<5;i++) {  
			System.out.print((i+1) +": ");   
			input = in.nextInt();   
		
		System.out.println(Arrays.toString(given));
	

			if(input<20 && input>0) {
				given[i]=input; 
				}
			else {
				System.out.print(errorForInput()+"\n");
				i--;
				}  
			}// put in a for loop that checks once all are inputed, to see if any repeat could use method
		
	
	for(int i =0;i<5;i++) {//this is me trying to do a checker to check for dupes
			for(int j =0;j<5;j++) {
				if((given[i]==given[j])&&(i!=j)) {
					System.out.print(errorForInput()+"\n");
					j--;
					given[j]=input; 
					}
				}
			}
		
		
		System.out.println("Your Ticket: "+Arrays.toString(given));
		
		
		
		
	
		
		
		
		
		//end of geting their ticket
		
		// use forwhile(totalNums < 5){
		//lottoNumbers = input; //Here is where the numbers will be that get added to the array
		//	totalNums++;}
//}
	  
		
  // Random num gen
		//Array given[5],   int [] given = new int[5]; 
		
		//(int)(Math.random()*100.0);
		
		//checker
// random grab num from an array list
	/*
	 * 	 if(w.charAt(i)== 'a'||w.charAt(i)== 'e'||w.charAt(i)== 'i'||w.charAt(i)== 'o'||w.charAt(i)== 'u') {// maybe use this?
	 * 

			
	 */
		
		
	//for(int i =0;i<5;i++) {
	//	System.out.print((i+1) +": "); input = in.nextInt();
	//	if(input<20 && input>0) {
	//		given[i]=input; }

		
	}




public static String errorForInput() {return" ---Please input a number between 1 and 20 inclusive, that is also not one that you have already inputed: --- ";}




}



