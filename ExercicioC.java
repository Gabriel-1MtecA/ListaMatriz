import java.util.Random;
import java.util.Scanner;
public class ExercicioC{
	public static void main(String args[]) {
		Scanner in= new Scanner (System.in);
		int v[][]= new int[3][4];
		int s,i,j,n=0;
		Random x=new Random ();
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				
					v[i][j]=(int)(Math.random()*99);
					n=n+v[i][j];
			
		}
			v[i][j]=n;
			n=0;
	}
		for(i=0;i<3;i++) {
					System.out.println("   ["+v[i][0] +"]["+v[i][1]+"]["+v[i][2]+"]["+v[i][3]+"]   ");
				}
			
}}