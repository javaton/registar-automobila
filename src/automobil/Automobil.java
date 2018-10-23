package automobil;

public class Automobil {

	private String marka;
	private String tip;
	private Integer brojPutnka;
	private String boja; 
	private Double cena;
	
	public Automobil(String marka, String tip, Integer brojPutnka, String boja, Double cena) {
		super();
		this.marka = marka;
		this.tip = tip;
		this.brojPutnka = brojPutnka;
		this.boja = boja;
		this.cena = cena;
	}
	
	public String informacijeOAutomobilu() {
		return "Marka : "+ marka + " tip: " + tip 
				+ " broj putnika " + brojPutnka 
				+ " boja je " + boja
				+ " cena: " + cena;
	}
	
}
