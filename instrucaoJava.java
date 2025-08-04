import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        
        System.out.println("Digite o valor da sua primeira nota:");
        nota1 = input.nextDouble();
        
        System.out.println("Digite o valor da sua segunda nota:");
        nota2 = input.nextDouble();
        
        System.out.println("Digite o valor da sua terceira nota:");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Sua média é igual a " + media);
        
        if (media >= 7) {
            System.out.println("Parabéns, você foi Aprovado!!");
        } else if (media <= 4) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Faça as provas finais");
        }

        input.close(); // fecha o Scanner
    }
}
