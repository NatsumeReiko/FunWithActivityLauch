package amy.com.funwithactivitylauch.test002;

import android.content.Intent;

import amy.com.funwithactivitylauch.FiveOptionBaseActivity;

public class Test002_Parent_Activity_001 extends FiveOptionBaseActivity {


    @Override
    public void setOptionTitle() {
        optionTxt01.setText("Test002_Parent_Activity_001");
        optionTxt02.setText("Launch child activity");
    }

    @Override
    public void optionSelected(int optionId) {
        switch (optionId) {
            case OPITON_02: {
                startActivity(new Intent(this, Test002_Child_Activity_001.class));
            }
            break;
        }
    }
}
