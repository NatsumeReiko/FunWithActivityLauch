package amy.com.funwithactivitylauch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import amy.com.funwithactivitylauch.util.Constant;

public abstract class TenOptionBaseActivity extends AppCompatActivity
        implements View.OnClickListener {

    protected boolean newTask = false;


    protected TextView optionTxt01;
    protected TextView optionTxt02;
    protected TextView optionTxt03;
    protected TextView optionTxt04;
    protected TextView optionTxt05;
    protected TextView optionTxt06;
    protected TextView optionTxt07;
    protected TextView optionTxt08;
    protected TextView optionTxt09;
    protected TextView optionTxt10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panel_ten_option);


        newTask = getIntent().getBooleanExtra(Constant.NEW_TASK_FLAG, false);

        optionTxt01 = (TextView) findViewById(R.id.option01);
        optionTxt02 = (TextView) findViewById(R.id.option02);
        optionTxt03 = (TextView) findViewById(R.id.option03);
        optionTxt04 = (TextView) findViewById(R.id.option04);
        optionTxt05 = (TextView) findViewById(R.id.option05);

        optionTxt06 = (TextView) findViewById(R.id.option06);
        optionTxt07 = (TextView) findViewById(R.id.option07);
        optionTxt08 = (TextView) findViewById(R.id.option08);
        optionTxt09 = (TextView) findViewById(R.id.option09);
        optionTxt10 = (TextView) findViewById(R.id.option10);

        optionTxt01.setText("optionTxt01");
        optionTxt02.setText("optionTxt02");
        optionTxt03.setText("optionTxt03");
        optionTxt04.setText("optionTxt04");
        optionTxt05.setText("optionTxt05");

        optionTxt06.setText("optionTxt06");
        optionTxt07.setText("optionTxt07");
        optionTxt08.setText("optionTxt08");
        optionTxt09.setText("optionTxt09");
        optionTxt10.setText("optionTxt10");


        optionTxt01.setOnClickListener(this);
        optionTxt02.setOnClickListener(this);
        optionTxt03.setOnClickListener(this);
        optionTxt04.setOnClickListener(this);
        optionTxt05.setOnClickListener(this);

        optionTxt06.setOnClickListener(this);
        optionTxt07.setOnClickListener(this);
        optionTxt08.setOnClickListener(this);
        optionTxt09.setOnClickListener(this);
        optionTxt10.setOnClickListener(this);

        setOptionTitle();

    }

    public abstract void setOptionTitle();

    public abstract void optionSelected(int optionId);


    @Override
    public void onClick(View view) {
        int selectedOption = 0;

        switch (view.getId()) {
            case R.id.option01: {
                selectedOption = Constant.OPITON_01;
            }
            break;
            case R.id.option02: {
                selectedOption = Constant.OPITON_02;
            }
            break;
            case R.id.option03: {
                selectedOption = Constant.OPITON_03;
            }
            break;
            case R.id.option04: {
                selectedOption = Constant.OPITON_04;
            }
            break;
            case R.id.option05: {
                selectedOption = Constant.OPITON_05;
            }
            break;
            case R.id.option06: {
                selectedOption = Constant.OPITON_06;
            }
            break;
            case R.id.option07: {
                selectedOption = Constant.OPITON_07;
            }
            break;
            case R.id.option08: {
                selectedOption = Constant.OPITON_08;
            }
            break;
            case R.id.option09: {
                selectedOption = Constant.OPITON_09;
            }
            break;
            case R.id.option10: {
                selectedOption = Constant.OPITON_10;
            }
            break;
        }

        optionSelected(selectedOption);

    }
}
