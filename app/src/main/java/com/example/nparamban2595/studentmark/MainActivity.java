package com.example.nparamban2595.studentmark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button button2;
    private StudentOperations studentDBoperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button2 = (Button)findViewById(R.id.vbutton);
        setContentView(R.layout.activity_main);
        studentDBoperation = new StudentOperations(this);
        studentDBoperation.open();

    }
    public void onClick(View view)
    {

        switch (view.getId()) {

            case R.id.vbutton:
                List values = studentDBoperation.getAllStudents();

                Toast.makeText(getApplicationContext(),
                        "Data viewed"+values.size(), Toast.LENGTH_LONG).show();


                break;
            case R.id.upbutton:
                Toast.makeText(getApplicationContext(),
                        "Data updates", Toast.LENGTH_LONG).show();

                break;
            case R.id.abutton:
                Student stud = studentDBoperation.addStudent("Nuhman");

                Toast.makeText(getApplicationContext(),
                        "Data added", Toast.LENGTH_LONG).show();

                break;
            case R.id.dbutton:
                Toast.makeText(getApplicationContext(),
                        "Data deleted", Toast.LENGTH_LONG).show();

                break;
        }

    }
}
