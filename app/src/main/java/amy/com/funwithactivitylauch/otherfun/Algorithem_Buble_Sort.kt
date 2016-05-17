package amy.com.funwithactivitylauch.otherfun

import android.util.Log

/**
 * Created by ms2 on 2016/05/17.
 */
object Algorithem_Buble_Sort {

    fun sort001() {
        val dataBefore = intArrayOf(3, 7, 8, 34, 66, 54, 757, 3, 2, 1, 646)
        printIntArray(dataBefore, "Before")


        var temp: Int
        var compareTimes = 0
        val maxIndex = dataBefore.size - 1


        for (times in 0..maxIndex - 1) {
            for (index in 0..maxIndex - times - 1) {

                compareTimes++
                if (dataBefore[index] > dataBefore[index + 1]) {
                    temp = dataBefore[index]
                    dataBefore[index] = dataBefore[index + 1]
                    dataBefore[index + 1] = temp

                }

            }
        }


        Log.d("Buble_Sort", "compareTimes:" + compareTimes)

        printIntArray(dataBefore, "After")
    }


    private fun printIntArray(date: IntArray?, tag: String): String {
        var rtn = ""

        if (date == null || date.size == 0) {
            return rtn
        }

        val after = StringBuilder()
        for (index in date.indices) {
            after.append(date[index])
            after.append(",")
        }

        Log.d("Buble_Sort", tag + ":" + after.toString())

        rtn = after.toString()


        return rtn

    }
}
