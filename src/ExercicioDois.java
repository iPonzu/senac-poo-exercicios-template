import java.util.Scanner;

public class ExercicioDois {


    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 2 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Mês do Ano                                        |");
        System.out.println("| 3 - Forca                                             |");
        System.out.println("| 4 - Tabuada                                           |");
        System.out.println("| 5 - Letra a Letra                                     |");
        System.out.println("| 6 - Número ímpares multiplos de 7                     |");
        System.out.println("| 7 - Calcule a Média de Notas informadas               |");
        System.out.println("| 8 - Fatorial                                          |");
        System.out.println("| 9 - Calculo IMC                                       |");
        System.out.println("| 10 - Operadores                                       |");
        System.out.println("| 11 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba três notas calcule a média e diga se foi aprovado (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).
            case 1:
            System.out.println("O valor total da média é  " + calculaMedia(8, 7, 8)/3);
                // calculaMedia(double notaUm, double notaDois, double notaTres);
                break;
            // 2) Crie um programa que receba um número e indique o mês que representa.
            case 2:
            String mes = "";

            try{
            System.out.println("Informe um número de 1 à 12: ");
            int qualMes = scanner.nextInt();
            int numeroMes = scanner.nextInt();
            mes = qualMes(numeroMes);
            System.out.println("O mês escolhido: " + mes);                

            }catch(Exception e){

                System.out.println("klkl");

            }
                break;
            // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
            case 3:
                System.out.println("Digite  palavra oculta");
                String palavra = scanner.next();
                System.out.println("Digite a quantidade de tentativas");
                int tentativas = scanner.nextInt();

                for (int i = tentativas; i > 0; i--){
                    System.out.println("Digite a palavra da tentativa " + i + ": ");
                    String palavraTentativa = scanner.next();
                }

                if (palavra.equals(palavraTentativa)){
                    System.out.println("Acertou!");
                }
                // forca(String palavra, int tentativa, Scanner scanner);
                break;
            // 4) Crie um programa que imprima a tabuada de 0 a 10.
            case 4:
                // tabuada(int numero);
                break;
            // 5) Crie um programa que receba uma String e imprima linha a linha suas letras.
            case 5:
            System.out.println("Digite a palavra: ");
            String palavraLetraALetra = scanner.next();
            char[] letras = letraALetra(palavraLetraALetra);

            for (char letra : letras){
                System.out.println(letra);
            }
               // letraALetra(String palavra);
                break;
            // 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500.
            case 6:
                // numerosImpares();
                break;
            // 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
            case 7:
                // calculaMedia(double[] notas);
                break;
            // 8) Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.
            case 8:
                // fatorial(int numero);
                break;
            // 9) Crie um programa que receba a altera e o peso e calcule o IMC:
            // 
            // IMC | Classificação
            // --- | ------
            // Abaixo de 18,5 | Abaixo do Peso
            // Entre 18,6 e 24,9 | Peso Ideal
            // Entre 25,0 e 29,9 | Levemente acima do peso
            // Entre 30,0 e 34,9 | Obesidade Grau I
            // Entre 35,0 e 39,9 | Obesidade Grau II
            // Acima de 40 | Obesidade Grau III (mórbida)
            case 9:
                // imc(double altura, double peso);
                break;
            // 10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.
            case 10:
                // operador(int valorUm, int valorDois, char operacao);
                break;
            // DESAFIO: Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
            case 11:
                // notasNecessarias(int valor);
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double calculaMedia(double notaUm, double notaDois, double notaTres) {
        double notas = (notaUm + notaDois + notaTres) /3;

        if (notas >= 7){
            System.out.println("Aprovado");
        }
        else if (notas <= 7) {
            System.out.println("Reprovado");
        }
    
        return 0;
    }


    /**
     * @param 
     * @return
     */
    public static String qualMes(int mes) {
     
        switch (mes){

            case 1:
            return "Janeiro";

            case 2:
            return "Fevereiro";

            case 3:
            return "Março";

            case 4:
            return "Abril";

            case 5:
            return "Maio";

            case 6:
            return "Junho";

            case 7:
            return "Julho";

            case 8:
            return "Agosto";

            case 9:
            return "Setembro";

            case 10:
            return "Outubro";

            case 11:
            return "Novembro";

            case 12:
            return "Dezembro";

        }
        return "";
    }

    public static int[] tabuada(int numero) {
        return new int[10];
    }

    public static char[] letraALetra(String palavra) {
        return new char[1];
    }

    public static int numerosImpares() {
        return 0;
    }

    public static double calculaMedia(double[] notas) {
        return 0;
    }

    public static int fatorial(int numero) {
        return 0;
    }

    public static double imc(double altura, double peso) {
        return 0;
    }

    public static double operador(int valorUm, int valorDois, char operacao) {
        return 0;
    }

    public static int[] notasNecessarias(int valor) {
        return new int[6];
    }
}
