package KravMaga_trab;

public class MaoLivre extends Livramento{
	private String posicaoInimigo;
	private boolean inimigoAcompanhado;
	
	public void acompanhado() {
		if (isInimigoAcompanhado() == true) {
			System.out.println("Atencao, inimigo acompanhado, desvantagem");
		}
	}
	public String getPosicaoInimigo() {
		return posicaoInimigo;
	}

	public void setPosicaoInimigo(String posicaoInimigo) {
		this.posicaoInimigo = posicaoInimigo;
	}

	public boolean isInimigoAcompanhado() {
		return inimigoAcompanhado;
	}

	public void setInimigoAcompanhado(boolean inimigoAcompanhado) {
		this.inimigoAcompanhado = inimigoAcompanhado;
	}
	
}
