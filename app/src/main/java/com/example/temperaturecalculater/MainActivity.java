package com.example.temperaturecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum;
    Button btn;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum=findViewById(R.id.etNum);
        btn=findViewById(R.id.btn);
        tvResults=findViewById(R.id.tvResults);

        tvResults.setVisibility(View.GONE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(etNum.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Enter all fields!! ",Toast.LENGTH_SHORT).show();
                }
                else{
                    String num=etNum.getText().toString().trim();
                    int n=Integer.parseInt(num);
                    int result=(n/3) + 4;

                    tvResults.setText("The temp is "+result);
                    tvResults.setVisibility(View.VISIBLE);
                }

            }
        });

    }
}