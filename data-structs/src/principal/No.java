package principal;

import tree.Node;

public class No implements Node{
	private int value;
	private No esquerda;
	private No direita;
	//construtor
	public No (int value) {
		this.value = value;
	}
	
	
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public No getLeftChild() {
		// TODO Auto-generated method stub
		return esquerda;
	}
	@Override
	public No getRightChild() {
		// TODO Auto-generated method stub
		return direita;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	

}
