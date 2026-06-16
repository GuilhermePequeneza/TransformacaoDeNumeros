import java.util.Scanner;
/**
 * Escreva uma descrição da classe Entrada aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Entrada
{
    /**
     * 
     * 
     * 
     */
    int[] receberArray(String msg){
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumeros = null;
        boolean certin = false;

        while(!certin){
            try{
                System.out.println(msg);
                String arrayString = scanner.nextLine();
                
                String separado[] = arrayString.split("[\\s]+");
                arrayNumeros = new int[separado.length];
                
                for(int i = 0;i<separado.length;i++){
                    arrayNumeros[i] = Integer.parseInt(separado[i]);
                }
                certin = true;
                }
            catch(NumberFormatException e){
                System.out.println("Entrada invalida tente novamente");
            }
        }
        
        scanner.close();
        return arrayNumeros;
    }
    
}