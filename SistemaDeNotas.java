
import java.util.Scanner;

public class SistemaDeNotas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int aluno = 1; aluno <= 10; aluno++) {
      System.out.printf("Digite o nome do aluno %d: ", aluno);
      String nome = scanner.nextLine();

      double soma = 0;
      for (int nota = 1; nota <= 5; nota++) {
        double notaMaxima = 20; // Cada nota vale no máximo 20 (5 notas * 20 = 100 total)
        do {
          System.out.printf("Digite a nota %d do aluno %s (máximo %.1f): ", nota, nome, notaMaxima);
          double notaAtual = scanner.nextDouble();
          if (notaAtual <= notaMaxima) {
            soma += notaAtual;
            break;
          } else {
            System.out.println("Nota inválida! A nota deve ser menor ou igual a " + notaMaxima);
          }
        } while (true);
        scanner.nextLine();
      }

      double media = soma / 5;
      System.out.printf("\nNotas do aluno %s:\n", nome);
      System.out.printf("Total: %.2f/100\n", soma);
      System.out.printf("Média: %.2f\n", media);

      if (soma >= 90 && soma <= 100) {
        System.out.println("Status: Aprovado com certificado");
      } else if (soma >= 70 && soma <= 89) {
        System.out.println("Status: Aprovado");
      } else if (soma >= 60 && soma <= 69) {
        System.out.println("Status: Recuperação final");
      } else {
        System.out.println("Status: Reprovado");
      }
      System.out.println();
    }

    scanner.close();
  }
}
