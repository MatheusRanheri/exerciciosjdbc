import java.util.Scanner;

public class MenuDB {
	
	public void Menu() {
		
		int opcao = 0;
		do {
		System.out.println();
		System.out.println("+==================================================================+");
		System.out.println("|        MENU                                                      |");
		System.out.println("+==================================================================+");
		System.out.println("|DIGITE:                                                           |");
		System.out.println("|[1] - Inserir                                                     |");
		System.out.println("|[2] - Listar Todos                                                |");
		System.out.println("|[3] - Pesquisar por nome aproximado (Ex: rodas que iniciam com Lu)|");
		System.out.println("|[4] - Remover                                                     |");
		System.out.println("|[5] - Atualizar                                                   |");
		System.out.println("|[6] - Sair                                                        |");
		System.out.println("+==================================================================+");
		System.out.println("Digite sua opção: ");
		
		Scanner teclado = new Scanner(System.in);
		
		
			switch(opcao) {
			case 1:
				RegistroDB.inserir(); 
				teclado.nextLine();
			break;
			
			case 2:
				
		}
	}while(opcao > 6);
		


	}
}