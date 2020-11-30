package Hitss.Treinamento.Infra;

import Hitss.Treinamento.Classes.ControleRemoto; /// *** Importando

public interface IController {
	/// *** Declaração da Interface Controller
	public abstract void ligar(ControleRemoto controleRemoto); /// *** Método de Ligar o Controle
	public abstract void desligar(ControleRemoto controleRemoto); /// *** Método de Desligar o Controle
	public abstract void abrirMenu(ControleRemoto controleRemoto); /// *** Método de Abrir o Menu
	public abstract void fecharMenu(ControleRemoto controleRemoto); /// *** Método de Fechar o Menu
	public abstract void maisVolume(ControleRemoto controleRemoto); /// *** Método de Aumentar o Volume
	public abstract void menosVolume(ControleRemoto controleRemoto); /// *** Método de Diminuir o Volume
	public abstract void ligarMudo(ControleRemoto controleRemoto); /// *** Método de Botar no Mudo
	public abstract void desligarMudo(ControleRemoto controleRemoto); /// *** Método de Tirar do Mudo
	public abstract void play(ControleRemoto controleRemoto); /// *** Método de Apertar o Play
	public abstract void pause(ControleRemoto controleRemoto); /// *** Método de Apertar o Pause
}
