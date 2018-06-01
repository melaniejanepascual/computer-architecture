package com.example.melaniejanepascual.hellotoast;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  int mCount = 0;
    private TextView mShowCount; //the actual count being shown as a text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // takes ID as a parameter and returns it
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        // string to string resource is setting variables in string.xml
        Toast toast = Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;

        if(mCount !=  0)
            mShowCount.setText(Integer.toString(mCount));
    }
}
