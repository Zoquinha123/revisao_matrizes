//Importa a classe scanner para nosso projeto, que está demtro do pacote java.util
import java.util.Scanner;
//declara uma classe publica chamada vetor2 e inicia o corpo da classe por meio de um sinal
public class Vetor2 {
    //Cria a classe main que é o programa principal
    public static void main(String[] args){
        
        //cria um objeto scanner sc para receber dados dos usuarios via teclado.
        Scanner sc = new Scanner (System.in); //sc é um objeto porque vem de uma classe
        
        //declara a variavel n e o vetor do tipo String funcionario
        int n = 5;
        String funcionario[] = new String[n];
            
        //comente cada linha em detalhe. Não pode faltar nada
        
        //estrutura de repeticao for. Serve para nome de funcionário para cada um dos valores do vetor
        //o método .length retorna o tamanho total do vetor
        for (int i = 0; i < funcionario.length; i++) {
            System.out.println("Digite o nome do funcionario: ");
            //adicionar os nomes que foram digitados pelo usuario no vetor
            funcionario[i] = sc.next();
        }

        for (int i = 0; i < funcionario.length; i++) {
            System.out.println(funcionario[i]);
        }

        sc.close(); // fechar o scanner
    }
}