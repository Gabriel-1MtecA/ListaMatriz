import java.util.Scanner;
public class ExercicioD{
	public static void main (String args []) {
		Scanner in= new Scanner (System.in);
		int v[][]=new int [4][4];
		int i,j,b,a=0,e=0;
		int random=1;
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				v[i][j]=(int) (Math.random() * 75);
			}
		}
		for(i=0;i<4;i++) {
			System.out.println(" ["+v[i][0] +"]["+v[i][1]+"]["+v[i][2]+"]["+v[i][3]+"]   ");
			
		}System.out.println(" ");
		
		while(a<16) {
			System.out.println("Digite um número");
			b=in.nextInt();
			e++;
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				if(b==v[i][j]) {
					a=a+1;
					System.out.println("Acertou um número da cartela!!");
				}
				
				
				}
				
			}
		}if(a==16) {
			System.out.println("BINGO!!  (Demorou "+e+" rodadas pra acertar os números da cartela ");
		}
	}
}