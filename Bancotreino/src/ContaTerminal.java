import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    java.util.Scanner reader = new Scanner(System.in);

    System.out.print("Olá, introduza seu nome: ");
    String nome = reader.nextLine();

    System.out.print("Olá ".concat(nome).concat(" introduza o número da sua conta: "));
    int numeroConta = reader.nextInt();
    reader.nextLine();

    System.out.print("Agora introduza o Número da Agencia: ");
    String agenciaBanco = reader.nextLine();

    System.out.print("Introduza o valor disponivel para saque: ");
    float saque = reader.nextFloat();

    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agenciaBanco + ", conta número " + numeroConta + " e seu saldo " + saque + " já está dísponivel para saque");

  }
}
