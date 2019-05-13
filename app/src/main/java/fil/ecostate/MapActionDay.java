package fil.ecostate;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class MapActionDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapactionday);
        getSupportActionBar().hide();

        final CheckBox ch1 = findViewById(R.id.checkBox5);
        final CheckBox ch2 = findViewById(R.id.checkBox4);
        final CheckBox ch3 = findViewById(R.id.checkBox3);
        final CheckBox ch4 = findViewById(R.id.checkBox2);
        final CheckBox ch5 = findViewById(R.id.checkBox);


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

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ) {
                    ch1.setPaintFlags(ch1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else {
                    ch1.setPaintFlags(ch1.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                }
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ) {
                    ch2.setPaintFlags(ch2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else {
                    ch2.setPaintFlags(ch2.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                }
            }
        });
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ) {
                    ch3.setPaintFlags(ch3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else {
                    ch3.setPaintFlags(ch3.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                }
            }
        });
        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ) {
                    ch4.setPaintFlags(ch4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else {
                    ch4.setPaintFlags(ch4.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                }
            }
        });
        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ) {
                    ch5.setPaintFlags(ch5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else {
                    ch5.setPaintFlags(ch5.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                }
            }
        });
    }
}
