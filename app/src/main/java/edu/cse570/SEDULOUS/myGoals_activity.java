package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class myGoals_activity extends AppCompatActivity {

    TextView GoalCategory;
    Button newGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_goals);
        GoalCategory= (TextView)findViewById(R.id.GoalCategory1);
        newGoal = (Button) findViewById(R.id.newGoals);

        GoalCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myGoals_activity.this, goals_activity.class);
                startActivity(intent);

                //Toast.makeText(MyGoals_activity.this,"opening Dashboard", Toast.LENGTH_LONG).show();
            }
        });

        newGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myGoals_activity.this, goalTypes_activity.class);
                startActivity(intent);
            }
        });
    }
}