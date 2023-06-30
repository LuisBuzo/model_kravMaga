package KravMaga_trab;

public class Homem implements Moreh {
	@Override public void ensinaDesconforto(PontoPressao p) {
		p.setDesconforto(new Desconforto());
		p.getDesconforto().setDificuldade(10);
	}
	@Override public void ensinaDano(PontoPressao p) {
		p.setDano(new Dano());
		p.setLocal("Tempora");
		p.setPressao(20);
		p.getDano().setPermanente(false);
		p.getDano().setEspecifico(false);
	}
	@Override public void ensinaMaoLivre(Livramento l) {
		l.setMaoLivre(new MaoLivre());
		l.setNivel(1);
		l.setBase("Direita");
		l.getMaoLivre().setPosicaoInimigo("Frente");
		l.getMaoLivre().setInimigoAcompanhado(true);
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
