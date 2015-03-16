package tw.idv.rex.example.bmi.bmicalculator;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //計算BMI
    public void calculate(View v) {
        EditText ed_height = (EditText)findViewById(R.id.editTextHeight);
        EditText ed_weight = (EditText)findViewById(R.id.editTextWeight);
        float height = Float.parseFloat(ed_height.getText().toString());
        float weight = Float.parseFloat(ed_weight.getText().toString());
        float bmi = weight / (height * height);
        Log.d("DEBUG", String.valueOf(bmi));
        Toast.makeText(this,"您的BMI值為：" + bmi,Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this)
                .setTitle("BMI")
                .setMessage("您的BMI值為：" + bmi)
                .setPositiveButton("OK",null)
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
