package amy.com.funwithactivitylauch.otherfun;

import android.net.Uri;
import android.util.Log;

public class Test_Uri {
    private final static String HOST_SCHOOL = "school";
    private final static String SCHEME_GOAL = "goals";


    public static void makeUri() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(SCHEME_GOAL);
        String myUrl = builder.build().toString();
        Log.d("URIRUI", myUrl);

        builder.clearQuery();
        builder.scheme(SCHEME_GOAL)
                .authority(HOST_SCHOOL);
        myUrl = builder.build().toString();
        Log.d("URIRUI", myUrl);


    }

}
