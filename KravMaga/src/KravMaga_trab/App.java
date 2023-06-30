package KravMaga_trab;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		List<Equipamento> lista = new ArrayList<>();
		//Add equipamentos 1
		Luva l1 = new Luva();
		l1.setContato("basico");
		l1.setEstilo("mma");
		l1.setPreenchimento(20);
		lista.add(l1);
		Caneleira c1 = new Caneleira();
		c1.setContato("forte");
		c1.setProtecao(20);
		c1.setNivel("iniciante");
		lista.add(c1);
		BodyGuard b1 = new BodyGuard();
		b1.setContato("forte");
		b1.setMarca("Jugui");
		b1.setEstilo("full");
		lista.add(b1);
		//Add equipamentos 2
		Luva l2 = new Luva();
		l2.setContato("forte");
		l2.setEstilo("boxe");
		l2.setPreenchimento(75);
		lista.add(l2);
		Caneleira c2 = new Caneleira();
		c2.setContato("basico");
		c2.setProtecao(10);
		c2.setNivel("avancado");
		lista.add(c2);
		BodyGuard b2 = new BodyGuard();
		b2.setContato("basico");
		b2.setMarca("Jugui");
		b2.setEstilo("Upper");
		lista.add(b2);
		
		
		
		CombateFull cfull = new CombateFull();
		System.out.println("Preparar para full contact");
			for(Equipamento e : lista) {
				if(e.aceitar(cfull)) {
					System.out.println("Equipamento de contato " + e.getContato() + " equipado");
				}
			}
		System.out.println("\n\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n");
		CombateSombra csombra = new CombateSombra();
		System.out.println("Preparar para sombra");
			for(Equipamento e : lista) {
				if(e.aceitar(csombra)) {
					System.out.println("Equipamento de contato " + e.getContato() + " equipado");
				}
			}
		
		System.out.println("\n\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n");
		MMA mma = new MMA();
		System.out.println("Preparar para MMA");
			for(Equipamento e : lista) {
				if(e.aceitar(mma)) {
					System.out.println("Equipamento de contato " + e.getContato() + " equipado");
				}
			}
			
		System.out.println("\n\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n");	
		System.out.println("Simulação de briga de rua com arma branca");
		
		Metodo m = new Metodo();
		m.setMoreh(new Homem());
		Livramento livra1 = m.ensinaLivramento();
		System.out.println("Preparar base "+livra1.getBase());
		System.out.println("Inimigo a "+livra1.getMaoLivre().getPosicaoInimigo());
		livra1.getMaoLivre().acompanhado();
		PontoPressao p1 = m.ensinaPonto();
		System.out.println("Golpe no(a) "+p1.getLocal());
		System.out.println("Dano permanente: "+p1.getDano().isPermanente());
		
		System.out.println("\n\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n");	
		System.out.println("Simulação de briga com Arma de fogo e lutadora em desvantagem");
		
		Metodo m2 = new Metodo();
		m2.setMoreh(new Mulher());
		Livramento livra2 = m2.ensinaLivramento();
		System.out.println("Preparar base "+livra2.getBase());
		System.out.println("Inimigo a "+livra2.getMaoLivre().getPosicaoInimigo());
		livra2.getArmaFogo().reagir();
		PontoPressao p2 = m2.ensinaPonto();
		System.out.println("Golpe no(a) "+p2.getLocal());
		System.out.println("Dano permanente: "+p2.getDano().isPermanente());	
			
			
			
		
		
	}

}
