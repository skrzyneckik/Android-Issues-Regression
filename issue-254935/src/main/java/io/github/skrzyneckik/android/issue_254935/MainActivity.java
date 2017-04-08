package io.github.skrzyneckik.android.issue_254935;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import io.github.skrzyneckik.issue_254934.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button issueButton = (Button) findViewById(R.id.issue_button);
        issueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup mainContent = (ViewGroup) findViewById(R.id.main_content);
                mainContent.removeAllViews();

                getLayoutInflater().inflate(R.layout.issue_layout, mainContent, true);
            }
        });

        Button issueFreeButton = (Button) findViewById(R.id.issue_free_button);
        issueFreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup mainContent = (ViewGroup) findViewById(R.id.main_content);
                mainContent.removeAllViews();

                getLayoutInflater().inflate(R.layout.issue_free_layout, mainContent, true);
            }
        });
    }
}
