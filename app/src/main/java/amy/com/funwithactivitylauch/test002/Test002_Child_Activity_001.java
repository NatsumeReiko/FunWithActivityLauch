package amy.com.funwithactivitylauch.test002;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.view.MenuItem;

import amy.com.funwithactivitylauch.FiveOptionBaseActivity;

public class Test002_Child_Activity_001 extends FiveOptionBaseActivity {


    @Override
    public void setOptionTitle() {
        optionTxt01.setText("Test002_Child_Activity_001");
    }

    @Override
    public void optionSelected(int optionId) {
    }

    @Override
    public void onBackPressed() {

        if(isTaskRoot()) {
            Intent upIntent = NavUtils.getParentActivityIntent(this);
            TaskStackBuilder.create(this)
                    .addNextIntentWithParentStack(upIntent)
                    .startActivities();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
                    // 新しくタスクを生成する必要がある
                    TaskStackBuilder.create(this)
                            .addNextIntentWithParentStack(upIntent)
                            .startActivities();
                    finish();
                } else {
                    NavUtils.navigateUpTo(this, upIntent);
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
