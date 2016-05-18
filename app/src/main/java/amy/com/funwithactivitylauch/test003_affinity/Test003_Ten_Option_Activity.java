package amy.com.funwithactivitylauch.test003_affinity;

import android.content.Intent;
import android.util.Log;

import amy.com.funwithactivitylauch.TenOptionBaseActivity;
import amy.com.funwithactivitylauch.util.Constant;

public class Test003_Ten_Option_Activity extends TenOptionBaseActivity {


    @Override
    public void setOptionTitle() {
        optionTxt01.setText("GROUP 001 standard");
        optionTxt02.setText("GROUP 001 singleTop");
        optionTxt03.setText("GROUP 001 singleTask");
        optionTxt04.setText("GROUP 001 singleInstance");
        optionTxt05.setText("GROUP 002 standard");
        optionTxt06.setText("GROUP 002 singleTop");
        optionTxt07.setText("GROUP 002 singleTask");
        optionTxt08.setText("GROUP 002 singleInstance");
    }

    @Override
    public void optionSelected(int optionId) {
        Intent intent = null;

        switch (optionId) {
            case Constant.OPITON_01: {
                intent = new Intent(this, Test003_Standard_Group001_Activity.class);
            }
            break;
            case Constant.OPITON_02: {
                intent = new Intent(this, Test003_SingleTop_Group001_Activity.class);
            }
            break;
            case Constant.OPITON_03: {
                intent = new Intent(this, Test003_SingleTask_Group001_Activity.class);

            }
            break;
            case Constant.OPITON_04: {
                intent = new Intent(this, Test003_SingleInstance_Group001_Activity.class);
            }
            break;
            case Constant.OPITON_05: {
                intent = new Intent(this, Test003_Standard_Group002_Activity.class);
            }
            break;
            case Constant.OPITON_06: {
                intent = new Intent(this, Test003_SingleTop_Group002_Activity.class);
            }
            break;
            case Constant.OPITON_07: {
                intent = new Intent(this, Test003_SingleTask_Group002_Activity.class);

            }
            break;
            case Constant.OPITON_08: {
                intent = new Intent(this, Test003_Standard_Group001_Activity.class);
            }
            break;
        }

        if (intent != null) {
            if (newTask) {
                Log.d("ALauntch", "new task");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(Constant.NEW_TASK_FLAG, true);
            } else {
                intent.putExtra(Constant.NEW_TASK_FLAG, false);

            }

            startActivity(intent);
        }

    }

}
