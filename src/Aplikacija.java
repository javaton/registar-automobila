import java.util.ArrayList;
import java.util.List;

import automobil.Automobil;

public class Aplikacija {

	public static void main(String[] args) {
// 		Kreiramo novu listu tipa ArrayList.
//		Kod array liste novi elementi se uvek dodaju na kraj liste.
		List<Automobil> listaAutomobila = new ArrayList<>();
		
		//instanciramo novi automobil sa kljucnom recju new
		Automobil ford = 
				new Automobil("Ford", "Kuga", 5, "crna", 100d);
//		System.out.println(ford.informacijeOAutomobilu());
		
		//Metodu add koristimo da dodamo novi element u listu
		listaAutomobila.add(ford);
		listaAutomobila.add(new Automobil("Fiat", "Stilo", 5, "bela", 90d));

		//Koristimo for petlju kako bismo prikazali sve automobile iz liste
		for (Automobil automobil : listaAutomobila) {
			System.out.println(automobil.informacijeOAutomobilu());
		}
	}

}
