package amy.com.funwithactivitylauch;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SingleInstanceActivity001 extends AppCompatActivity {
    // Extra の キー
    public static final String MESSAGE = "message";

    TextView countTxView;
    TextView msgTxView;
    int count = 0;
    String message = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance001);
        countTxView = (TextView) findViewById(R.id.count);
        msgTxView = (TextView) findViewById(R.id.message);

        getIntentData(getIntent());
        setContent();
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

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        getIntentData(intent);
        setContent();
        setIntent(intent);

        getIntentData(getIntent(),true);

    }

    public void setContent() {
        count++;

        msgTxView.setText(message);
        countTxView.setText(String.valueOf(count));

    }
}
