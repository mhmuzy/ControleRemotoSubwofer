package Hitss.Treinamento.Repository;

import Hitss.Treinamento.Classes.ControleRemoto; /// *** Importando
import Hitss.Treinamento.Infra.IController; /// *** Importando

public class ControleRemotoRepository implements IController {
 /// *** Declara��o da Classe do Reposit�rio do Controle Remoto Implementado pela Interface Controller
	@Override
	public void ligar(ControleRemoto controleRemoto) {
		/// *** M�todo de Ligar
		controleRemoto.setLigado(true); /// *** Ligado Recebe True
	}

	@Override
	public void desligar(ControleRemoto controleRemoto) { /// *** M�todo de Desligar
		controleRemoto.setLigado(false); /// *** Ligado Recebe False
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("At� Logo."); /// *** O Programa Informa At� Logo
	}

	@Override
	public void abrirMenu(ControleRemoto controleRemoto) {
		/// *** M�todo de Abrir Menu
		try {
			/// *** Inicializa��o do Tratamento
		if (controleRemoto.getLigado()) {	
			/// *** Se o Controle Remoto estiver ligado
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("---- MENU ----"); 
			/// *** O Enunciado Menu
			String RespostaLigado = controleRemoto.getLigado()? "Sim" : "N�o";
			/// *** Declara��o da Vari�vel da Resposta da Liga��o se o Controle Remoto estiver Ligado a mensagem vem como Sim, caso contr�rio vem como N�o			
			String RespostaTocando = controleRemoto.getTocando()? "Sim" : "N�o";
			/// *** Declara��o da vari�vel que define se o controle remoto est� tocando Vai Vim Sim, caso contrario, N�o
			System.out.println("Est� Ligado? " + RespostaLigado);
			/// *** O Programa Informa se o Controle Remoto Est� Ligado
			System.out.println("Est� Tocando? " + RespostaTocando);
			/// *** O Programa Infirma se o Controle Remoto est� tocando
			System.out.print("Volume: " + controleRemoto.getVolume());
			/// *** O Programa informa o Volume do Controle Remoto
			for (int i = 0; i <= controleRemoto.getVolume(); i+=10) {
				/// *** Comando para mandar a onda de Frequ�ncia do Controle Remoto
				System.out.print("|"); /// *** Informar a Onda de Frequencia do Controle Remoto
			}
		} else { /// *** Se n�o foi aberto o Menu
			System.out.println("N�o consegui abrir o menu"); /// *** O Programa Informa quan n�o conseguiu abrir o menu
		}
		System.out.println(""); /// *** Pula 1 Linha
		} catch (Exception e) { /// *** Comando do catch
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Erro de processamento: " + e.getMessage()); /// *** O Programa informa a mensagem do erro
		}
	}

	@Override
	public void fecharMenu(ControleRemoto controleRemoto) { /// *** M�todo de Fechar o Menu
		if (controleRemoto.getLigado()) { /// *** Se o Controle Remoto estiver ligado
			System.out.println("Fechando Menu..."); /// *** O Programa Informa para fechar o Menu
		}
	}

	@Override
	public void maisVolume(ControleRemoto controleRemoto) { /// *** M�todo de Aumentar o Volume
		if (controleRemoto.getLigado()) { /// *** Se o Controle Remoto estiver Ligado
			controleRemoto.setVolume(controleRemoto.getVolume() + 5); /// *** O Volume Aumenta 5 Pontos
			System.out.print("Volume"); /// *** O Programa Informa o Volume
			for (int i = 0; i <= controleRemoto.getVolume() + 50; i+=10) { /// *** Comando Para Aumentar a Onda de Frequancia
				System.out.print("|"); /// *** Informar a Onda de Frequencia
			}
			System.out.println(""); /// *** Pula 1 Linha
		} else { /// *** Se o Controle Remoto Estiver desligado
			System.out.println("Imposs�vel aumentar o volume"); /// *** O Programa informa Imposs�vel aumentar o volume
		}
	}

	@Override
	public void menosVolume(ControleRemoto controleRemoto) { /// *** Comando para diminuir o Volume
		if (controleRemoto.getLigado()) { /// *** Se o Controle Remoto Estiver Ligado
			controleRemoto.setVolume(controleRemoto.getVolume() - 5); /// *** O Volume Diminui 5 pontos
			System.out.println("Volume ||");  /// *** O Programa Informa a Frequ�ncia do Volume
			System.out.println(""); /// *** Pula 1 Linha
		} else { /// *** Se o Controle Remoto Estiver Desligado
			System.out.println("Imposs�vel diminuir o volume"); /// *** O Programa Informa que � Imposs�vel diminuir o volume
		}
	}

	@Override
	public void ligarMudo(ControleRemoto controleRemoto) { /// *** M�todo de Apertar o Mudo
		if (controleRemoto.getLigado() && controleRemoto.getVolume() > 0) { /// *** Se o Controle Remoto Estiver Ligado e o Volume estiver acima de 0
			controleRemoto.setVolume(0); /// *** Volume Fica no Mudo
			System.out.println("Volume 0"); /// *** O Programa Informa o Volume no Mudo
			System.out.println(""); /// *** Pula 1 Linha
		}
	}

	@Override
	public void desligarMudo(ControleRemoto controleRemoto) { /// *** M�todo Para Tirar do Mudo
		if (controleRemoto.getLigado() && controleRemoto.getVolume() == 0) { /// *** Se o Controle Remoto Estiver Ligado e o Volume Estiver no Mudo
			controleRemoto.setVolume(50); /// *** Volume Recebe 50
		} else { /// *** Caso Contr�rio
			System.out.println("Imposs�vel Tirar do Mudo"); /// *** O Programa Informa que � Imposs�vel Tirar do Mudo
		}
	}

	@Override
	public void play(ControleRemoto controleRemoto) { /// *** M�todo Apertar o Play
		if (controleRemoto.getLigado() && (!controleRemoto.getTocando())) { /// *** Se o Controle Remoto Estiver Ligado e N�o Tocando
			controleRemoto.setTocando(true); /// *** Controle Remoto Come�a a Tocar
			System.out.println("M�sica Tocando..."); /// *** O Programa Informa que a M�sica est� tocando
			System.out.println(""); /// *** Pula 1 Linh
		} else { /// *** Caso Contr�rio
			System.out.println("N�o consegui reproduzir"); /// *** O Programa Informa que n�o conseguiu reproduzir
		}
	}

	@Override
	public void pause(ControleRemoto controleRemoto) { /// *** M�todo de Dar o Pause
		if (controleRemoto.getLigado() && controleRemoto.getTocando()) { /// *** Se o Controle Remoto Estiver Ligado e Tocando
			controleRemoto.setTocando(false); /// *** O Controle Remoto Para de Tocar
			System.out.println("M�sica Pausada..."); /// *** O Programa Informa que a M�sica est� pausada
			System.out.println(""); /// *** Pula 1 Linha
		} else { /// *** Caso Contr�rio
			System.out.println("N�o consegui pausar"); /// *** O Programa Informa que n�o conseguiu Pausar
		}
	}

}
