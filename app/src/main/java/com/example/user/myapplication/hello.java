package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class hello extends AppCompatActivity {

    EditText name;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        name=(EditText)findViewById(R.id.et_name);
        back=(Button)findViewById(R.id.btn_back);
        back.setOnClickListener(this.gk);
    }
    private View.OnClickListener gk=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String tp="Hello "+name.getText().toString();
            Toast.makeText(hello.this,tp, Toast.LENGTH_SHORT).show();

            finish();
        }
    };
}
