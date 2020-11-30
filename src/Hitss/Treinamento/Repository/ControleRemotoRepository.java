package Hitss.Treinamento.Repository;

import Hitss.Treinamento.Classes.ControleRemoto; /// *** Importando
import Hitss.Treinamento.Infra.IController; /// *** Importando

public class ControleRemotoRepository implements IController {
 /// *** Declaração da Classe do Repositório do Controle Remoto Implementado pela Interface Controller
	@Override
	public void ligar(ControleRemoto controleRemoto) {
		/// *** Método de Ligar
		controleRemoto.setLigado(true); /// *** Ligado Recebe True
	}

	@Override
	public void desligar(ControleRemoto controleRemoto) { /// *** Método de Desligar
		controleRemoto.setLigado(false); /// *** Ligado Recebe False
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("Até Logo."); /// *** O Programa Informa Até Logo
	}

	@Override
	public void abrirMenu(ControleRemoto controleRemoto) {
		/// *** Método de Abrir Menu
		try {
			/// *** Inicialização do Tratamento
		if (controleRemoto.getLigado()) {	
			/// *** Se o Controle Remoto estiver ligado
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("---- MENU ----"); 
			/// *** O Enunciado Menu
			String RespostaLigado = controleRemoto.getLigado()? "Sim" : "Não";
			/// *** Declaração da Variável da Resposta da Ligação se o Controle Remoto estiver Ligado a mensagem vem como Sim, caso contrário vem como Não			
			String RespostaTocando = controleRemoto.getTocando()? "Sim" : "Não";
			/// *** Declaração da variável que define se o controle remoto está tocando Vai Vim Sim, caso contrario, Não
			System.out.println("Está Ligado? " + RespostaLigado);
			/// *** O Programa Informa se o Controle Remoto Está Ligado
			System.out.println("Está Tocando? " + RespostaTocando);
			/// *** O Programa Infirma se o Controle Remoto está tocando
			System.out.print("Volume: " + controleRemoto.getVolume());
			/// *** O Programa informa o Volume do Controle Remoto
			for (int i = 0; i <= controleRemoto.getVolume(); i+=10) {
				/// *** Comando para mandar a onda de Frequência do Controle Remoto
				System.out.print("|"); /// *** Informar a Onda de Frequencia do Controle Remoto
			}
		} else { /// *** Se não foi aberto o Menu
			System.out.println("Não consegui abrir o menu"); /// *** O Programa Informa quan não conseguiu abrir o menu
		}
		System.out.println(""); /// *** Pula 1 Linha
		} catch (Exception e) { /// *** Comando do catch
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Erro de processamento: " + e.getMessage()); /// *** O Programa informa a mensagem do erro
		}
	}

	@Override
	public void fecharMenu(ControleRemoto controleRemoto) { /// *** Método de Fechar o Menu
		if (controleRemoto.getLigado()) { /// *** Se o Controle Remoto estiver ligado
			System.out.println("Fechando Menu..."); /// *** O Programa Informa para fechar o Menu
		}
	}

	@Override
	public void maisVolume(ControleRemoto controleRemoto) { /// *** Método de Aumentar o Volume
		if (controleRemoto.getLigado()) { /// *** Se o Controle Remoto estiver Ligado
			controleRemoto.setVolume(controleRemoto.getVolume() + 5); /// *** O Volume Aumenta 5 Pontos
			System.out.print("Volume"); /// *** O Programa Informa o Volume
			for (int i = 0; i <= controleRemoto.getVolume() + 50; i+=10) { /// *** Comando Para Aumentar a Onda de Frequancia
				System.out.print("|"); /// *** Informar a Onda de Frequencia
			}
			System.out.println(""); /// *** Pula 1 Linha
		} else { /// *** Se o Controle Remoto Estiver desligado
			System.out.println("Impossível aumentar o volume"); /// *** O Programa informa Impossível aumentar o volume
		}
	}

	@Override
	public void menosVolume(ControleRemoto controleRemoto) { /// *** Comando para diminuir o Volume
		if (controleRemoto.getLigado()) { /// *** Se o Controle Remoto Estiver Ligado
			controleRemoto.setVolume(controleRemoto.getVolume() - 5); /// *** O Volume Diminui 5 pontos
			System.out.println("Volume ||");  /// *** O Programa Informa a Frequência do Volume
			System.out.println(""); /// *** Pula 1 Linha
		} else { /// *** Se o Controle Remoto Estiver Desligado
			System.out.println("Impossível diminuir o volume"); /// *** O Programa Informa que é Impossível diminuir o volume
		}
	}

	@Override
	public void ligarMudo(ControleRemoto controleRemoto) { /// *** Método de Apertar o Mudo
		if (controleRemoto.getLigado() && controleRemoto.getVolume() > 0) { /// *** Se o Controle Remoto Estiver Ligado e o Volume estiver acima de 0
			controleRemoto.setVolume(0); /// *** Volume Fica no Mudo
			System.out.println("Volume 0"); /// *** O Programa Informa o Volume no Mudo
			System.out.println(""); /// *** Pula 1 Linha
		}
	}

	@Override
	public void desligarMudo(ControleRemoto controleRemoto) { /// *** Método Para Tirar do Mudo
		if (controleRemoto.getLigado() && controleRemoto.getVolume() == 0) { /// *** Se o Controle Remoto Estiver Ligado e o Volume Estiver no Mudo
			controleRemoto.setVolume(50); /// *** Volume Recebe 50
		} else { /// *** Caso Contrário
			System.out.println("Impossível Tirar do Mudo"); /// *** O Programa Informa que é Impossível Tirar do Mudo
		}
	}

	@Override
	public void play(ControleRemoto controleRemoto) { /// *** Método Apertar o Play
		if (controleRemoto.getLigado() && (!controleRemoto.getTocando())) { /// *** Se o Controle Remoto Estiver Ligado e Não Tocando
			controleRemoto.setTocando(true); /// *** Controle Remoto Começa a Tocar
			System.out.println("Música Tocando..."); /// *** O Programa Informa que a Música está tocando
			System.out.println(""); /// *** Pula 1 Linh
		} else { /// *** Caso Contrário
			System.out.println("Não consegui reproduzir"); /// *** O Programa Informa que não conseguiu reproduzir
		}
	}

	@Override
	public void pause(ControleRemoto controleRemoto) { /// *** Método de Dar o Pause
		if (controleRemoto.getLigado() && controleRemoto.getTocando()) { /// *** Se o Controle Remoto Estiver Ligado e Tocando
			controleRemoto.setTocando(false); /// *** O Controle Remoto Para de Tocar
			System.out.println("Música Pausada..."); /// *** O Programa Informa que a Música está pausada
			System.out.println(""); /// *** Pula 1 Linha
		} else { /// *** Caso Contrário
			System.out.println("Não consegui pausar"); /// *** O Programa Informa que não conseguiu Pausar
		}
	}

}
