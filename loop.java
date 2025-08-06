import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String matricula, nome,situacao, turma;
		double teste, prova,media;
		
		System.out.println("Digite a sua turma:");
		turma = teclado.next();
		
		for(int i=0;i<3;i++) {
			System.out.println("Digite sua matricula:");
			matricula = teclado.next();
			System.out.println("Digite seu nome:");
			nome = teclado.next();
			System.out.println("Digite seu teste:");
			teste = teclado.nextDouble();
			System.out.println("Digite sua prova:");
			prova = teclado.nextDouble();
			media = (teste + prova)/2;
			if (media >= 7.0) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }
            
			
			System.out.println("Matricula:"+ matricula);
			System.out.println("Nome:"+ nome);
			System.out.println("Média:"+ media);
			System.out.println("Situação:"+ situacao);
		}
	}
}
	
