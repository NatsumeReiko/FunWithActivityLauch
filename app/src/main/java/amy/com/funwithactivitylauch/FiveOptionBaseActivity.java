package amy.com.funwithactivitylauch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import amy.com.funwithactivitylauch.util.Constant;

public abstract class FiveOptionBaseActivity extends AppCompatActivity
        implements View.OnClickListener {

    final protected int OPITON_01 = 1;
    final protected int OPITON_02 = 2;
    final protected int OPITON_03 = 3;
    final protected int OPITON_04 = 4;
    final protected int OPITON_05 = 5;

    protected TextView optionTxt01;
    protected TextView optionTxt02;
    protected TextView optionTxt03;
    protected TextView optionTxt04;
    protected TextView optionTxt05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panel_five_option);

        Constant.DO_NEW_TASK = false;

//        newTaskFlag = getIntent().getBooleanExtra(Constant.NEW_TASK_FLAG, false);

        optionTxt01 = (TextView) findViewById(R.id.option01);
        optionTxt02 = (TextView) findViewById(R.id.option02);
        optionTxt03 = (TextView) findViewById(R.id.option03);
        optionTxt04 = (TextView) findViewById(R.id.option04);
        optionTxt05 = (TextView) findViewById(R.id.option05);

        optionTxt01.setText("optionTxt01");
        optionTxt02.setText("optionTxt02");
        optionTxt03.setText("optionTxt03");
        optionTxt04.setText("optionTxt04");
        optionTxt05.setText("optionTxt05");

        optionTxt01.setOnClickListener(this);
        optionTxt02.setOnClickListener(this);
        optionTxt03.setOnClickListener(this);
        optionTxt04.setOnClickListener(this);
        optionTxt05.setOnClickListener(this);

        setOptionTitle();

    }

    public abstract void setOptionTitle();

    public abstract void optionSelected(int optionId);


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.option01: {
                optionSelected(OPITON_01);
            }
            break;
            case R.id.option02: {
                optionSelected(OPITON_02);
            }
            break;
            case R.id.option03: {
                optionSelected(OPITON_03);
            }
            break;
            case R.id.option04: {
                optionSelected(OPITON_04);
            }
            break;
            case R.id.option05: {
                optionSelected(OPITON_05);
            }
            break;
        }
    }

}
