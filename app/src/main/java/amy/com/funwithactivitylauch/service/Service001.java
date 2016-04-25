package amy.com.funwithactivitylauch.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class Service001 extends Service {
    public Service001() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.

        Log.d("serviceTEST","onBind");
        Toast.makeText(getApplicationContext(), "Intent launched", Toast.LENGTH_SHORT).show();

        return null;
    }
}
