package KravMaga_trab;

public class BodyGuard extends Equipamento{
	private String marca;
	private String estilo;
	
	public void equipar() {
		System.out.println("Equipe o Body Guard " + getEstilo() + " da " + getMarca());
		if(getContato() == "base") {
			System.out.println("Cuidado, pouca protecao");
		}else {
			System.out.println("Protegido(a)");
		}
	}
	@Override public boolean aceitar(Visitante v) {
		return v.visitar(this);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
}
