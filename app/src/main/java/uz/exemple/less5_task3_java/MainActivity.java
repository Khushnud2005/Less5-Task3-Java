package uz.exemple.less5_task3_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button remember = findViewById(R.id.btn_remember);
        remember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userId = findViewById(R.id.et_userId_third);
                EditText userPw = findViewById(R.id.et_userPw_third);
                userId.setText("2004005605");
                userPw.setText("Pw38h@jF$5");
            }
        });


    }

}