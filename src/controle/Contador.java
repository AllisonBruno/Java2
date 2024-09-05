package controle;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		int parametroUm = terminal.nextInt();
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
			
		}

		terminal.close();
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
		
	}
	

}
