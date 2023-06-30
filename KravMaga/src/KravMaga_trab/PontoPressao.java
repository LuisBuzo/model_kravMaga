package KravMaga_trab;

public class PontoPressao {
	private String local;
	private float pressao;
	private Dano dano;
	private Desconforto desconforto;
	
	
	public Dano getDano() {
		return dano;
	}
	public void setDano(Dano dano) {
		this.dano = dano;
	}
	public Desconforto getDesconforto() {
		return desconforto;
	}
	public void setDesconforto(Desconforto desconforto) {
		this.desconforto = desconforto;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public float getPressao() {
		return pressao;
	}
	public void setPressao(float pressao) {
		this.pressao = pressao;
	}
	
	
}
