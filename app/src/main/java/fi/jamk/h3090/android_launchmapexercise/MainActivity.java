package fi.jamk.h3090.android_launchmapexercise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLocation(View view) {
        EditText latitudeField = (EditText) findViewById(R.id.txtLatitude);
        EditText longitudeField = (EditText) findViewById(R.id.txtLongitude);

        String latitudeValue = latitudeField.getText().toString();
        String longitudeValue = longitudeField.getText().toString();

        double latitude = Double.parseDouble(latitudeValue);
        double longitude = Double.parseDouble(longitudeValue);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(String.format(Locale.US, "geo:%1$,.2f,%2$,.2f", latitude, longitude)));
        startActivity(intent);
    }
}
