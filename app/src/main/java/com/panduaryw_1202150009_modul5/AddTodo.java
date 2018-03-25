package com.panduaryw_1202150009_modul5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddTodo extends AppCompatActivity {
    //variabel etName = (EditText)findViewById(R.id.etName);
    private EditText etName, etDesc, etPriority;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);
        etName = (EditText)findViewById(R.id.etName);
        etDesc = (EditText)findViewById(R.id.etDesc);
        etPriority = (EditText)findViewById(R.id.etPriority);
    }
    //intent extra name,desc,priority
    //intent.putExtra("name",etName.getText().toString());
    public void addTodo(View view) {
        Intent intent=new Intent();
        intent.putExtra("name",etName.getText().toString());
        intent.putExtra("desc",etDesc.getText().toString());
        intent.putExtra("priority",etPriority.getText().toString());
        setResult(1,intent);
        finish();//finishing activity
    }
}
