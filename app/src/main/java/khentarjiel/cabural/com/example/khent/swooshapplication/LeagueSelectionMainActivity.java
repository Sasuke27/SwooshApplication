package khentarjiel.cabural.com.example.khent.swooshapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.GONE;

public class LeagueSelectionMainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE1 = 100;

    int chooser = 0;

    Button Men,Women,CoEd,Next;
    TextView Iam,Baller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_selection_main);
        Men = (Button) findViewById(R.id.Mens_btn);
        Women = (Button) findViewById(R.id.Womens_button);
        CoEd = (Button) findViewById(R.id.CoEd_button);
        Next = (Button) findViewById(R.id.Next_button);
        Iam = (TextView) findViewById(R.id.I_am_a_textView);
        Baller = (TextView) findViewById(R.id.BallerOrBeginTextView);

        Iam.setVisibility(GONE);
        Baller.setVisibility(View.INVISIBLE);
        Next.setEnabled(false);
        Next.setAlpha((float) 0.50);
    }
    public void Buttons(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Mens")) {
            Next.setAlpha((float) 0.9);
            Next.setEnabled(true);
            chooser = 1;

        }else if (button_text.equals("Womens")) {
            Next.setAlpha((float) 0.9);
            Next.setEnabled(true);
            chooser = 2;

        }else if (button_text.equals("Co-ed")) {
            Next.setAlpha((float) 0.9);
            Next.setEnabled(true);
            chooser = 3;

        }
    }
    public void NeXt(View view){

        Intent intent = new Intent(getApplicationContext(),SkillScreenMainActivity.class);
        startActivityForResult(intent, REQUEST_CODE1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == REQUEST_CODE1){
            if(resultCode == RESULT_OK){
                String Data = data.getStringExtra("SendAngMessage");

                Iam.setVisibility(View.VISIBLE);
                Next.setVisibility(View.INVISIBLE);
                Baller.setVisibility(View.VISIBLE);
                Baller.setText(Data);

                if (chooser == 1) {

                    Women.setEnabled(false);
                    Women.setAlpha((float)0.50);
                    CoEd.setAlpha((float)0.50);
                    CoEd.setEnabled(false);




                }else if (chooser == 2) {
                    Men.setEnabled(false);
                    Men.setAlpha((float)0.50);
                    CoEd.setAlpha((float)0.50);
                    CoEd.setEnabled(false);



                }else if (chooser == 3) {
                    Women.setEnabled(false);
                    Women.setAlpha((float)0.50);
                    Men.setAlpha((float)0.50);
                    Men.setEnabled(false);



                }

            }

        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
