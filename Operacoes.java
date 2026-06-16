
/**
 * Escreva uma descrição da classe Operacoes aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Operacoes
{
    int[] inicial;
    int[] alvo;
    
    public Operacoes(int[] inicial , int[] alvo){
        this.inicial = inicial;
        this.alvo = alvo;
    }
    
    boolean ehPossivel(){
        boolean saida = true;
        if(inicial.length != alvo.length){
            saida = false;
        }
        return saida;
    }
    
    int[] acharOperacoes(){
        int[] diferenca = new int[inicial.length];
        if(ehPossivel()){
            for(int i = 0;i<inicial.length;i++){
                diferenca[i] = alvo[i] - inicial[i];                
            }
        }
        return diferenca;
    }
    
    int[] simular(){
        for(int i = 0;i<inicial.length;i++){
            while(inicial[i] - alvo[i] != 0){
                if(inicial[i] > alvo[i]){
                    inicial[i]--;
                }
                else{
                    inicial[i]++;
                }
            }
        }
        return inicial;
    }
}