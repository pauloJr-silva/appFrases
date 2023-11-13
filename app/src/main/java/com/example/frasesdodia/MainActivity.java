package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String [] frases = {"Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.\nRoberto Shinyashiki",
                            "A vida é 10% o que acontece a você e 90% como você reage a isso.\nCharles Swindoll",
                            "Um livro, uma caneta, uma criança e um professor podem mudar o mundo.\nMalala Yousafzai",
                            "A felicidade não é algo pronto. Ela é feita das suas próprias ações.\nDalai Lama",
                            "Cada segundo é tempo para mudar tudo para sempre.\nCharles Chaplin"
        };

        int numero = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.txtNovaFrase);
        texto.setText(frases[numero]);

    }
}