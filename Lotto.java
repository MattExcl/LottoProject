
package loto;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
/*
 * to do:
 * import numbers----// add loop that checks if it num has been put in yet/ if its a dupe
 *
 * 
 * number genorator		 done
 
 * number checker
 * total $
 * frequency table
 * 
 * 
 * //check if win int count num=0 if it = one of the numbers, then it adds one  big for loop that repeats 104 times
 * 
 * 
 * 
 * 
 * winnings are held in an array,index refers to howmany matching.
 * at end have it do award*3 in array
 */

	public static void main(String[] args) {	
Scanner in = new Scanner(System.in);
		int numofmatching=0;
		int input=-1;
		int [] given = new int[5]; 
		int [] round = new int[5]; 
		int [] winnings = new int[5]; 
		double[]fqcy = new double[21]; 
		System.out.println("Welcom to lotto, What are your 5 numbers? press return after each number:");
		
		for(int i =0;i<5;i++) {  
			
			System.out.print((i+1) +": ");   
			
			input =in.nextInt();//(int)((Math.random()*20)+1);		//in.nextInt(); //instead of math.random
			
			for(int j =0;j<i;j++) {
			
				if((given[i]==given[j])&&(i!=j)) {
			
					System.out.print(errorForInput()+"\n");					//////PROBLEM!!!!! around here?
			
					given[j]=input; 
			
					i--;
					j=0;
					
					}
				}
			
		

			//if(input<21 && input>0) {	
			//	given[i]=input; 
			//	}
		//	else {
			//	System.out.print(errorForInput()+"\n");
			//	i--;
			//	}  
			
			}
			System.out.println("Your Ticket: "+Arrays.toString(given));
			
			
			
			
		// put in a for loop that checks once all are inputed, to see if any repeat could use method
		/*for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++) {
				if((given[i]==given[j])&&(i!=j)) {
					System.out.print(errorForInput()+"\n");
					j--;
					given[j]=input; 
					}
				}
			}
		*/
		for(int i =0;i<5;i++) {
			round[i]=(int)((Math.random()*20)+1);		// might not need this line
			for(int j =0;j<5;j++) {
				if((i!=j)&&(round[i]==round[j])) {
						round[j]=(int)((Math.random()*20)+1);j=0; 
					}		
				}
			}

		
		
		
		//end of geting their ticket
		
		// use forwhile(totalNums < 5){
		//lottoNumbers = input; //Here is where the numbers will be that get added to the array
		//	totalNums++;}
//}
	  
		for(int r =0;r<104;r++) {
  // Random num gen
		//Array given[5],   int [] given = new int[5]; 
		for(int i =0;i<5;i++) {
			round[i]=(int)((Math.random()*20)+1);		// might not need this line
			for(int j =0;j<5;j++) {
				if((i!=j)&&(round[i]==round[j])) {
						round[j]=(int)((Math.random()*20)+1);j=0; 
					}		
				}
			}
		
		for(int i =0;i<5;i++) {
			fqcy[round[i]]++;
				}
		
		
	
		
		//for(int i =0;i<5;i++) { for(int j =0;j<5;j++) {
				//if((round[i]==round[j])&&(i!=j)) {
		//checker
		
		numofmatching=-1;
		for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++) {
				if(given[i]==round[j]) {
					numofmatching++; }
				}
			}
		System.out.println("\nRound "+(r+1)+":\nWinning Numbers: "+Arrays.toString(round)+"\nYour Numbers: "+Arrays.toString(given));
		System.out.println("There where "+(numofmatching+1)+" matches.");
				
	}	
				
// random grab num from an array list
	/*
	 * 	 if(w.charAt(i)== 'a'||w.charAt(i)== 'e'||w.charAt(i)== 'i'||w.charAt(i)== 'o'||w.charAt(i)== 'u') {// maybe use this?
	 * 

			
	 */
		
		
	//for(int i =0;i<5;i++) {
	//	System.out.print((i+1) +": "); input = in.nextInt();
	//	if(input<20 && input>0) {
	//		given[i]=input; }
	
	
		//winnings[numofmatching]++; 
		System.out.print("\n--- Thanks for Playing!---\n\n Below is the Frequency table and winnings\n\nFrequency Table: \n");	
		
			for(int i =1;i<=20;i++) { if(i%10==1) {System.out.println();} System.out.print((i)+": "+(((fqcy[i]/104.0)*10))+"\t");}
					
	}
	
	
	
public static String errorForInput() {return" ---Please input a number between 1 and 20 inclusive, that is also not one that you have already inputed: --- ";}
}



