import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    var reader = new Scanner(System.in);
    var conta = new Conta(); 

    System.out.print("Olá, introduza seu nome: ");
    conta.setNome(reader.nextLine());

    System.out.print("Olá ".concat(conta.getNome()).concat(" introduza o número da sua conta: "));
    conta.setNumeroConta(reader.nextInt());
    reader.nextLine();

    System.out.print("Agora introduza o Número da Agencia: ");
    conta.setAgenciaBanco(reader.nextLine());

    System.out.print("Introduza o valor disponivel para saque: ");
    conta.setSaque(reader.nextFloat());

    System.out.println("Olá " + conta.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + conta.getAgenciaBanco() + ", conta número " + conta.getNumeroConta() + " e seu saldo " + conta.getSaque()
         + " já está dísponivel para saque");

  }
}
