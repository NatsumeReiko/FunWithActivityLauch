package amy.com.funwithactivitylauch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SingleInstanceActivity001 extends AppCompatActivity {
    public static final String MESSAGE = "message";

    TextView countTxView;
    TextView msgTxView;
    int count = 1;
    String message = "";

    static final String KEY_MESSAGE = "key_message";
    static final String KEY_PUSH_COUNT = "key_push_count";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance001);
        countTxView = (TextView) findViewById(R.id.count);
        msgTxView = (TextView) findViewById(R.id.message);

        getIntentData(getIntent());

    }

    private void getIntentData(Intent intent, boolean debug) {
        String intentMsg = "";
        if (intent.getData() != null) {
            intentMsg = intent.getData().getQueryParameter(MESSAGE);

            if (!debug) {
                message = intentMsg;
            }
        }

        Log.d("001001 ", intentMsg + " debug :" + debug);
    }

    private void getIntentData(Intent intent) {
        getIntentData(intent, false);
    }

    public void onFinishBtnClicked(View view) {
        this.finish();
    }

//    @Override
//    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
//        super.onSaveInstanceState(outState, outPersistentState);
//
//        outState.putInt(KEY_COUNT, count);
//        outState.putString(KEY_MESSAGE, message);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        count = savedInstanceState.getInt(KEY_COUNT);
//        message = savedInstanceState.getString(KEY_MESSAGE);
//    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        getIntentData(intent);

        count++;

        setIntent(intent);

        getIntentData(getIntent(), true);

    }

    @Override
    protected void onResume() {
        super.onResume();
        setContent();
    }

    public void setContent() {
        msgTxView.setText(message);
        countTxView.setText(String.valueOf(count));

    }
}
