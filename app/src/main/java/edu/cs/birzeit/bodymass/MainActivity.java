package edu.cs.birzeit.bodymass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt_H;
    private EditText edt_W;
    private TextView txt_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
    }

    private void setup() {
        edt_H = findViewById(R.id.edt_H);
        edt_W=findViewById(R.id.edt_W);

    }


    public void Btn_Calc(View view) {
        double Bmi=0;
        String W= edt_W.getText().toString();
        double w = Double.parseDouble(W);
        String H= edt_H.getText().toString();
        double h = Double.parseDouble(H);
        Bmi = w/(h*h);
        String total = Double.toString(Bmi);
        txt_c.setText("total");

    }
}