import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = null;
        Quadrado quadrado = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Criar Círculo");
            System.out.println("2 - Criar Quadrado");
            System.out.println("3 - Calcular área");
            System.out.println("4 - Calcular comprimento");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    circulo = new Circulo(raio);
                    System.out.println("Círculo criado com sucesso! OBS: Você definiu o raio como " + raio);
                    break;

                case 2:
                    System.out.print("Informe o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    quadrado = new Quadrado(lado);
                    System.out.println("Quadrado criado com sucesso! OBS: Você definiu o lado como " + lado);
                    break;

                case 3:
                    if (circulo == null && quadrado == null) {
                        System.out.println("Nenhuma forma foi criada ainda.");
                    } else {
                        System.out.print("Calcular área de (1 - Círculo, 2 - Quadrado): ");
                        int escolha = scanner.nextInt();
                        if (escolha == 1 && circulo != null) {
                            System.out.printf("Área do círculo (raio %.2f): %.2f\n", circulo.getRaio(), circulo.area());
                        } else if (escolha == 2 && quadrado != null) {
                            System.out.printf("Área do quadrado (lado %.2f): %.2f\n", quadrado.getLado(), quadrado.area());
                        } else {
                            System.out.println("Forma não criada.");
                        }
                    }
                    break;

                case 4:
                    if (circulo == null && quadrado == null) {
                        System.out.println("Nenhuma forma foi criada ainda.");
                    } else {
                        System.out.print("Calcular comprimento de (1 - Círculo, 2 - Quadrado): ");
                        int escolha = scanner.nextInt();
                        if (escolha == 1 && circulo != null) {
                            System.out.printf("Comprimento do círculo (raio %.2f): %.2f\n", circulo.getRaio(), circulo.comprimento());
                        } else if (escolha == 2 && quadrado != null) {
                            System.out.printf("Comprimento do quadrado (lado %.2f): %.2f\n", quadrado.getLado(), quadrado.comprimento());
                        } else {
                            System.out.println("Forma não criada.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}