import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        List<Integer> arrayInsertion = gerarLista(10000);
        
        int[] arraySelection = new int[arrayInsertion.size()]; 
        for (int i = 0; i < arrayInsertion.size(); i++) {
            arraySelection[i] = arrayInsertion.get(i);
        }
        int[] arrayBubble = new int[arrayInsertion.size()]; 
        for (int i = 0; i < arrayInsertion.size(); i++) {
            arrayBubble[i] = arrayInsertion.get(i); 
        }

        int comparacoesInsertionSort = 0;
        int trocasInsertionSort = 0;

        // Código do Inicio do cronômetro
        long tempoInicialInsertionSort = System.currentTimeMillis();

        // Código Insertion Sort
        for (int i = 1; i < arrayInsertion.size(); i++) {
            int temporario = arrayInsertion.get(i);
            int j = i - 1;

            while (j >= 0 && arrayInsertion.get(j) > temporario) {
                comparacoesInsertionSort++;
                trocasInsertionSort++;
                arrayInsertion.set(j + 1, arrayInsertion.get(j));
                j--;
            }
            arrayInsertion.set(j + 1, temporario);
        }
        // Código do Fim do cronômetro
        long tempoFinalInsertionSort = System.currentTimeMillis();

        System.out.println("\nInsertion Sort: ");  
        System.out.println("Trocas de posicoes:      " + trocasInsertionSort);
        System.out.println("Quantidade de Comparacoes realizadas: " + comparacoesInsertionSort);
        System.out.println("Tempo de execucao:      " + (tempoFinalInsertionSort - tempoInicialInsertionSort) + " milissegundos\n");

        // Código Selection Sort 

        int comparacoesSelectionSort = 0;
        int trocasSelectionSort = 0;
        
        // Código do Início do cronômetro
        long tempoInicialSelectionSort = System.currentTimeMillis();

        for (int i = 0; i < arraySelection.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < arraySelection.length; j++) {
            	comparacoesSelectionSort++;
                if (arraySelection[menor] > arraySelection[j]) {
                    menor = j;
                }
            }
            
            if (menor != i){
            	int temporario = arraySelection[i];
	            arraySelection[i] = arraySelection[menor];
	            arraySelection[menor] = temporario;
	            trocasSelectionSort++;
            }
        }
        
        // Final do cronômetro
        long tempoFinalSelectionSort = System.currentTimeMillis();
        
        System.out.println("\nSelection Sort: ");        
        System.out.println("Trocas de posicoes:       " + trocasSelectionSort);
        System.out.println("Quantidade de Comparacoes realizadas: " + comparacoesSelectionSort);
        System.out.println("Tempo de execucao:      " + (tempoFinalSelectionSort - tempoInicialSelectionSort) + " milissegundos\n");

        // Código do Boubble Sort

        int comparacoesBubbleSort = 0;
        int trocasBubbleSort = 0;
        
        // Código do Final do cronômetro
        long tempoInicialBubbleSort = System.currentTimeMillis();

        for (int i = 0; i < arrayBubble.length - 1; i++) {
            for (int j = 0; j < arrayBubble.length - i - 1; j++) {
            	comparacoesBubbleSort++;
                if (arrayBubble[j] > arrayBubble[j + 1]) {
                	trocasBubbleSort++;
                    int temporario = arrayBubble[j];
                    arrayBubble[j] = arrayBubble[j + 1];
                    arrayBubble[j + 1] = temporario;
                }
            }
        }
        
        // Código do Final do cronômetro
        long tempoFinalBubbleSort = System.currentTimeMillis();

        System.out.println("\nBubble Sort: ");        
        System.out.println("Trocas de posicoes:      " + trocasBubbleSort);
        System.out.println("Quantidade de Comparacoes realizadas: " + comparacoesBubbleSort);
        System.out.println("Tempo de execucao:      " + (tempoFinalBubbleSort - tempoInicialBubbleSort) + " milissegundos\n");

    }

    public static List<Integer> gerarLista(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(10001));
        }
        return list;
    }


   
}
