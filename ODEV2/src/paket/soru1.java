package paket;

import java.util.Random;

public class soru1 {

	public static void main(String[] args) {
		
		int[][] matris = new int[5][5];
		System.out.println("Input: ");
		printMatris(matris);
		System.out.println("Output: ");
		newMatris(matris);
	}
	
public static void printMatris(int[][] matris) {
	
	Random random = new Random();
	
	for(int i=0; i < matris.length; i++) {
		
		for(int j=0; j < matris[0].length; j++) {
			
			matris[i][j] = random.nextInt(2);
			System.out.print(matris[i][j] + " ");
		}
		
		System.out.print("\n");
	}
}
public static void newMatris(int[][] matris) {
	
	for(int i=0; i < matris.length; i++) {
		
		int count=0;
		
		for(int j=0; j < matris[0].length; j++) {
			
			count=0;
			
			   if(j<4 && matris[i][j+1]==1)
				   
			    count++;
			   
			   if(j>0 && matris[i][j-1]==1)
				   
			    count++;
			   
			   if(i<4 && matris[i+1][j]==1)
				   
			    count++;
			   
			   if(i>0 && matris[i-1][j]==1)
				   
			    count++;
			   
			   if(count<2 && matris[i][j]==1) 
				   
				   matris[i][j]=0;
			   
			   if((count<=3 && count>=2) && matris[i][j]==1)
				   
				   matris[i][j]=1;
			   
			   if(count>3 && matris[i][j]==1)
				   
				   matris[i][j]=0;
			   
			   if(count==3 && matris[i][j]==0)
				   
				   matris[i][j]=1;
		}	  
	}		  	
		for(int i=0; i < matris.length; i++) {
	
				for(int j=0; j < matris[0].length; j++) {
		
					System.out.print(matris[i][j] + " ");
				}
	
		System.out.println(" ");
			}
		}
}