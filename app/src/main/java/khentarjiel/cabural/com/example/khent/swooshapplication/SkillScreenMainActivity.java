package khentarjiel.cabural.com.example.khent.swooshapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SkillScreenMainActivity extends AppCompatActivity {

    Button Beginner, Baller, finish;

    int chooser = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_screen_main);
        Beginner = (Button)findViewById(R.id.Beginner_button);
        Baller = (Button)findViewById(R.id.Baller_button);
        finish = (Button)findViewById(R.id.Finish_button);

        finish.setEnabled(false);
        finish.setAlpha((float)0.50);
    }
    public void buttons(View view){
        String button_text;
        button_text = ((Button) view).getText().toString();


        if (button_text.equals("Beginner")){
            finish.setEnabled(true);
            finish.setAlpha((float)0.9);
            chooser = 1;
        }else if (button_text.equals("Baller")){
            finish.setEnabled(true);
            finish.setAlpha((float)0.9);
            chooser = 2;
        }

    }

    public void finish(View view){

        Intent intent = new Intent();

        if (chooser == 1) {

            intent.putExtra("SendAngMessage", Beginner.getText().toString());
            setResult(Activity.RESULT_OK, intent);
            finish();

        } else if (chooser == 2) {

            intent.putExtra("SendAngMessage", Baller.getText().toString());
            setResult(Activity.RESULT_OK, intent);
            finish();


        }
    }
}
