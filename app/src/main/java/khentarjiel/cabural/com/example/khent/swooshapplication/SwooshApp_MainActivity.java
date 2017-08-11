package khentarjiel.cabural.com.example.khent.swooshapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SwooshApp_MainActivity extends AppCompatActivity {

    Button Get_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swoosh_app__main);
        Get_btn = (Button)findViewById(R.id.GET_STARTED_btn);



        Get_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SwooshApp_MainActivity.this,LeagueSelectionMainActivity.class));
            }
        });
    }
}
