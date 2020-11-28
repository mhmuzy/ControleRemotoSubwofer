package Hitss.Treinamento.Repository;

import Hitss.Treinamento.Classes.ControleRemoto;
import Hitss.Treinamento.Infra.IController;

public class ControleRemotoRepository implements IController {

	@Override
	public void ligar(ControleRemoto controleRemoto) {
		controleRemoto.setLigado(true);
	}

	@Override
	public void desligar(ControleRemoto controleRemoto) {
		controleRemoto.setLigado(false);
		System.out.println("");
		System.out.println("Até Logo.");
	}

	@Override
	public void abrirMenu(ControleRemoto controleRemoto) {
		try {
			
		if (controleRemoto.getLigado()) {
			System.out.println("");
			System.out.println("---- MENU ----");
			String RespostaLigado = controleRemoto.getLigado()? "Sim" : "Não";
			String RespostaTocando = controleRemoto.getTocando()? "Sim" : "Não";
			System.out.println("Está Ligado? " + RespostaLigado);
			System.out.println("Está Tocando? " + RespostaTocando);
			System.out.print("Volume: " + controleRemoto.getVolume());
			for (int i = 0; i <= controleRemoto.getVolume(); i+=10) {
				System.out.print("|");
			}
		} else {
			System.out.println("Não consegui abrir o menu");
		}
		System.out.println("");
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}

	@Override
	public void fecharMenu(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado()) {
			System.out.println("Fechando Menu...");
		}
	}

	@Override
	public void maisVolume(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado()) {
			controleRemoto.setVolume(controleRemoto.getVolume() + 5);
			System.out.print("Volume");
			for (int i = 0; i <= controleRemoto.getVolume() + 50; i+=10) {
				System.out.print("|");
			}
			System.out.println("");
		} else {
			System.out.println("Impossível aumentar o volume");
		}
	}

	@Override
	public void menosVolume(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado()) {
			controleRemoto.setVolume(controleRemoto.getVolume() - 5);
			System.out.println("Volume ||");
			System.out.println("");
		} else {
			System.out.println("Impossível diminuir o volume");
		}
	}

	@Override
	public void ligarMudo(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado() && controleRemoto.getVolume() > 0) {
			controleRemoto.setVolume(0);
			System.out.println("Volume 0");
			System.out.println("");
		}
	}

	@Override
	public void desligarMudo(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado() && controleRemoto.getVolume() == 0) {
			controleRemoto.setVolume(50);
		} else {
			System.out.println("Impossível Tirar do Mudo");
		}
	}

	@Override
	public void play(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado() && (!controleRemoto.getTocando())) {
			controleRemoto.setTocando(true);
			System.out.println("Música Tocando...");
			System.out.println("");
		} else {
			System.out.println("Não consegui reproduzir");
		}
	}

	@Override
	public void pause(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado() && controleRemoto.getTocando()) {
			controleRemoto.setTocando(false);
			System.out.println("Música Pausada...");
			System.out.println("");
		} else {
			System.out.println("Não consegui pausar");
		}
	}

}
