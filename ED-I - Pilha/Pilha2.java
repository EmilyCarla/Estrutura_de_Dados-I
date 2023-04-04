import java.util.Stack;

public class Pilha2 {
    public static void main(String[] args) {
        String frase = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        String[] palavras = frase.split(" "); 
        Stack<Character> pilha = new Stack<Character>();
        String fraseInvertida = "";
        
        for(String palavra : palavras){ 
            char[] letras = palavra.toCharArray(); 
            for(char letra : letras){
                pilha.push(letra); 
            }

            while(!pilha.empty()){ 
                fraseInvertida += pilha.pop(); 
            }
            fraseInvertida += " ";
        }

        System.out.println(fraseInvertida);
    }
}
