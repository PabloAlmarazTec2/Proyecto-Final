package com.example.pablo.login;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Registro extends AppCompatActivity implements View.OnClickListener {
EditText et_nombre, et_usuario, etpassword;
Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_registro);


        et_nombre =findViewById(R.id.EditT_nombre);
        et_usuario =findViewById(R.id.EditT_Usuario);
        etpassword =findViewById(R.id.EditT_password);

        btn_registrar =  (Button) findViewById(R.id.btnregistrar);

        btn_registrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
   final String name=et_nombre.getText().toString();
        final String username=et_usuario.getText().toString();
        final String password=etpassword.getText().toString();


        Response.Listener<String> respoListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean sucess = jsonResponse.getBoolean("success");
                    if(sucess){
                        Intent intent = new Intent(Registro.this,MainActivity.class);
                        Registro.this.startActivity(intent);



                    }else{
                        AlertDialog.Builder builder = new AlertDialog.Builder(Registro.this);
                        builder.setMessage("error registro")
                                .setNegativeButton("Retry",null)

                                .create()
                                .show();





                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        };
        RegisterRequest registerRequest = new RegisterRequest(username,name,password, respoListener);
        RequestQueue queue = Volley.newRequestQueue(Registro.this);
        queue.add(registerRequest);

    }
            }
