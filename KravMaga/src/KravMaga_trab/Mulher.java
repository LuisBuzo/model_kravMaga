package KravMaga_trab;

public class Mulher implements Moreh {
	@Override public void ensinaDesconforto(PontoPressao p) {
		p.setDesconforto(new Desconforto());
		p.getDesconforto().setDificuldade(5);
	}
	@Override public void ensinaDano(PontoPressao p) {
		p.setDano(new Dano());
		p.setLocal("Pomo de Adão");
		p.getDano().setPermanente(true);
		p.getDano().setEspecifico(true);
	}
	@Override public void ensinaMaoLivre(Livramento l) {
		l.setMaoLivre(new MaoLivre());
		l.getMaoLivre().setPosicaoInimigo("Frente");
		l.getMaoLivre().setInimigoAcompanhado(false);
	}
	@Override public void ensinaArmaFogo(Livramento l) {
		l.setArmaFogo(new ArmaFogo());
		l.getArmaFogo().setDistancia("Curta");
		l.getArmaFogo().setAssalto(false);
	}
	@Override public void ensinaFaca(Livramento l) {
		l.setFaca(new Faca());
		l.getFaca().setEstadoAgressor("Nervoso");
		l.getFaca().setDistancia("Longa");
	}
	@Override public void ensinaArmaBranca(Livramento l) {
		l.setArmaBranca(new ArmaBranca());
		l.getArmaBranca().setTipoArma("Bastao");
		l.getArmaBranca().setSituacaoAmbiente("Publico");
	}
}
