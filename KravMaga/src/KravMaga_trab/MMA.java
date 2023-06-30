package KravMaga_trab;

public class MMA implements Visitante{
	@Override public boolean visitar(Luva luva) {
		if(luva.getEstilo()=="mma") {
			luva.equipar();
			return true;
		}else {
			return false;
		}
	}
	@Override public boolean visitar(Caneleira caneleira) {
			return false;
		}
	@Override public boolean visitar(BodyGuard bodyGuard) {
			return false;
		}
}
