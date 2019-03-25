package fil.ecostate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MapActionDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapactionday);
        getSupportActionBar().hide();

        Button compte = findViewById(R.id.button15);
        Button astuces = findViewById(R.id.button12);
        Button stats = findViewById(R.id.button13);
        Button news = findViewById(R.id.button14);
        ImageButton map = findViewById(R.id.imageButton18);


        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCompte = new Intent(MapActionDay.this, Compte.class);
                startActivity(goCompte);
            }
        });
        astuces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goAstuces = new Intent(MapActionDay.this, Astuces.class);
                startActivity(goAstuces);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMap = new Intent(MapActionDay.this, Map.class);
                startActivity(goMap);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNews = new Intent(MapActionDay.this, New.class);
                startActivity(goNews);
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStats = new Intent(MapActionDay.this, Stats.class);
                startActivity(goStats);
            }
        });
    }
}
