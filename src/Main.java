import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] Ninjas = new String[6];

        Scanner entrada = new Scanner(System.in);

        int capacidadeMaxima = 6;

        int capacidade = 0;

        int inicio = 0;

        while (inicio != 3){
            System.out.println("Digite o Número da operação que deseja realizar: ");
            System.out.println("1 - Adicionar um ninja \n2 - Lista de Ninjas \n3 - sair do programa");
            inicio =  entrada.nextInt();
            entrada.nextLine();
            switch (inicio){
                case 1:
                    if (capacidade<capacidadeMaxima){
                        System.out.println("Digite o nome do ninja: ");
                        String nomeUsuario  = entrada.nextLine();
                        Ninjas[capacidade] = nomeUsuario;
                        capacidade++;
                        System.out.println("Ninja cadastrado com sucesso.");
                    }else{
                        System.out.println("Limite máximo de ninjas atingido ");
                    }
                    break;
                case 2:
                    if (capacidade == 0){
                        System.out.println("Sem usuarios no sistema");
                    } else {
                        for (int i = 0; i < capacidadeMaxima; i++) {
                            System.out.println(Ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrado......");
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
        }
     entrada.close();
    }
}
