package amy.com.funwithactivitylauch.otherfun;

import android.util.Log;

public class Algorithm_Sort_Java {

    public static void quicksort_sort_001() {
        /*https://www.youtube.com/watch?v=3OLTJlwyIqQ*/
//        int[] dataBefore = {3, 2, 1, 1};
        int[] dataBefore = {3, 7, 8, 34, 66, 54, 757, 3, 2, 1, 646};
        int[] pivotBefore = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        printIntArray(dataBefore, "Before");

        int compareTimes = 0, pivotIndex;

        final int length = dataBefore.length;

        do {
            pivotIndex = -1;
            for (int index = 0; index < length; index++) {
                if (pivotBefore[index] == 1) {
                    pivotIndex = index;
                    break;
                }
            }

            if (pivotIndex == -1) {
                break;
            }

            int startIndex = length - 1;
            int status = STATUS_COMPARE_TO_RIGHT;
            while (status != STATUS_CROSS_WITH_PIVOT) {
                QuickSortReturn rtn;
                if (status == STATUS_COMPARE_TO_RIGHT) {
                    rtn = CompareToRight(dataBefore, pivotIndex, startIndex);
                } else {
                    rtn = CompareToLeft(dataBefore, pivotIndex, startIndex);
                }

                startIndex = rtn.endIndex;
                pivotIndex = rtn.pivot;
                status = rtn.status;

            }

            pivotBefore[pivotIndex] = 0;

        } while (pivotIndex != -1);

        Log.d("Sort_Sort", "compareTimes:" + compareTimes);
        printIntArray(dataBefore, "After");
    }

    public static final int STATUS_COMPARE_TO_LEFT = 1;
    public static final int STATUS_COMPARE_TO_RIGHT = 1 + STATUS_COMPARE_TO_LEFT;
    public static final int STATUS_CROSS_WITH_PIVOT = 1 + STATUS_COMPARE_TO_RIGHT;

    private static QuickSortReturn CompareToLeft(final int[] array, int pivot, final int startIndex) {
        QuickSortReturn rtn = new QuickSortReturn();


        final int pivotValue = array[pivot];
        for (int index = startIndex; index < pivot; index++) {
            if (pivotValue < array[index]) {
                array[pivot] = array[index];
                array[index] = pivotValue;

                rtn.pivot = index;
                rtn.status = STATUS_COMPARE_TO_RIGHT;
                rtn.endIndex = --pivot;

                return rtn;
            }
        }

        rtn.pivot = pivot;
        rtn.status = STATUS_CROSS_WITH_PIVOT;

        return rtn;
    }

    private static QuickSortReturn CompareToRight(final int[] array, int pivot, final int startIndex) {
        QuickSortReturn rtn = new QuickSortReturn();


        final int pivotValue = array[pivot];
        for (int index = startIndex; index > pivot; index--) {
            if (pivotValue > array[index]) {
                array[pivot] = array[index];
                array[index] = pivotValue;

                rtn.pivot = index;
                rtn.status = STATUS_COMPARE_TO_LEFT;
                rtn.endIndex = ++pivot;


                return rtn;
            }
        }

        rtn.pivot = pivot;
        rtn.status = STATUS_CROSS_WITH_PIVOT;

        return rtn;
    }

    static class QuickSortReturn {

        public int pivot;
        public int status;
        public int endIndex = -1;
    }

    /*get smaller one*/
    public static void insertion_sort_002() {
//        int[] dataBefore = {3, 2, 1, 1};
        int[] dataBefore = {3, 7, 8, 34, 66, 54, 757, 3, 2, 1, 646};
        printIntArray(dataBefore, "Before");

        int compareTimes = 0, temp;

        final int length = dataBefore.length;
        for (int index = 0; index < length - 1; index++) {

            for (int indexD = index + 1; indexD > 0; indexD--) {

                compareTimes++;
                if (dataBefore[indexD] < dataBefore[indexD - 1]) {
                    temp = dataBefore[indexD - 1];
                    dataBefore[indexD - 1] = dataBefore[indexD];
                    dataBefore[indexD] = temp;
                }

            }

        }

        Log.d("Sort_Sort", "compareTimes:" + compareTimes);
        printIntArray(dataBefore, "After");
    }

    /*get larger one*/
    public static void insertion_sort_001() {
//        int[] dataBefore = {3, 2, 1, 1};
        int[] dataBefore = {3, 7, 8, 34, 66, 54, 757, 3, 2, 1, 646};
        printIntArray(dataBefore, "Before");

        int compareTimes = 0, temp;

        final int length = dataBefore.length;
        for (int index = 1; index < length; index++) {

            for (int indexD = index - 1; indexD >= 0; indexD--) {

                compareTimes++;
                if (dataBefore[indexD] > dataBefore[indexD + 1]) {
                    temp = dataBefore[indexD + 1];
                    dataBefore[indexD + 1] = dataBefore[indexD];
                    dataBefore[indexD] = temp;
                }

            }

        }

        Log.d("Sort_Sort", "compareTimes:" + compareTimes);
        printIntArray(dataBefore, "After");
    }


    /*get biggest one at first*/
    public static void selection_sort_001() {
        int[] dataBefore = {3, 7, 8, 34, 66, 54, 757, 3, 2, 1, 646};
        printIntArray(dataBefore, "Before");


        int compareTimes = 0, bigIndex, temp;

        final int length = dataBefore.length;
        for (int index = 0; index < length - 1; index++) {
            bigIndex = 0;
            for (int indexD = 1; indexD < length - index; indexD++) {
                compareTimes++;
                if (dataBefore[bigIndex] > dataBefore[indexD]) {
                    temp = dataBefore[bigIndex];
                    dataBefore[bigIndex] = dataBefore[indexD];
                    dataBefore[indexD] = temp;
                }
                bigIndex = indexD;

            }

        }
        Log.d("Sort_Sort", "compareTimes:" + compareTimes);

        printIntArray(dataBefore, "After");


    }

    /*get smallest one at first*/
    public static void selection_sort_002() {
        int[] dataBefore = {3, 7, 8, 34, 66, 54, 757, 3, 2, 1, 646};
        printIntArray(dataBefore, "Before");


        int compareTimes = 0, smallIndex, temp;

        final int length = dataBefore.length;
        for (int index = 0; index < length - 1; index++) {
            smallIndex = length - 1;
            for (int indexD = length - 2; indexD >= index; indexD--) {
                compareTimes++;
                if (dataBefore[smallIndex] < dataBefore[indexD]) {
                    temp = dataBefore[smallIndex];
                    dataBefore[smallIndex] = dataBefore[indexD];
                    dataBefore[indexD] = temp;
                }
                smallIndex = indexD;

            }

        }
        Log.d("Sort_Sort", "compareTimes:" + compareTimes);

        printIntArray(dataBefore, "After");


    }


    public static void bulb_sort_001() {
        int[] dataBefore = {3, 7, 8, 34, 66, 54, 757, 3, 2, 1, 646};
        printIntArray(dataBefore, "Before");


        int temp, compareTimes = 0;
        final int maxIndex = dataBefore.length - 1;


        for (int times = 0; times < maxIndex; times++) {
            for (int index = 0; index < maxIndex - times; index++) {

                compareTimes++;
                if (dataBefore[index] > dataBefore[index + 1]) {
                    temp = dataBefore[index];
                    dataBefore[index] = dataBefore[index + 1];
                    dataBefore[index + 1] = temp;

                }

            }
        }


        Log.d("Sort_Sort", "compareTimes:" + compareTimes);

        printIntArray(dataBefore, "After");
    }


    private static String printIntArray(int[] date, String tag) {
        String rtn = "";

        if (date == null || date.length == 0) {
            return rtn;
        }

        StringBuilder after = new StringBuilder();
        for (int index = 0; index < date.length; index++) {
            after.append(date[index]);
            after.append(",");
        }

        Log.d("Sort_Sort", tag + ":" + after.toString());

        rtn = after.toString();


        return rtn;

    }


}
