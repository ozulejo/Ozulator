package com.example.ozulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView resultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    float valor;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);

    }

    public void EscribirCero(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("0");
        }else {
            resultado.setText(resultado.getText() + "0");}
        }

    public void EscribirUno(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("1");
        }else {
            resultado.setText(resultado.getText() + "1");}
    }

    public void EscribirDos(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("2");
        }else {
            resultado.setText(resultado.getText() + "2");}
    }

    public void EscribirTres(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("3");
        }else {
            resultado.setText(resultado.getText() + "3");}
    }

    public void EscribirCuatro(View view) {
        float  valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("4");
        }else {
            resultado.setText(resultado.getText() + "4");}
    }

    public void EscribirCinco(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("5");
        }else {
            resultado.setText(resultado.getText() + "5");}
    }

    public void EscribirSeis(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("6");
        }else {
            resultado.setText(resultado.getText() + "6");}
    }

    public void EscribirSiete(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("7");
        }else {
            resultado.setText(resultado.getText() + "7");}
    }

    public void EscribirOcho(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("8");
        }else {
            resultado.setText(resultado.getText() + "8");}
    }

    public void EscribirNueve(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText("9");
        }else {
            resultado.setText(resultado.getText() + "9");}
    }

    public void EscribirPunto(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if (valor == 0.0f) {
            resultado.setText(".");
        }else {
            resultado.setText(resultado.getText() + ".");}
    }

    public void Limpiar(View view) {
        resultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void Dividir(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operacion = "/";
        resultado.setText("0");
    }

    public void Suma(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operacion = "+";
        resultado.setText("0");
    }

    public void Resta(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operacion = "-";
        resultado.setText("0");
    }

    public void Multiplicar(View view) {
        numero1 = Float.parseFloat(resultado.getText().toString());
        operacion = "*";
        resultado.setText("0");
    }

    public void Igual(View view) {
        numero2 = Float.parseFloat(resultado.getText().toString());
        if (operacion.equals("+")){
            float result = numero1 + numero2;
            resultado.setText(result + "");
        }
        if (operacion.equals("-")){
            float result = numero1 - numero2;
            resultado.setText(result + "");
        }
        if (operacion.equals("*")){
            float result = numero1 * numero2;
            resultado.setText(result + "");
        }
        if(operacion.equals("/")){
            if(numero2 == 0.0f){
                resultado.setText("0");
                Toast.makeText( this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 / numero2;
                resultado.setText(result + "");
            }

        }
    }
}
