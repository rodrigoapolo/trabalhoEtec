package com.example.tabela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void total(View view) {

        EditText codigo = findViewById(R.id.etCod);
        EditText quantidade = findViewById(R.id.etQuan);

        int cod = Integer.parseInt(codigo.getText().toString());
        int quan = Integer.parseInt(quantidade.getText().toString());

        if (cod==1){
            double cachorro = 4*quan;
            String valor = String.format("Total R$ %.2f",cachorro);
            Toast.makeText(this,valor,Toast.LENGTH_LONG).show();
        }else if (cod==2){
                     double xSalada = 4.5*quan;
                     String valor = String.format("Total R$ %.2f",xSalada);
                     Toast.makeText(this,valor,Toast.LENGTH_LONG).show();
                }else if (cod==3){
                         double xBanco = 5*quan;
                         String valor = String.format("Total R$ %.2f",xBanco);
                         Toast.makeText(this,valor,Toast.LENGTH_LONG).show();
                        }else if (cod==4){
                                     double torrada = 2*quan;
                                     String valor = String.format("Total R$ %.2f",torrada);
                                     Toast.makeText(this,valor,Toast.LENGTH_LONG).show();
                                }else if (cod==5){
                                            double refrigerante = 1.5*quan;
                                            String valor = String.format("Total R$ %.2f",refrigerante);
                                            Toast.makeText(this,valor,Toast.LENGTH_LONG).show();
                                        }
    }
}