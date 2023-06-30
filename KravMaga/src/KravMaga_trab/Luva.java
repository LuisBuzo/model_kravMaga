package KravMaga_trab;

public class Luva extends Equipamento {
	private String estilo;
	private int preenchimento;
	
	public void equipar() {
		System.out.println("Equipar luva de " + getEstilo() + " com preenchimento de " + getPreenchimento() + "oz");		
		if(getContato() == "base") {
			System.out.println("Cuidado, pouca protecao");
		}else {
			System.out.println("Protegido(a)");
		}
	}
	@Override public boolean aceitar(Visitante v) {
		return v.visitar(this);
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getPreenchimento() {
		return preenchimento;
	}
	public void setPreenchimento(int preenchimento) {
		this.preenchimento = preenchimento;
	}
	
}
