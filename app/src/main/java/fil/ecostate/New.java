package fil.ecostate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class New extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        getSupportActionBar().hide();

        /*
        Button compte = findViewById(R.id.button23);
        Button astuces = findViewById(R.id.button17);
        Button stats = findViewById(R.id.button21);
        Button news = findViewById(R.id.button22);
        ImageButton map = findViewById(R.id.imageButton20);


        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCompte = new Intent(New.this, Compte.class);
                startActivity(goCompte);
            }
        });
        astuces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goAstuces = new Intent(New.this, Astuces.class);
                startActivity(goAstuces);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMap = new Intent(New.this, Map.class);
                startActivity(goMap);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNews = new Intent(New.this, New.class);
                startActivity(goNews);
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStats = new Intent(New.this, Stats.class);
                startActivity(goStats);
            }
        });
        */
    }
}
