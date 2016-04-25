package amy.com.funwithactivitylauch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DeepLinkingActivity extends AppCompatActivity {
    private final static String HOST_DEEP_LINKING = "deeplinking";
    private final static String HOST_SCREEN = "screen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            final Uri uri = getIntent().getData();
            final String originalUri = uri.toString();

            final String targetUri = originalUri.replace(HOST_DEEP_LINKING, HOST_SCREEN);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(targetUri)));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            finish();

        }
    }
}
