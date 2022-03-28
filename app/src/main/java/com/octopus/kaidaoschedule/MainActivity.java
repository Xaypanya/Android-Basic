package com.octopus.kaidaoschedule;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtId, txtUsername, txtEmail, txtPhone;
    Button btnRegister, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtId = findViewById(R.id.txtId);
        txtUsername = findViewById(R.id.txtUsername);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.txtPhone);
        btnRegister = findViewById(R.id.btnRegister);
        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUsername.setText("");
                txtId.setText("");
                txtEmail.setText("");
                txtPhone.setText("");
                txtId.requestFocus();

                String username, id, email, phone;
                id = txtId.getText().toString();
                username = txtUsername.getText().toString();
                email = txtEmail.getText().toString();
                phone = txtPhone.getText().toString();

                String str = "- Username : "+ username;
                str += "\n- ID : "+ id;
                str += "\n- Email : "+ email;
                str += "\n- Phone : "+ phone;

                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }

        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, id, email, phone;
                id = txtId.getText().toString();
                username = txtUsername.getText().toString();
                email = txtEmail.getText().toString();
                phone = txtPhone.getText().toString();

                String str = "- Username : "+ username;
                       str += "\n- ID : "+ id;
                       str += "\n- Email : "+ email;
                       str += "\n- Phone : "+ phone;

                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });

        //Dissmissing Keyboard
        txtId.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    InputMethodManager inm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        });
        txtUsername.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    InputMethodManager inm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        });
        txtEmail.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    InputMethodManager inm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        });
        txtPhone.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    InputMethodManager inm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        });

    }
}