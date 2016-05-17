package amy.com.funwithactivitylauch;

import android.content.Intent;

import amy.com.funwithactivitylauch.test001.Test001_SingleInstance_Activity;
import amy.com.funwithactivitylauch.test001.Test001_SingleTask_Activity;
import amy.com.funwithactivitylauch.test001.Test001_SingleTop_Activity;
import amy.com.funwithactivitylauch.test001.Test001_Standard_Activity;

public class Five_Option_Base_Activity extends FiveOptionBaseActivity {


    @Override
    public void setOptionTitle() {
        optionTxt01.setText("go to standard");
        optionTxt02.setText("go to singleTop");
        optionTxt03.setText("go to singleTask");
        optionTxt04.setText("go to singleInstance");

    }

    @Override
    public void optionSelected(int optionId) {
        switch (optionId) {
            case OPITON_01: {
                startActivity(new Intent(this, Test001_Standard_Activity.class));
            }
            break;
            case OPITON_02: {
                startActivity(new Intent(this, Test001_SingleTop_Activity.class));
            }
            break;
            case OPITON_03: {
                startActivity(new Intent(this, Test001_SingleTask_Activity.class));

            }
            break;
            case OPITON_04: {
                startActivity(new Intent(this, Test001_SingleInstance_Activity.class));
            }
            break;
        }


    }

}
