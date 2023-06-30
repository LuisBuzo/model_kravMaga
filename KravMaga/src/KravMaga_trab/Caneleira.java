package KravMaga_trab;

public class Caneleira extends Equipamento {
	private int protecao;
	private String nivel;
	
	public void equipar() {
		System.out.println("Equipe caneleira nivel " + getNivel() + " com protecao de " + getProtecao());
		if(getContato() == "base") {
			System.out.println("Cuidado, pouca protecao");
		}else {
			System.out.println("Protegido(a)");
		}
	}
	@Override public boolean aceitar(Visitante v) {
		return v.visitar(this);
	}
	public int getProtecao() {
		return protecao;
	}
	public void setProtecao(int protecao) {
		this.protecao = protecao;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}

