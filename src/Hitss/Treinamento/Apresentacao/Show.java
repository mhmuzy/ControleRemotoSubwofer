package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Controller.Controller; /// *** Importando
import Hitss.Treinamento.Infra.IController; /// *** Importando

public class Show {

	public static void main(String[] args) {
		
		Controller controller = new Controller(); /// *** Declaração da Classe Controller
		controller.Reproduzir(); /// *** Controller vai reproduzir
	}
}
