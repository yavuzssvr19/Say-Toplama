package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ınp=new Scanner(System.in);
		
		int total=0;
		int n1;
		do {
			System.out.println("Bir Sayı Giriniz: ");
			n1=ınp.nextInt();
			if (n1%2==0 || n1%4==0) {
				total+=n1;
				
			}
		}while(n1%2==0);
		System.out.println("Sistem Durdu.");
		System.out.println("Total: "+total);
	}

}
