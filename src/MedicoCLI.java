import java.util.Scanner;

public class MedicoCLI {
  public static void exibirMenu() {
    System.out.print("""
            ******* MENU *******
            1 - Adicionar
            2 - Listar
            0 - Sair
            """);
  }

  public static String respostaMenu(Scanner sc) {
    System.out.print("Escolha uma opção: ");
    return sc.nextLine();
  }
}
