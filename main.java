// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        int A, N, soma, aux;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".


        soma = A;
        aux = A;

        while (aux <= N) {


            aux++;



            if((aux % A) == 0){

                    

                  soma = soma + aux;
          
                

             }

             
        }
        System.out.println(soma);
      
    }



}
