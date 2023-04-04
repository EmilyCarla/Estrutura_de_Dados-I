import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {

        String frase = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String[] palavras = frase.split(" "); //divide a Sting em palavras e converte em array
        Stack<Character> pilha = new Stack<Character>();
        String fraseInvertida = "";
        
        for(String palavra : palavras){ //for (tipo da variável: array)
            char[] letras = palavra.toCharArray(); //converte a string em uma sequência de caracteres(separa as letras)
            for(char letra : letras){
                pilha.push(letra); //empilha as letras
            }

            while(!pilha.empty()){ //verifica se a pilha não está vazia
                fraseInvertida += pilha.pop(); // desempilha as letras
            }
            fraseInvertida += " ";
        }

        System.out.println(fraseInvertida);
    }
}

