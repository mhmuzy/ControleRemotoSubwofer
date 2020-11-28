package Hitss.Treinamento.Classes;


public class ControleRemoto {
	/// *** Declara��o da Classe Controle
	boolean permissao = true; /// *** Declara��o da varivael permiss�o que vai receber True
	
	private int volume; /// *** Atributo Volume
	private boolean ligado; /// *** Atriuto Volume
	private boolean tocando; /// *** Atributo Tocando
	
	public ControleRemoto(int volume, boolean ligado, boolean tocando) { /// *** M�todo Construtor 
		this.volume = 500; /// *** Atributo volume recebe 500
		this.ligado = !permissao; /// *** Atributo Ligado recebe False
		this.tocando = !permissao; /// *** Atributo Tocando Recebe False
	}

	public boolean getPermissao() { /// *** M�todo getPermisao
		return permissao; /// *** Retorna o Atributo Permiss�o
	}

	public void setPermissao(boolean permissao) { /// *** M�todo setPermissao
		this.permissao = permissao; /// *** Atributo Permiss�o Recebe o Par�metro Permiss�o
	}

	public int getVolume() { /// *** M�todo getVolume
		return volume; /// *** Retorna o Atributo volume
	}

	public void setVolume(int volume) { /// *** M�todo setVolume
		this.volume = volume; /// *** Atributo Volume Recebe o Par�metro Volume
	}

	public boolean getLigado() { /// *** M�todo getLigado
		return ligado; /// *** Retorna o Atributo ligado
	}

	public void setLigado(boolean ligado) { /// *** M�todo setLigado
		this.ligado = ligado; /// *** Atributo ligado recebe o Par�metro ligado
	}

	public boolean getTocando() { /// *** M�todo getTocando
		return tocando; /// *** Recebe o Atributo tocando
	}

	public void setTocando(boolean tocando) { /// *** M�todo setTocando
		this.tocando = tocando; /// *** Atributo Tocando recebe o Par�metro Tocando
	}
	
	
}
