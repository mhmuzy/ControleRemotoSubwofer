package Hitss.Treinamento.Infra;

import Hitss.Treinamento.Classes.ControleRemoto; /// *** Importando

public interface IController {
	/// *** Declaração da Interface Controller
	public abstract void ligar(ControleRemoto controleRemoto); /// *** Método de Ligar o Controle
	public abstract void desligar(ControleRemoto controleRemoto); /// *** Método de Desligar o Controle
	public abstract void abrirMenu(ControleRemoto controleRemoto);
	public abstract void fecharMenu(ControleRemoto controleRemoto);
	public abstract void maisVolume(ControleRemoto controleRemoto);
	public abstract void menosVolume(ControleRemoto controleRemoto);
	public abstract void ligarMudo(ControleRemoto controleRemoto);
	public abstract void desligarMudo(ControleRemoto controleRemoto);
	public abstract void play(ControleRemoto controleRemoto);
	public abstract void pause(ControleRemoto controleRemoto);
}
