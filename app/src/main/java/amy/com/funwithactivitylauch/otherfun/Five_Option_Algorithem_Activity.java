package amy.com.funwithactivitylauch.otherfun;

import amy.com.funwithactivitylauch.FiveOptionBaseActivity;

public class Five_Option_Algorithem_Activity extends FiveOptionBaseActivity {


    @Override
    public void setOptionTitle() {
        optionTxt01.setText("Bulb_Sort_Java_sort001");
        optionTxt02.setText("quicksort_sort_001");
//        optionTxt03.setText("Selcetion_Sort_Java_sort002");
        optionTxt04.setText("makeUri");

    }

    @Override
    public void optionSelected(int optionId) {
        switch (optionId) {
            case OPITON_01: {
                Algorithm_Sort_Java.bulb_sort_001();
            }
            break;
            case OPITON_02: {
                Algorithm_Sort_Java.quicksort_sort_001();
            }
            break;
            case OPITON_03: {

            }
            break;
            case OPITON_04: {
                Test_Uri.makeUri();
            }
            break;
        }


    }

}
