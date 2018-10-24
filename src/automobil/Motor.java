package automobil;

public class Motor{

	private Integer kubikaza;
	private Integer snaga;
	private String tipMotora;
	
	public Motor(Integer kubikaza, Integer snaga, String tipMotora) {
		this.kubikaza = kubikaza;
		this.snaga = snaga;
		this.tipMotora = tipMotora;
	}
	//Medoda vraca povratnu vrednost String sa informacijama o motoru
	public String informacijeOMotoru() {
		return "Kubikaza: " + kubikaza + " snaga: " 
					+ snaga + " tip motora: " + tipMotora;
	}
	//Metoda nema povrtatnu vrednost vec odmah stampa informacije o motoru
	public void stampajInformacijeOMotoru() {
		System.out.println(informacijeOMotoru());
	}
}
