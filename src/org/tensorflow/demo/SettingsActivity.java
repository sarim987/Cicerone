package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SettingsActivity extends Activity {

    private PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        prefManager = new PrefManager(this);


        final Button buttonClear;
        buttonClear = (Button) findViewById(R.id.clearBtn);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                prefManager.setFirstTimeLaunch(true);
                finish();
            }
        });

        final Button buttonGit;
        buttonGit = (Button) findViewById(R.id.gitBtn);
        buttonGit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Uri uri = Uri.parse("http://www.nupek.com"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
    }
}
