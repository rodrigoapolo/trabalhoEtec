package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verificar(View view) {
        //Radio Button
        RadioButton radioHtl1 = findViewById(R.id.rbHtml);
        RadioButton radioHtl2 = findViewById(R.id.rbHtml1);
        RadioButton radioHtl3 = findViewById(R.id.rbHtml2);
        RadioButton radioHtl4 = findViewById(R.id.rbHtml3);
        String radCerto = new String("ok");
        int verRadio = 0;

        //Spinner
        Spinner sVariavel = findViewById(R.id.spiVaria);
        String spiVariavel = sVariavel.getSelectedItem().toString();
        String ceVariavel = new String("string");
        String douVariavel = new String("Double");
        String chaVariavel = new String("Char");
        String floVariavel = new String("Float");
        String spinner = new String("seleciona");
        String spiCerto = new String("ok");
        int verSpin = 0;

        // CheckBox
        CheckBox checkphp1 = findViewById(R.id.chPHP);
        CheckBox checkphp2 = findViewById(R.id.chPHP1);
        CheckBox checkphp3 = findViewById(R.id.chPHP2);
        CheckBox checkphp4 = findViewById(R.id.chPHP3);
        String chCerto = new String("ok");
        int verChec = 0;

        RadioButton radioJava1 = findViewById(R.id.rbJava);
        RadioButton radioJava2 = findViewById(R.id.rbJava1);
        RadioButton radioJava3 = findViewById(R.id.rbJava2);
        RadioButton radioJava4 = findViewById(R.id.rbJava3);
        String javCerto = new String("ok");
        int verJava = 0;

        if ((radioHtl1.isChecked() || radioHtl2.isChecked() || radioHtl3.isChecked() || radioHtl4.isChecked()) && (!(spiVariavel.equals(spinner))) && (checkphp1.isChecked() || checkphp2.isChecked() || checkphp3.isChecked() || checkphp4.isChecked()) && (radioJava1.isChecked() || radioJava2.isChecked() || radioJava3.isChecked() || radioJava4.isChecked())) {

            if(radioHtl1.isChecked()){
                verRadio ++;

            }else if(radioHtl2.isChecked()){
                        verRadio ++;

                    }else if(radioHtl3.isChecked()){
                                verRadio  = 2;

                        }else {
                             verRadio++;
                            }


            switch (verRadio){
                case 1:
                    radCerto = new String("Errado");
                    break;

                case 2:
                    radCerto= new String("Certo");
                    break;
            }

            if(spiVariavel.equals(douVariavel)){
                verSpin++;

            }else if(spiVariavel.equals(chaVariavel)){
                        verSpin++;

                    }else if(spiVariavel.equals(floVariavel)){
                                verSpin++;

                        }else {
                                verSpin = 2;
                            }

            switch (verSpin){
                case 1:
                    spiCerto = new String("Errado");
                    break;

                case 2:
                    spiCerto = new String("Certo");
                    break;
            }


           if (checkphp1.isChecked() && checkphp2.isChecked() && (checkphp3.isChecked() && checkphp4.isChecked())) {
               verChec ++;

            }else if (checkphp1.isChecked() && checkphp2.isChecked() && checkphp3.isChecked()){
                         verChec++;

                    }else if (checkphp1.isChecked() && checkphp2.isChecked() && checkphp4.isChecked()) {
                             verChec++;

                         }else if (checkphp1.isChecked() && checkphp2.isChecked()) {
                                     verChec = 2;

                            }else {
                                 verChec++;
                                }

            switch (verChec){
                case 1:
                    chCerto = new String("Errado");
                    break;
                case 2:
                    chCerto = new String("Certo");
                    break;
            }

           if(radioJava1.isChecked()){
               verJava++;

           }else if(radioJava2.isChecked()){
                        verJava++;

                }else if(radioJava3.isChecked()){
                             verJava++;

                    }else{
                            verJava = 2;
                        }

           switch (verJava){
               case 1:
                   javCerto = new String("Errado");
                   break;
               case 2:
                   javCerto = new String("Certo");
                   break;
           }


            Toast.makeText(this, "1 - "+radCerto+"\n2 - "+spiCerto+"\n3 - "+chCerto+"\n4 - "+javCerto,Toast.LENGTH_SHORT).show();

    }else{
        Toast.makeText(this, "Responda todas por favor", Toast.LENGTH_SHORT).show();
        }
    }
}