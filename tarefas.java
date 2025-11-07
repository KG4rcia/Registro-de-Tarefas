import com.sun.tools.jconsole.JConsoleContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tarefas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> lista_tarefas = new ArrayList<>();
        ArrayList<String> lista_concluidas = new ArrayList<>();

        while (true) {
            System.out.println("\nEscolha o que quer fazer: \n\n1.Registrar tarefa.\n2.Remover tarefa.\n3.Tarefa Concluida.\n4.Visualizar tarefas.\n5.Encerrar.\n\n- > Sua escolha: ");
            String escolha = scan.nextLine();

            if (escolha.equals("1")) {
                System.out.println("Por favor, digite a tarefa que você deseja adicionar a lista: ");
                String tarefa = scan.nextLine();

                if (tarefa.isBlank()) {
                    System.out.println("--ERRO: Não é possivel adicionar uma tarefa vazia.");
                    continue;
                }
                lista_tarefas.add(tarefa);
                System.out.println("--Sucesso: Tarefa adicionada!");
            } else if (escolha.equals("2")) {
                System.out.println("Qual tarefa você deseja remover?: ");
                for (int x = 0; x < lista_tarefas.size(); x++) {
                    System.out.printf("\n%d | Tarefa: %s", x, lista_tarefas.get(x));
                }
                System.out.println("Sua escolha: ");
                String remover_tarefa = scan.nextLine();
                lista_tarefas.remove(remover_tarefa);
                System.out.println("--Sucesso: Tarefa removida com sucesso.");

            } else if(escolha.equals("3")) {
                System.out.println("Qual tarefa deseja marcar como concluido?: ");
                for (int x = 0; x < lista_tarefas.size(); x++) {
                    System.out.printf("\n%d | Tarefa: %s", x, lista_tarefas.get(x));
                }
                String concluir_item = scan.nextLine();
                lista_tarefas.remove(concluir_item);
                lista_concluidas.add(concluir_item);
                System.out.println("--Sucesso: Item foi concluido com sucesso.");
            } else if(escolha.equals("4")) {
                for(int x = 0; x < lista_tarefas.size(); x++) {
                    System.out.printf("%d | Tarefa: %s", x, lista_tarefas.get(x));
                }
            } else if (escolha.equals("5")) {
                System.out.println("Encerrando...");
                break;
            }
        }
    }
}