import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("| Digite 1 - Cadastro |");
        System.out.println("| Digite 2 - Consulta |");
        System.out.println("-----------------------");

        String Nome = null;
        int numM;
        int numMD;
        int N;
        N = scanner.nextInt();
        scanner.nextLine();

        if (N == 1) {
            System.out.println("Nome completo do aluno: ");
            Nome = scanner.nextLine();
            System.out.println("Numero de matricula do aluno: ");
            numM = scanner.nextInt();
            System.out.println("Cadastro realizado! ");

        } else if (N == 2) {
            System.out.println("Digite o nome completo do aluno para consulta: ");
            Nome = scanner.nextLine();
            System.out.println("Digite a matricula do aluno para consulta: ");
            numMD = scanner.nextInt();

            System.out.println("O aluno: " +Nome + "." +" Da matricula: " + numMD + " já está cadastrado! ");
        }
            scanner.close();
    }
}