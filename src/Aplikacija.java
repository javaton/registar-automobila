import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import automobil.Automobil;
import automobil.Motor;

public class Aplikacija {

	public static void main(String[] args) {
// 		Kreiramo novu listu tipa ArrayList.
//		Kod array liste novi elementi se uvek dodaju na kraj liste.
		List<Automobil> listaAutomobila = new ArrayList<>();
// 		Kreiranje motora
		Motor benzinac16 = new Motor(1600, 120, "benzin");
		
		//instanciramo novi automobil sa kljucnom recju new
		//Dodajemo motor automobilu preko konstruktora
		Automobil ford = 
				new Automobil("Ford", "Kuga", 5, "crna", 100d, benzinac16);
//		System.out.println(ford.informacijeOAutomobilu());
		
		//Metodu add koristimo da dodamo novi element u listu
		
		listaAutomobila.add(ford);
		listaAutomobila.add(new Automobil("Fiat", "Stilo", 5, "bela", 90d, 2000, 130, "dizel")); // dodavanje motora preko konstruktora sa posebnim atributima 2000, 130, "dizel"
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
		//Dodavanje motora automobila preko setera
		unetiAutomobil.setMotorAutomobila(benzinac16);
		System.out.println("Uspesno ste dodali automobil " + unetiAutomobil.informacijeOAutomobilu());
		listaAutomobila.add(unetiAutomobil);
		
		//Koristimo for petlju kako bismo prikazali sve automobile iz liste
		System.out.println("***Vozila na lageru: / Lista vozila:***");
		for (Automobil automobil : listaAutomobila) {
			System.out.println(automobil.informacijeOAutomobilu());
		}
	}

}
