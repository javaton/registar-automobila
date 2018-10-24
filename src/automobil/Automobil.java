package automobil;

public class Automobil {

	private String marka;
	private String tip;
	private Integer brojPutnka;
	private String boja; 
	private Double cena;
	private Motor motorAutomobila;
	private Tocak tocak;
	
	public Automobil(String marka, String tip, Integer brojPutnka, String boja, Double cena) {
		super();
		this.marka = marka;
		this.tip = tip;
		this.brojPutnka = brojPutnka;
		this.boja = boja;
		this.cena = cena;
		this.tocak = new Tocak();
	}
	
	public Automobil(String marka, String tip, Integer brojPutnka, String boja, Double cena, Motor motorAutomobila) {
		super();
		this.marka = marka;
		this.tip = tip;
		this.brojPutnka = brojPutnka;
		this.boja = boja;
		this.cena = cena;
		this.motorAutomobila = motorAutomobila;
		this.tocak = new Tocak();

	}
	
	public Automobil(String marka, String tip, Integer brojPutnka, String boja, Double cena, Integer kubikaza, Integer snagaMotora, String tipMotora) {
		super();
		this.marka = marka;
		this.tip = tip;
		this.brojPutnka = brojPutnka;
		this.boja = boja;
		this.cena = cena;
		this.motorAutomobila = new Motor(kubikaza, snagaMotora, tipMotora);
		this.tocak = new Tocak();

	}
	
	public String informacijeOAutomobilu() {
		return "Marka : "+ marka + " tip: " + tip 
				+ " broj putnika " + brojPutnka 
				+ " boja je " + boja
				+ " cena: " + cena
				+ " motor " + motorAutomobila.informacijeOMotoru()
				+ " tocak " + tocak.informacijeOTocku();
	}
// Geteti i setiri sluze da pristupimo atributima u nasoj klasi
	public Motor getMotorAutomobila() {
		return motorAutomobila;
	}

	public void setMotorAutomobila(Motor motorAutomobila) {
		this.motorAutomobila = motorAutomobila;
	}

	public Tocak getTocak() {
		return tocak;
	}

	public void setTocak(Tocak tocak) {
		this.tocak = tocak;
	}
	
	
}
