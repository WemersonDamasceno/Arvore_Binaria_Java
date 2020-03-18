package principal;

public class Principal {

	public static void main(String[] args){
		Arvore arvore = new Arvore();
		
		System.out.println("Construindo a arvore");
		arvore.insert(10);	arvore.insert(8);
		arvore.insert(15);	arvore.insert(18);
		arvore.insert(9);	arvore.insert(6);
		System.out.println("\nAdicionar o numero 6 novamente!");
		arvore.insert(6);
		System.out.println("\nBuscar por (5) e (6) na arvore!");
		arvore.search(5);	
		arvore.search(6);
		System.out.println("\n\nImprimir arvore em ordem");
		arvore.ordem(arvore.getRoot());

	}

}
