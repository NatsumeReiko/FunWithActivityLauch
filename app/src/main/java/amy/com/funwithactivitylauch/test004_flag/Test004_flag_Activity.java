package amy.com.funwithactivitylauch.test004_flag;

import android.os.Bundle;

import amy.com.funwithactivitylauch.Five_Option_Base_Activity;
import amy.com.funwithactivitylauch.util.Constant;

public class Test004_flag_Activity extends Five_Option_Base_Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Constant.DO_NEW_TASK = true;
    }
}
