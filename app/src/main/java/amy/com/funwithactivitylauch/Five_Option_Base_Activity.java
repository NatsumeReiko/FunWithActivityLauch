package amy.com.funwithactivitylauch;

import android.content.Intent;

import amy.com.funwithactivitylauch.test001.Test001_SingleInstance_Activity;
import amy.com.funwithactivitylauch.test001.Test001_SingleTask_Activity;
import amy.com.funwithactivitylauch.test001.Test001_SingleTop_Activity;
import amy.com.funwithactivitylauch.test001.Test001_Standard_Activity;
import amy.com.funwithactivitylauch.util.Constant;

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
        Intent intent = null;
        switch (optionId) {
            case OPITON_01: {
                intent = new Intent(this, Test001_Standard_Activity.class);
            }
            break;
            case OPITON_02: {
                intent = new Intent(this, Test001_SingleTop_Activity.class);
            }
            break;
            case OPITON_03: {
                intent = new Intent(this, Test001_SingleTask_Activity.class);

            }
            break;
            case OPITON_04: {
                intent = new Intent(this, Test001_SingleInstance_Activity.class);
            }
            break;
        }

        if (intent != null) {
            if (Constant.DO_NEW_TASK) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            }

            startActivity(intent);
        }


    }

}
