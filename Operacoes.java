
/**
 * Faz a Simulação da mudança de estados das arrays pelas operações definidas
 * pelo exercicio
 *
 * @author Guilherme Pequeneza, Felipe Estima, Thierry Nadjarian, Igor Dias
 * @version 17/06/2026
 */
public class Operacoes
{
    int[] inicial;
    int[] alvo;


    /**
     * Construtor da Classe Operações
     *
     * @param inicial array que começa
     * @param alvo array que a inicial deseja alcançar
     */
    public Operacoes(int[] inicial , int[] alvo){
        this.inicial = inicial;
        this.alvo = alvo;
    }

    /**
     * Verifica se é possivel a Array Inicial chegar na Alvo
     *
     * @return boolean Verdadeiro se é possivel Falso se não é possivel
     */
    boolean ehPossivel(){
        boolean saida = true;
        if(inicial.length != alvo.length){ // Só é possivel se o tamanho das duas arrays forem iguais
            saida = false;
        }
        return saida;
    }

    /**
     * Acha qual é a operação que tem que ser feita em cada elemtno para a Array Inicial Chegar na final
     *
     * @return Uma array de inteiros cada elemento mostrando qual operação tem que ser feita com qual elemento
     */
    int[] acharOperacoes(){
        int[] diferenca = new int[inicial.length];
        if(ehPossivel()){ // Só achar se for possivel
            for(int i = 0;i<inicial.length;i++){
                diferenca[i] = alvo[i] - inicial[i];                
            }
        }
        return diferenca;
    }

    /**
     * Simula as Operações feitas na Array Inicial para chegar na Alvo
     *
     * @return Uma array de inteiros que é a Array Inicial após as Operações que deve ser igual a Array Alvo
     */
    int[] simular(){
        if(ehPossivel()) { // Só simular se for possivel
            for (int i = 0; i < inicial.length; i++) {
                while (inicial[i] - alvo[i] != 0) { // Enquanto o elemento da inicial nao chegar no da Final
                    if (inicial[i] > alvo[i]) {
                        inicial[i]--;
                    } else {
                        inicial[i]++;
                    }
                }
            }
        }
        return inicial;
    }
}