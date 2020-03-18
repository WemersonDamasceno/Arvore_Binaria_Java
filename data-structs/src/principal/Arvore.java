package principal;
import tree.BinarySeachTree;
import principal.No;

public class Arvore implements BinarySeachTree {
	private static No raiz;
	
	private No buscarNo(No node, int value) {
		 if (node != null) {
			 if(node.getValue() == value) {
				 System.out.println("Sucess | O valor "+value+" foi encontrado!");
				 return node;
			 }
			 if(value > node.getValue()) {
				 buscarNo(node.getRightChild(), value);
				 return node;
			}
			 if(value < node.getValue()){
				buscarNo(node.getLeftChild(), value); 
				return node;
			 }
		 }
		 System.out.println("Fail | O valor "+value+" não foi encontrado!");
		 return null;
	}
	public void ordem(No node) {
        if (node != null) { 
            ordem(node.getLeftChild());
            System.out.print(node.getValue() + ", ");
            ordem(node.getRightChild());
        }
    }
	@Override
	public No search(int value) {
		return buscarNo(getRoot(), value);
	}
	@Override
	public boolean insert(int value) {
		addNo(getRoot(), value);		
		return false;
	}
	@Override
	public No getRoot() {
		if(raiz == null) {
			return null;
		}
		return raiz;
	}
	private No addNo (No node, int value){
		if (node == null) {
            System.out.println("A raiz é (" + value+")");
            raiz = new No(value);
        } else {
            if (value < node.getValue()) {
                if (node.getLeftChild() != null) {
                    addNo(node.getLeftChild(), value);
                } else {
                    System.out.println("Inserindo (" + value + ") a esquerda de (" + node.getValue()+")");
                    No no1 = new No(value);
                    node.setEsquerda(no1);
                }

            } 
            else if(value > node.getValue()) {
            	 if (node.getRightChild() != null) {
                     addNo(node.getRightChild(), value);
                 } else {
                     System.out.println("Inserindo ("+ value + ") a direita de (" + node.getValue()+")");
                     No no2 = new No(value);
                     node.setDireita(no2);
                 }
            } else {
            	System.out.println("Fail | O valor ("+value+") já existe!");
            }
        }
		return node;
	}
	
	@Override
	public No searchAndRemove(int value) {
		//AINDA FALTA IMPLEMENTAR ISSO 
		return null;
	}
	
}
