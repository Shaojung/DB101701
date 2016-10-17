package tw.com.pcschool.db101701;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d("TEST", String.valueOf(MainActivity.var));

        MyApplication app = (MyApplication) getApplication();
        Log.d("TEST2", String.valueOf(app.count));
    }
    public void click2(View v)
    {
        Intent it = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(it);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyApplication app = (MyApplication) getApplication();
        if (app.back)
        {
            overridePendingTransition(0, 0);
            finish();
        }
    }
}
