package day07_ifElseStatements;

import java.util.Scanner;

public class C2_IfElse {

	public static void main(String[] args) {
		
		// soru===> kullanicidan dikdortgenin kenar uzunlunklarini isteyin
		// ve dikdortgenin kare olup olmadigini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin kenarlarini giriniz /nIlk kenari yazip ENTER'a basiniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();

		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikdortgen kare");
			
		} else { System.out.println("Girdiginiz dikdortgen kare degil"); }

	}

} 
