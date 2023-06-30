package KravMaga_trab;

import java.util.Date;

public abstract class Equipamento {
	private String contato;
	private Date nivelGraduado;
	public abstract boolean aceitar(Visitante v);
	
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public Date getNivelGraduado() {
		return nivelGraduado;
	}
	public void setNivelGraduado(Date nivelGraduado) {
		this.nivelGraduado = nivelGraduado;
	}
	
	
	
	
}
