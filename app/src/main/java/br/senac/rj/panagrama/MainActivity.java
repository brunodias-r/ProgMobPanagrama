package br.senac.rj.panagrama;

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

    public void onClick(View v){
        EditText editTextFrase = (EditText)findViewById(R.id.editTextFrase);
        String frase = editTextFrase.getText().toString();//Captura o que o usuário insere.
        String resultado = "Frase " + (!(new Panagrama(frase)).verifica()?" Not":"") + " Ok";
        Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();
    }
}