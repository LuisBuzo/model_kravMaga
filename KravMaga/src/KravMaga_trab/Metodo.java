package KravMaga_trab;

public class Metodo {
	private Moreh moreh;
	public PontoPressao ensinaPonto() {
		PontoPressao p = null;
		if(moreh!=null) {
			p = new PontoPressao();
			moreh.ensinaDesconforto(p);
			moreh.ensinaDano(p);
		}
		return p;
	}
	
	public Livramento ensinaLivramento() {
		Livramento l = null;
		if(moreh!=null) {
			l = new Livramento();
			moreh.ensinaMaoLivre(l);
			moreh.ensinaArmaFogo(l);
			moreh.ensinaFaca(l);
			moreh.ensinaArmaBranca(l);
		}
		return l;
	}
	
	public Moreh getMoreh() {
		return moreh;
	}
	public void setMoreh(Moreh moreh) {
		this.moreh = moreh;
	}
	
}
