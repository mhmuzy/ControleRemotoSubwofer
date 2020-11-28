package Hitss.Treinamento.Controller;

import java.util.Scanner; /// *** Importando do Assembly para mandar as Informa��es pelo Teclado

import Hitss.Treinamento.Repository.ControleRemotoRepository; /// *** Importando
import Hitss.Treinamento.Classes.ControleRemoto; /// *** Importando

public class Controller {
	/// *** Declara��o da Controller
	public void Reproduzir() {
		/// *** Declara��o do M�todo Reproduzir
		System.out.println(""); /// *** Pula 1 linha
		System.out.println("        Hitss Treinamento"); /// *** Enunciado do Programa
		System.out.println(""); /// *** Pula 1 linha
		System.out.println("Deseja ligar o Controle Remoto?"); /// *** Programa Informa se deseja ligar o controle remoto
		System.out.println("(1) - Sim"); /// *** Op��o Sim
		System.out.println("(2) - N�o"); /// *** Op��o N�o
		
		System.out.println(""); /// *** Pula 1 Linha

		Scanner teclado = new Scanner(System.in); /// *** Comando para mandar as informa��es pelo teclado
		
		try { /// *** Inicializa��o do Tratamento
		
		int opcao = teclado.nextInt(); /// *** Vari�vel Op��o para mandar as informa��es pelo teclado
		
		System.out.println(""); /// *** Pula 1 linha
		
		ControleRemotoRepository controleRemotoRepository = new ControleRemotoRepository(); /// *** Classe Reposit�rio Controle Remoto 
		
		ControleRemoto controleRemoto = new ControleRemoto(50, false, false);  /// *** Classe Controle Remoto
		
		switch (opcao) { /// *** Inicializa��o do Comando Case
		case 1: /// *** Caso a op��o seja 1
			
			controleRemotoRepository.ligar(controleRemoto); /// *** Controle Remoto Repository Vai Obter o M�todo de Ligar
			
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Selecione a op��o desejada:"); /// *** O Programa informa para selecionar a op��o desejada
			//System.out.println("(1) - Desligar");
			System.out.println("(2) - Abrir Menu"); /// *** Op��o 2 - Abrir Menu
			System.out.println("(3) - Fechar Menu"); /// *** Op��o 3 - Fechar Menu
			System.out.println("(4) - Aumentar o Volume"); /// *** Op��o 4 - Aumentar o Volume
			System.out.println("(5) - Diminuir o Volume"); /// *** Op��o 5 - Diminuir o Volume
			System.out.println("(6) - Botar no Mudo"); /// *** Op��o 6 - Botar no Mudo
			System.out.println("(7) - Tirar do Mudo");  /// *** Op��o 7 - Tirar do Mudo
			System.out.println("(8) - Apertar o Play"); /// *** Op��o 8 - Apertar o Play
			System.out.println("(9) - Dar Pause"); /// *** Op��o 9 - Dar Pause
			
			System.out.println(""); /// *** Pular 1 Linha
			
			int num = teclado.nextInt(); /// *** Declara��o da Vari�vel que vai digitar o n�mero para selecionar as op��es informadas
			
			System.out.println(""); /// *** Pula 1 Linha
			
			/*if (num == 1) {
				controleRemotoRepository.desligar(controleRemoto);
			} else */if (num == 2) { /// *** Se N�mero for igual a 2
				controleRemotoRepository.abrirMenu(controleRemoto); /// *** Controle Remoto Vai Abrir o Menu
			} else if (num == 3) { /// *** Se N�mero for igual a 3
				controleRemotoRepository.fecharMenu(controleRemoto); /// *** Controle Remoto Vai Fechar o Menu
			} else if (num == 4) { /// *** Se N�mero for igual a 4
				controleRemotoRepository.maisVolume(controleRemoto); /// *** Controle Remoto Vai Aumentar o Volume
			} else if (num == 5) { /// *** Se N�mero for igual a 5
				controleRemotoRepository.menosVolume(controleRemoto); /// *** Controle Remoto Vai Diminir o Volume
			} else if (num == 6) { /// *** Se N�mero for igual a 6
				controleRemotoRepository.ligarMudo(controleRemoto); /// *** Controle Remoto Vai Ficar no Mudo
			} else if (num == 7) { /// *** Se o n�mero for igual a 7
				controleRemotoRepository.desligarMudo(controleRemoto); /// *** Controle Remoto Vai Desligar o Mudo
			} else if (num == 8) { /// *** Se o n�mero for igual a 8
				controleRemotoRepository.play(controleRemoto); /// *** O Controle Remoto Vaui dar o Play
			} else if (num == 9) { /// *** Se o n�mero for igual a 9
				controleRemotoRepository.pause(controleRemoto); /// *** O Controle Remoto Vai dar o Pause
			} else { /// *** Se Digitar o n�mero Fora das Op��es Informadas
				System.out.println(""); /// *** Pula Uma Linha
				System.out.println("Por favor, selecione a op��o desejada."); /// *** O Programa vai pedir para selecionar a op��o desejada
			}
			
			System.out.println(""); /// *** Pula 1 linha
			
			System.out.println("Deseja desligar o Controle?"); /// *** O Programa Pergunta se Deseja Desligar o Controle
			System.out.println("(1) - Sim"); /// *** Op��o 1 - Sim
			System.out.println("(2) - N�o"); /// *** Op��o 2 - N�o
			
			System.out.println(""); /// *** Pula 1 Linha
			
			int num2 = teclado.nextInt(); /// *** Declara��o da Vari�vel Para Digitar a Op��o se Deseja ou n�o desligar o Controle Remoto
			
			if (num2 == 1) { /// *** Se o N�mero for igual a 1
				controleRemotoRepository.desligar(controleRemoto); /// *** Controle Remoto Ser� Desligado
			} else if (num2 == 2) { /// *** Se o N�mero for igual a 2
				System.out.println(""); /// *** Pula 1 Linha
				System.out.println("Ok, o controle remoto continua ativado"); /// *** O Programa Informa que o Controle Remoto Continua Ativado
			} else { /// *** Se digitar um n�mero que n�o est� batendo com as op��es informadas
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("Por favor, selecione a op��o desejada"); /// *** O Programa pede para selecionar a op��o desejada
			}
			
			break;
		case 2: /// *** Caso a Op��i Inicial Seja 2
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("Ok, o controle remoto continua desativado."); /// *** O Programa Informa que o Controle Remoto Continua Desativado
			break;
		default: /// *** Caso a Op��o Inicial N�o coloca os N�meros que est�o Batendo com o que est� pedindo
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Por favor, selecione a op��o desejada"); /// *** O Programa Pede Para Selecionar a Op��o Desejada
			break;
		}
		
		} catch (Exception e) { /// *** Se o Processo do Programa Cair no catch
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Erro de processamento: " + e.getMessage()); /// *** O Programa Informa o Bug
		}
	}
}
