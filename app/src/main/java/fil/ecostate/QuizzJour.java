package fil.ecostate;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuizzJour extends AppCompatActivity {
    private static final int DIALOG_ALERT = 10;
    private int compteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzjour);
        getSupportActionBar().hide();
        Button validerQuizz = findViewById(R.id.button00);
        RadioButton b1_1 = findViewById(R.id.radioButton11);
        RadioButton b1_2 = findViewById(R.id.radioButton12);
        RadioButton b1_3 = findViewById(R.id.radioButton13);
        RadioButton b2_1 = findViewById(R.id.radioButton21);
        RadioButton b2_2 = findViewById(R.id.radioButton22);
        RadioButton b3_3 = findViewById(R.id.radioButton33);
        RadioButton b4_1 = findViewById(R.id.radioButton41);
        RadioButton b4_2 = findViewById(R.id.radioButton42);



        //Valide les réponses et retourne sur écran MAP
        validerQuizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ajouter le nb de bonnes réponses
                compteur = compteReponses(v);
                showDialog(DIALOG_ALERT);

                Intent goMap = new Intent(QuizzJour.this, Map.class);
                startActivity(goMap);
                finish();
            }
        });
    }

    //Compte les bonnes réponses du quizz du jour
    private int compteReponses(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        compteur = 0;
        switch (view.getId()){
            case R.id.radioButton11:
                if (checked)
                    compteur++;
            case R.id.radioButton21:
                if (checked)
                    compteur++;
        }
        return compteur;
    }

    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DIALOG_ALERT:
                // Create out AlterDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Vous avez"+ compteur + "réponse(s) valides !");
                builder.setCancelable(true);
                builder.setPositiveButton("Okay", new OkOnClickListener());
                AlertDialog dialog = builder.create();
                dialog.show();
        }
        return super.onCreateDialog(id);
    }

    private final class OkOnClickListener implements
            DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialog, int which) {}



    }
}

