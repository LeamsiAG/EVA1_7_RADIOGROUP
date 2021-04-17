package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup rdgpcomida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdgpcomida = findViewById(R.id.rdgpcomida);
        rdgpcomida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {

      switch (i){
          case R.id.radioButton:
              Toast.makeText(getApplicationContext(),"Montados",Toast.LENGTH_SHORT).show();
          break;
          case R.id.radioButton2:
              Toast.makeText(getApplicationContext(),"Burritos",Toast.LENGTH_SHORT).show();
              break;
          case R.id.radioButton3:
              Toast.makeText(getApplicationContext(),"Alitas",Toast.LENGTH_SHORT).show();
              break;
          case R.id.radioButton4:
              Toast.makeText(getApplicationContext(),"Garnachas",Toast.LENGTH_SHORT).show();
              break;
          case R.id.radioButton5:
              Toast.makeText(getApplicationContext(),"Tacos",Toast.LENGTH_SHORT).show();
              break;
          case R.id.radioButton6:
              Toast.makeText(getApplicationContext(),"Codorniz en salsa de nuez",Toast.LENGTH_SHORT).show();
              break;
          default:
      }
            }
        });
    }
}