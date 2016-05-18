package amy.com.funwithactivitylauch.test003_affinity;

import android.os.Bundle;

import amy.com.funwithactivitylauch.util.Constant;

/**
 * Created by ms2 on 2016/05/18.
 */
public class Test003_Ten_Option_New_Activity extends Test003_Ten_Option_Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent().putExtra(Constant.NEW_TASK_FLAG, true);
        super.onCreate(savedInstanceState);

    }
}
