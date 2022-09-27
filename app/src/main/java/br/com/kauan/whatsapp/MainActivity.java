package br.com.kauan.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    public Button botao;
    public TextInputEditText ddd;
    public TextInputEditText mensagem;
    public TextInputEditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ddd = findViewById(R.id.input_ddd);
        mensagem = findViewById(R.id.input_mensagem);
        telefone = findViewById(R.id.input_telefone);
        botao = findViewById(R.id.input_button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String telefoneOficial = "55" + ddd.getText().toString() + telefone.getText().toString();
                Uri web = Uri.parse("https://wa.me/" + telefoneOficial + "?text=" + mensagem.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intent);
            }
        });
    }
}