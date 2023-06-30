package KravMaga_trab;

public class ArmaFogo extends Livramento {
	private String distancia;
	private boolean assalto;
	
	public void reagir() {
		if(getDistancia()=="Curta" && isAssalto()==false) {
			System.out.println("Perigo, reaja!");
		}
	}
	
	public String getDistancia() {
		return distancia;
	}
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	public boolean isAssalto() {
		return assalto;
	}
	public void setAssalto(boolean assalto) {
		this.assalto = assalto;
	}
	
	
}
