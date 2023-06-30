package KravMaga_trab;

public class CombateFull implements Visitante {
	@Override public boolean visitar(Luva luva) {
		if(luva.getEstilo()=="boxe") {
			luva.equipar();
			return true;
		}else {
			return false;
		}
	}
	@Override public boolean visitar(Caneleira caneleira) {
		if(caneleira.getNivel()=="iniciante") {
			caneleira.equipar();
			return true;
		}else {
			return false;
		}
	}
	@Override public boolean visitar(BodyGuard bodyGuard) {
		if(bodyGuard.getEstilo()=="full") {
			bodyGuard.equipar();
			return true;
		}else {
			return false;
		}
	}
}
