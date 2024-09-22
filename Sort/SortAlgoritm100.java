package Sort;
import java.util.Arrays;

public class SortAlgoritm100 {

    public static int[] bubbleSort(int[] array){
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSortDescending(int[] array){
        for (int i=0; i < array.length-1; i++){
            for (int j=0; j < array.length - i - 1; j++){
                if (array[j] <  array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] angka = {
            86, 28, 74, 25, 42, 53, 34, 36, 47, 92, 64, 8, 80, 69, 69, 71, 47, 100, 93, 10, 94, 81, 58, 79, 65, 75, 75, 99, 11, 73, 41, 51, 
            42, 2, 43, 89, 41, 23, 34, 52, 16, 44, 57, 42, 99, 18, 66, 61, 67, 26, 17, 25, 70, 24, 77, 82, 12, 19, 91, 52, 41, 68, 75, 50, 36, 
            65, 13, 7, 80, 62, 63, 56, 85, 73, 26, 21, 27, 60, 23, 87, 32, 23, 10, 36, 31, 91, 33, 83, 87, 75, 42, 33, 2, 44, 67, 74, 12, 11, 65, 94
        };

        System.out.println();
        System.out.println("Sebelum sorting");
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        long startTime = System.nanoTime();

        int[] angkaSorted = Arrays.copyOf(angka, angka.length);
        int[] angkaDescending = Arrays.copyOf(angka, angka.length);

        bubbleSort(angkaSorted);
        bubbleSortDescending(angkaDescending);
        
        long endTime = System.nanoTime();

        long duration = endTime - startTime ;

        System.out.println();
        System.out.println("Setelah sorting");
        for(int i = 0; i < angkaSorted.length; i++){
            System.out.print(angkaSorted[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Setelah sorting balik: ");
        for (int i = 0; i < angkaDescending.length ; i++){
            System.out.print(angkaDescending[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Waktu Sorting (nano): " + duration / 1_000_000.0);
        
    }
}
