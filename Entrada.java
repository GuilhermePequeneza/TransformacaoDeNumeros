import java.util.Scanner;

/**
 * Faz a Entrada do Usuario e a Converte em uma Array
 *
 * @author Guilherme Pequeneza, Felipe Estima, Thierry Nadjarian, Igor Dias
 * @version 17/06/2026
 */
public class Entrada
{
    /**
     * Recebe uma String do usuario e tenta converter para uma array de inteiros
     * Se não é possivel faz o Usuario tentar novamente
     *
     * @param msg Texto que sera mostrado no prompt pro usuario
     * @return Uma array de inteiros convertida da entrada do Usuario
     */
    int[] receberArray(String msg){
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumeros = null;
        boolean certin = false;

        while(!certin){
            try{
                System.out.println(msg);
                String arrayString = scanner.nextLine();
                
                String separado[] = arrayString.split("[\\s]+"); // Separa cada conjunto de caracter separados por espaço em uma Array de Strings
                arrayNumeros = new int[separado.length];
                
                for(int i = 0;i<separado.length;i++){
                    arrayNumeros[i] = Integer.parseInt(separado[i]); // Tenta converter cada conjunto de caracter em Inteiro e botar na arrayNumeros
                }
                certin = true; // Se nao der erro na conversao pra Int bota que ta tudo certo
            } catch(NumberFormatException e){
                System.out.println("Entrada invalida tente novamente");
            }
        }

        return arrayNumeros;
    }
    
}