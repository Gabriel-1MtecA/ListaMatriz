import java.util.Scanner;
public class ExercicioA{
	public static void main (String args[]) {
		Scanner in= new Scanner (System.in);
		int v[][] = new int [4][4];
		int n=1,i,j;
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
					v[i][j]=n*2;

					n=v[i][j];
				}
			
					}
		for(i=0;i<4;i++) {
			if(i>0) {
				System.out.println("   ["+v[i][0] +"]["+v[i][1]+"]["+v[i][2]+"]["+v[i][3]+"]   ");
			}
			else {
				System.out.println("   ["+v[i][0] +"]["+v[i][1]+"]["+v[i][2]+"]["+v[i][3]+"]   ");
			}
		}
				
			
		}
	
}