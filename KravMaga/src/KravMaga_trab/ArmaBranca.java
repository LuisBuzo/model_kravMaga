package KravMaga_trab;

public class ArmaBranca extends Livramento {
	private String tipoArma;
	private String situacaoAmbiente;
	
	public void desfavoravel() {
		if(getSituacaoAmbiente()=="Armado") {
			System.out.println("Se prepare");
		}
	}
	public String getTipoArma() {
		return tipoArma;
	}
	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}
	public String getSituacaoAmbiente() {
		return situacaoAmbiente;
	}
	public void setSituacaoAmbiente(String situacaoAmbiente) {
		this.situacaoAmbiente = situacaoAmbiente;
	}
	
	
}
