public class ArrayApp {
    public static void main(String[] args) {

        IntArrayTools arr = new IntArrayTools();
        CharArrayTools chr = new CharArrayTools();

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(arr.isSorted(arr1, 1));

        int[] arr2 = {5, 8, 9, 4, 8};
        System.out.println(arr.isSorted(arr2, 2));


        int[] arr3 = {8, 12, 23, 7, 33, 3, 6};
        int[] sortArr3 = arr.sort(arr3, 2);
        for (int number : sortArr3) {
            System.out.print(number + " ");
        }
        System.out.println();

        int[] arr4 = {70, 45, 36, 22, 43, 34, 68};
        System.out.println(arr.chopSearch(arr4, 43));

        char[] arr5 = {'a', 'k', '1', '%', ',', 'o', 'd', '4'};
        System.out.println(chr.filterAlphabet(arr5));

        char[] arr6 = {'h', 's', 'e', 'D', 'b', 'w', 'g', 'F'};
        char[] sortArr = chr.sort(arr6);
        for (char letter : sortArr) {
            System.out.print(letter + " ");
        }

    }
}
