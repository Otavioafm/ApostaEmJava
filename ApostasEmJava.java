import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] agr) {

        Scanner leitor =new Scanner(System.in);
        System.out.println("Digite seu usuário: ");
        String nome;
        nome= leitor.next();
        System.out.println("Seja bem vindo "+ nome+" a Casa de apostas em Java\n");

        // Código a ser executado após ele digitar o saldo correto (acima de $200).
        Scanner saldo = new Scanner(System.in);
        int valorSaldo;
        do {
            System.out.println("Digite o seu saldo inicial [Valor mínimo $200] [Maximo $500]: ");
            valorSaldo = saldo.nextInt();

        }while (!(valorSaldo >= 200 && valorSaldo <= 500));

        // Código a ser executado após o usuário digitar "start".
        Scanner start = new Scanner(System.in);
        String entrada;
        do {
            System.out.println("Digite 'start' para começar");
            entrada = start.next();
        } while (!entrada.equals("start"));

        // Número aleatrio.
        System.out.println("Agora você não podera voltar atras\nVOCÊ TERÁ QUE GANHAR $1000 EM APOSTA OU PERDER TUDO\n" +
                "BOA SORTE");

         // jogo.
         Scanner palpite =new Scanner(System.in);
         int palpiteUsuario;
         do {
              Random numero =new Random();
              int numeroAleatorio= (int) (Math.random()*10);

              System.out.println("Faça a sua aposta (1 a 10): ");
              palpiteUsuario=palpite.nextInt();
              if (palpiteUsuario==numeroAleatorio){

                  valorSaldo+=25;
                  System.out.println("Você acertou! :D ["+valorSaldo+"]");
              }
              else{
                  valorSaldo-=50;
                  System.out.println("Você errou! :( ["+valorSaldo+"]");
              }


         }while (valorSaldo > 0 && valorSaldo < 1000);











    }
}