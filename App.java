
/**
 * Escreva uma descrição da classe App aqui.
 * 
 * @author (seu nome)
 * @version (um número da versão ou uma data)
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
                System.out.print(diff[i]+" ");
            }
            System.out.println("");
            int[] arrayChegada = op.simular();
            System.out.print("Array Chegada: ");
            for(int i = 0;i<arrayChegada.length;i++){
                System.out.print(arrayChegada[i] + " ");
            }
            System.out.println("");
        }
        else{System.out.println("\nNao tem como chegar no seu alvo pois o numero de argumentos dos arrays nao batem");}
            
        
    }
}