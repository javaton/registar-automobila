package automobil;

import java.util.Scanner;

public class Citac {
	
	public static Automobil unesiAutomobil() {
//		Unos i dodavanje vozila sa konzole!
		System.out.println("***Unesite zeljeno vozilo***");
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tip vozila");
		String tip = input.next();
		System.out.println("Unesite marku:");
		String marka = input.next();
		System.out.println("Unesite broj putnika");
		Integer brPutnika = input.nextInt();
		System.out.println("Unesite boju:");
		String boja = input.next();
		System.out.println("Unesite cenu: ");
		Double cena  = input.nextDouble();
		Automobil unetiAutomobil = new Automobil(marka, tip, brPutnika, boja, cena);
		return unetiAutomobil;
	}
	
	public static Tocak unesiTocak() {
		System.out.println("***Unesite tocak: ");
		Scanner input = new Scanner(System.in);
		System.out.println("*** Unesite sirinu: ");
		Integer sirina = input.nextInt();
		System.out.println("*** Unesite precnik: ");
		Integer precnik = input.nextInt();
		System.out.println("*** Unesite tip gume (M/S/M_S): ");
		String pomString = input.next();
		TipGume tipGume = TipGume.valueOf(pomString);
		System.out.println("*** Unesite tip felne (ALUMINIJUMSKA/CELICNA): ");
		pomString = input.next();
		TipFelne felne = TipFelne.valueOf(pomString);
		System.out.println("*** Unesite max brzinu gume: ");
		Integer maxBrzina = input.nextInt();
		Tocak t = new Tocak(sirina, precnik, tipGume, felne, maxBrzina);
		return t;
	}

}
