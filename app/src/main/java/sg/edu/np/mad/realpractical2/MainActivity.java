package sg.edu.np.mad.realpractical2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TITLE = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "On Create");

        Button followbutton = findViewById(R.id.button17);
        User user = new User(); // retrieve the user object
        if (user.followed == true)
        {
            followbutton.setText("UNFOLLOW");
        } else {
            followbutton.setText("FOLLOW");
        }

        followbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.followed == true) {
                    followbutton.setText("FOLLOW");
                    user.followed = false;
                } else {
                    followbutton.setText("UNFOLLOW");
                    user.followed =true;
                }
            }
        });





    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.v(TITLE, "On Start!");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.v(TITLE, "On pause");
    }
    @Override
    protected void onResume() {

        super.onResume();
        Log.v(TITLE, "On Resume");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.v(TITLE, "On Stop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.v(TITLE, "On Destroy");
    }


}

