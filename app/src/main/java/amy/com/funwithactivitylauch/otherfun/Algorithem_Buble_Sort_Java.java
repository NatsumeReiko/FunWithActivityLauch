package amy.com.funwithactivitylauch.otherfun;

import android.util.Log;

/**
 * Created by ms2 on 2016/05/17.
 */
public class Algorithem_Buble_Sort_Java {


    public static void sort001() {
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


        Log.d("Buble_Sort", "compareTimes:" + compareTimes);

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

        Log.d("Buble_Sort", tag + ":" + after.toString());

        rtn = after.toString();


        return rtn;

    }


}
