package tw.com.pcschool.db101701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d("TEST", String.valueOf(MainActivity.var));

        MyApplication app = (MyApplication) getApplication();
        Log.d("TEST2", String.valueOf(app.count));
    }
}
