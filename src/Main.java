import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 1, 1, 1, 4, 6, 3, 4, 8, 20, 10, 10, 10, 20, 20, 20, 4, -3, -3};
        int[][] matrix = repeatingNum(list);//matrisin ilk satırına listemizi sıralayaaarak yazdık ikinci satıra tekrar sayılarını yazdık
        int i = 0;
        while (i < matrix[0].length) {
            System.out.println("Eleman: " + matrix[0][i] + " Tekrar sayısı: " + matrix[1][i]);
            i += matrix[1][i];
        }
    }
    static int[][] repeatingNum(int[] list) {
        int[][] matrix = new int[2][list.length];
        matrix[0] = list;
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            int counter = 0;
            for (int element : list) {
                if (list[i] == element) {
                    counter++;
                }
            }
            matrix[1][i] = counter;
        }
        return matrix;
    }


}
