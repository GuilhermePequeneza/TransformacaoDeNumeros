/**
 * Aplicação do Exercicio Transformação de Numeros
 * 
 * @author Guilherme Pequeneza, Felipe Estima, Thierry Nadjarian, Igor Dias
 * @version 17/06/2026
 */

public class App
{    
    public static void main(String[] args){
        Entrada ent = new Entrada();
        
        int[] arrayInicial = ent.receberArray("Mande uma cadeia de numeros separada por espaços para ser sua Array Inicial");
        
        int[] arrayAlvo = ent.receberArray("Mande uma cadeia de numeros separada por espaços para ser sua Array Alvo");
        
        Operacoes op = new Operacoes(arrayInicial,arrayAlvo);
        if(op.ehPossivel()){
            System.out.print("Array Inicial: ");
            for(int i = 0;i<arrayInicial.length;i++){
                System.out.print(arrayInicial[i] + " ");
            }
            System.out.println("");
            System.out.print("Array Alvo: ");
            for(int i = 0;i<arrayAlvo.length;i++){
                System.out.print(arrayAlvo[i] + " ");
            }
            System.out.println("");
            
            int[] diff = op.acharOperacoes();
            System.out.print("Opercoes feitas pra chegar no alvo: ");
            for(int i=0; i<diff.length; i++){
                if(diff[i] > 0) System.out.print("+" + diff[i]+" "); // Se é positivo deixa +{numero}
                else System.out.print(diff[i]+" "); // Se é negativo ou 0 só printa o numero que ja estara no formato certo
            }
            System.out.println("");
            int[] arrayChegada = op.simular();
            System.out.print("Array Chegada Após Operações na Inicial: ");
            for(int i = 0;i<arrayChegada.length;i++){
                System.out.print(arrayChegada[i] + " ");
            }
            System.out.println("");
        }
        else System.out.println("\nNao tem como chegar no seu alvo pois o numero de argumentos dos arrays nao batem");
        
    }
}