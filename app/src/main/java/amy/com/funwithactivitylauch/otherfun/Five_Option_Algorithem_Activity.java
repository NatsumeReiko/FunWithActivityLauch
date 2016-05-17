package amy.com.funwithactivitylauch.otherfun;

import amy.com.funwithactivitylauch.FiveOptionBaseActivity;

public class Five_Option_Algorithem_Activity extends FiveOptionBaseActivity {


    @Override
    public void setOptionTitle() {
        optionTxt01.setText("Buble_Sort_Java_sort001");
//        optionTxt02.setText("go to singleTop");
//        optionTxt03.setText("go to singleTask");
//        optionTxt04.setText("go to singleInstance");

    }

    @Override
    public void optionSelected(int optionId) {
        switch (optionId) {
            case OPITON_01: {
                Algorithem_Buble_Sort_Java.sort001();
            }
            break;
            case OPITON_02: {
            }
            break;
            case OPITON_03: {

            }
            break;
            case OPITON_04: {
            }
            break;
        }


    }

}
