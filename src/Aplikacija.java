import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import automobil.Automobil;
import automobil.Citac;
import automobil.Motor;
import automobil.Tocak;

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

		//Kod za unos automobila je pomeren u klasu Citac!
		Automobil unetiAutomobil = Citac.unesiAutomobil();
		//Dodavanje motora automobila preko setera
		unetiAutomobil.setMotorAutomobila(benzinac16);
		Tocak unetiTocak = Citac.unesiTocak();
		unetiAutomobil.setTocak(unetiTocak);
		System.out.println("Uspesno ste dodali automobil " + unetiAutomobil.informacijeOAutomobilu());
		listaAutomobila.add(unetiAutomobil);
		
		//Koristimo for petlju kako bismo prikazali sve automobile iz liste
		System.out.println("***Vozila na lageru: / Lista vozila:***");
		for (Automobil automobil : listaAutomobila) {
			System.out.println(automobil.informacijeOAutomobilu());
		}
	}

}
