package Hitss.Treinamento.Controller;

import java.util.Scanner; /// *** Importando do Assembly para mandar as Informações pelo Teclado

import Hitss.Treinamento.Repository.ControleRemotoRepository; /// *** Importando
import Hitss.Treinamento.Classes.ControleRemoto; /// *** Importando

public class Controller {
	/// *** Declaração da Controller
	public void Reproduzir() {
		/// *** Declaração do Método Reproduzir
		System.out.println(""); /// *** Pula 1 linha
		System.out.println("        Hitss Treinamento"); /// *** Enunciado do Programa
		System.out.println(""); /// *** Pula 1 linha
		System.out.println("Deseja ligar o Controle Remoto?"); /// *** Programa Informa se deseja ligar o controle remoto
		System.out.println("(1) - Sim"); /// *** Opção Sim
		System.out.println("(2) - Não"); /// *** Opção Não
		
		System.out.println(""); /// *** Pula 1 Linha

		Scanner teclado = new Scanner(System.in); /// *** Comando para mandar as informações pelo teclado
		
		try { /// *** Inicialização do Tratamento
		
		int opcao = teclado.nextInt(); /// *** Variável Opção para mandar as informações pelo teclado
		
		System.out.println(""); /// *** Pula 1 linha
		
		ControleRemotoRepository controleRemotoRepository = new ControleRemotoRepository(); /// *** Classe Repositório Controle Remoto 
		
		ControleRemoto controleRemoto = new ControleRemoto(50, false, false);  /// *** Classe Controle Remoto
		
		switch (opcao) { /// *** Inicialização do Comando Case
		case 1: /// *** Caso a opção seja 1
			
			controleRemotoRepository.ligar(controleRemoto); /// *** Controle Remoto Repository Vai Obter o Método de Ligar
			
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Selecione a opção desejada:"); /// *** O Programa informa para selecionar a opção desejada
			//System.out.println("(1) - Desligar");
			System.out.println("(2) - Abrir Menu"); /// *** Opção 2 - Abrir Menu
			System.out.println("(3) - Fechar Menu"); /// *** Opção 3 - Fechar Menu
			System.out.println("(4) - Aumentar o Volume"); /// *** Opção 4 - Aumentar o Volume
			System.out.println("(5) - Diminuir o Volume"); /// *** Opção 5 - Diminuir o Volume
			System.out.println("(6) - Botar no Mudo"); /// *** Opção 6 - Botar no Mudo
			System.out.println("(7) - Tirar do Mudo");  /// *** Opção 7 - Tirar do Mudo
			System.out.println("(8) - Apertar o Play"); /// *** Opção 8 - Apertar o Play
			System.out.println("(9) - Dar Pause"); /// *** Opção 9 - Dar Pause
			
			System.out.println(""); /// *** Pular 1 Linha
			
			int num = teclado.nextInt(); /// *** Declaração da Variável que vai digitar o número para selecionar as opções informadas
			
			System.out.println(""); /// *** Pula 1 Linha
			
			/*if (num == 1) {
				controleRemotoRepository.desligar(controleRemoto);
			} else */if (num == 2) { /// *** Se Número for igual a 2
				controleRemotoRepository.abrirMenu(controleRemoto); /// *** Controle Remoto Vai Abrir o Menu
			} else if (num == 3) { /// *** Se Número for igual a 3
				controleRemotoRepository.fecharMenu(controleRemoto); /// *** Controle Remoto Vai Fechar o Menu
			} else if (num == 4) { /// *** Se Número for igual a 4
				controleRemotoRepository.maisVolume(controleRemoto); /// *** Controle Remoto Vai Aumentar o Volume
			} else if (num == 5) { /// *** Se Número for igual a 5
				controleRemotoRepository.menosVolume(controleRemoto); /// *** Controle Remoto Vai Diminir o Volume
			} else if (num == 6) { /// *** Se Número for igual a 6
				controleRemotoRepository.ligarMudo(controleRemoto); /// *** Controle Remoto Vai Ficar no Mudo
			} else if (num == 7) { /// *** Se o número for igual a 7
				controleRemotoRepository.desligarMudo(controleRemoto); /// *** Controle Remoto Vai Desligar o Mudo
			} else if (num == 8) { /// *** Se o número for igual a 8
				controleRemotoRepository.play(controleRemoto); /// *** O Controle Remoto Vaui dar o Play
			} else if (num == 9) { /// *** Se o número for igual a 9
				controleRemotoRepository.pause(controleRemoto); /// *** O Controle Remoto Vai dar o Pause
			} else { /// *** Se Digitar o número Fora das Opções Informadas
				System.out.println(""); /// *** Pula Uma Linha
				System.out.println("Por favor, selecione a opção desejada."); /// *** O Programa vai pedir para selecionar a opção desejada
			}
			
			System.out.println(""); /// *** Pula 1 linha
			
			System.out.println("Deseja desligar o Controle?"); /// *** O Programa Pergunta se Deseja Desligar o Controle
			System.out.println("(1) - Sim"); /// *** Opção 1 - Sim
			System.out.println("(2) - Não"); /// *** Opção 2 - Não
			
			System.out.println(""); /// *** Pula 1 Linha
			
			int num2 = teclado.nextInt(); /// *** Declaração da Variável Para Digitar a Opção se Deseja ou não desligar o Controle Remoto
			
			if (num2 == 1) { /// *** Se o Número for igual a 1
				controleRemotoRepository.desligar(controleRemoto); /// *** Controle Remoto Será Desligado
			} else if (num2 == 2) { /// *** Se o Número for igual a 2
				System.out.println(""); /// *** Pula 1 Linha
				System.out.println("Ok, o controle remoto continua ativado"); /// *** O Programa Informa que o Controle Remoto Continua Ativado
			} else { /// *** Se digitar um número que não está batendo com as opções informadas
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("Por favor, selecione a opção desejada"); /// *** O Programa pede para selecionar a opção desejada
			}
			
			break;
		case 2: /// *** Caso a Opçãi Inicial Seja 2
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("Ok, o controle remoto continua desativado."); /// *** O Programa Informa que o Controle Remoto Continua Desativado
			break;
		default: /// *** Caso a Opção Inicial Não coloca os Números que estão Batendo com o que está pedindo
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Por favor, selecione a opção desejada"); /// *** O Programa Pede Para Selecionar a Opção Desejada
			break;
		}
		
		} catch (Exception e) { /// *** Se o Processo do Programa Cair no catch
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Erro de processamento: " + e.getMessage()); /// *** O Programa Informa o Bug
		}
	}
}
