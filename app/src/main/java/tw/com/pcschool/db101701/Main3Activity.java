package tw.com.pcschool.db101701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void click3(View v)
    {
        MyApplication app = (MyApplication) getApplication();
        app.back = true;
        overridePendingTransition(0, 0);
        finish();
    }
}
