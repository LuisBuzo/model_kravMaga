package KravMaga_trab;

public class CombateSombra implements Visitante {
	@Override public boolean visitar(Luva luva) {
		if(luva.getEstilo()=="mma") {
			luva.equipar();
			return true;
		}else {
			return false;
		}
	}
	@Override public boolean visitar(Caneleira caneleira) {
		if(caneleira.getNivel()=="avancado") {
			caneleira.equipar();
			return true;
		}else {
			return false;
		}
	}
	@Override public boolean visitar(BodyGuard bodyGuard) {
			return false;
	}
	
}
