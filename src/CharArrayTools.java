public class CharArrayTools {
    public char[] filterAlphabet(char[] arr) {
        char[] charArr = new char[arr.length];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if ('a' > arr[i] || arr[i] > 'z') {
                charArr[c] = arr[i];
                c++;
            }
        }
        return charArr;
    }

    public char[] sort(char[] arr) {
        char[] newarr = {0};
        int count = arr.length;
        do {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] >= arr[i]) {
                    newarr[0] = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = newarr[0];
                }
            }
            count--;
        } while (count > 0);
        return arr;
    }
}