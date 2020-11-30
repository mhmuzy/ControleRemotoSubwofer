package Hitss.Treinamento.Infra;

import Hitss.Treinamento.Classes.ControleRemoto; /// *** Importando

public interface IController {
	/// *** Declara��o da Interface Controller
	public abstract void ligar(ControleRemoto controleRemoto); /// *** M�todo de Ligar o Controle
	public abstract void desligar(ControleRemoto controleRemoto); /// *** M�todo de Desligar o Controle
	public abstract void abrirMenu(ControleRemoto controleRemoto); /// *** M�todo de Abrir o Menu
	public abstract void fecharMenu(ControleRemoto controleRemoto); /// *** M�todo de Fechar o Menu
	public abstract void maisVolume(ControleRemoto controleRemoto); /// *** M�todo de Aumentar o Volume
	public abstract void menosVolume(ControleRemoto controleRemoto); /// *** M�todo de Diminuir o Volume
	public abstract void ligarMudo(ControleRemoto controleRemoto); /// *** M�todo de Botar no Mudo
	public abstract void desligarMudo(ControleRemoto controleRemoto); /// *** M�todo de Tirar do Mudo
	public abstract void play(ControleRemoto controleRemoto); /// *** M�todo de Apertar o Play
	public abstract void pause(ControleRemoto controleRemoto); /// *** M�todo de Apertar o Pause
}
