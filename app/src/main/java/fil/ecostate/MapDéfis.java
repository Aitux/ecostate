package fil.ecostate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MapDéfis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapdefis);
        getSupportActionBar().hide();

        Button compte = findViewById(R.id.button32);
        Button astuces = findViewById(R.id.button29);
        Button stats = findViewById(R.id.button30);
        Button news = findViewById(R.id.button31);
        ImageButton map = findViewById(R.id.imageButton22);


        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCompte = new Intent(MapDéfis.this, Compte.class);
                startActivity(goCompte);
            }
        });
        astuces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goAstuces = new Intent(MapDéfis.this, Astuces.class);
                startActivity(goAstuces);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMap = new Intent(MapDéfis.this, Map.class);
                startActivity(goMap);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNews = new Intent(MapDéfis.this, New.class);
                startActivity(goNews);
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStats = new Intent(MapDéfis.this, Stats.class);
                startActivity(goStats);
            }
        });
    }
}
