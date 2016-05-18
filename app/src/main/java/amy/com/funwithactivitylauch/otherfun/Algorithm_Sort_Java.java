package amy.com.funwithactivitylauch.otherfun;

import android.util.Log;

public class Algorithm_Sort_Java {

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
