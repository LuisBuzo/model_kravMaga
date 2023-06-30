package KravMaga_trab;

public class Faca extends Livramento{
	private String estadoAgressor;
	private String distancia;
	
	public void reagirFaca() {
		if(getDistancia()=="Curta" && getEstadoAgressor()=="Nervoso") {
			System.out.println("Reaja!");
		}
		if(getDistancia()=="Longa") {
			System.out.println("Fuja!");
		}
	}
	public String getEstadoAgressor() {
		return estadoAgressor;
	}
	public void setEstadoAgressor(String estadoAgressor) {
		this.estadoAgressor = estadoAgressor;
	}
	public String getDistancia() {
		return distancia;
	}
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	
	
}
