public class insertionSort {
    public static void main(String[] args) {
        int[] dizi = {22, 27, 16, 2, 18, 6};
        int n = dizi.length;
        for (int i = 1; i < n; i++) {
            int bos = dizi[i];
            while (i > 0 && dizi[i - 1] > bos) {
                dizi[i] = dizi[i - 1];
                i--;
            }
            dizi[i] = bos;
            for (int d : dizi) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
