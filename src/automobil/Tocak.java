package automobil;

public class Tocak {

	private Integer sirina;
	private Integer precnik;
	private TipGume tipGume;
	private TipFelne tipFelne;
	private Integer maxBrzinaGume;
	
	
	
	public Tocak() {
		super();
		this.sirina = 155;
		this.precnik = 19;
		this.tipGume = TipGume.valueOf("S"); //kako od stringa dobiti enum vrednost
		this.tipFelne = TipFelne.ALUMINIJUMSKA;
		this.maxBrzinaGume = 130;
	}

	public Tocak(Integer sirina, Integer precnik, TipGume tipGume, TipFelne tipFelne, Integer maxBrzinaGume) {
		super();
		this.sirina = sirina;
		this.precnik = precnik;
		this.tipGume = tipGume;
		this.tipFelne = tipFelne;
		this.maxBrzinaGume = maxBrzinaGume;
	}
	
	public String informacijeOTocku() {
		return "Felna : " + tipFelne + " precnik " + precnik;
	}
	
	public void stampajInformacijeOTocku() {
		System.out.println(informacijeOTocku());
	}
}
