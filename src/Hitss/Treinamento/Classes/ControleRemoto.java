package Hitss.Treinamento.Classes;


public class ControleRemoto {
	/// *** Declaração da Classe Controle
	boolean permissao = true; /// *** Declaração da varivael permissão que vai receber True
	
	private int volume; /// *** Atributo Volume
	private boolean ligado; /// *** Atriuto Volume
	private boolean tocando; /// *** Atributo Tocando
	
	public ControleRemoto(int volume, boolean ligado, boolean tocando) { /// *** Método Construtor 
		this.volume = 500; /// *** Atributo volume recebe 500
		this.ligado = !permissao; /// *** Atributo Ligado recebe False
		this.tocando = !permissao; /// *** Atributo Tocando Recebe False
	}

	public boolean getPermissao() { /// *** Método getPermisao
		return permissao; /// *** Retorna o Atributo Permissão
	}

	public void setPermissao(boolean permissao) { /// *** Método setPermissao
		this.permissao = permissao; /// *** Atributo Permissão Recebe o Parâmetro Permissão
	}

	public int getVolume() { /// *** Método getVolume
		return volume; /// *** Retorna o Atributo volume
	}

	public void setVolume(int volume) { /// *** Método setVolume
		this.volume = volume; /// *** Atributo Volume Recebe o Parâmetro Volume
	}

	public boolean getLigado() { /// *** Método getLigado
		return ligado; /// *** Retorna o Atributo ligado
	}

	public void setLigado(boolean ligado) { /// *** Método setLigado
		this.ligado = ligado; /// *** Atributo ligado recebe o Parâmetro ligado
	}

	public boolean getTocando() { /// *** Método getTocando
		return tocando; /// *** Recebe o Atributo tocando
	}

	public void setTocando(boolean tocando) { /// *** Método setTocando
		this.tocando = tocando; /// *** Atributo Tocando recebe o Parâmetro Tocando
	}
	
	
}
