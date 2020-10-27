public class IntArrayTools {

    public boolean isSorted(int[] arr, int direction) {
        switch (direction) {
            case 1:
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i - 1] < arr[i]) {
                        return true;
                    }
                }
                break;
            case 2:
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i - 1] > arr[i]) {
                        return true;
                    }
                }
        }
        return false;
    }

    public int[] sort(int[] num, int dirInd) {
        int[] nw = {0};
        int count = num.length;
        do {
            for (int i = 1; i < num.length; i++) {
                if (dirInd == 1) {
                    if (num[i - 1] >= num[i]) {
                        nw[0] = num[i - 1];
                        num[i - 1] = num[i];
                        num[i] = nw[0];
                    }
                } else if (dirInd == 2) {
                    if (num[i - 1] <= num[i]) {
                        nw[0] = num[i - 1];
                        num[i - 1] = num[i];
                        num[i] = nw[0];
                    }
                }
            }
            count--;
        } while (count > 0);
        return num;
    }

    public boolean chopSearch(int[] arr, int val) {
        int[] sortNum = sort(arr, val);
        int k = sortNum.length / 2;
        for (int i = sortNum[k] < val ? k : 0; i < sortNum.length; i++) {
            if (sortNum[i] == val) {
                return true;
            }
        }
        return false;


    }


}


