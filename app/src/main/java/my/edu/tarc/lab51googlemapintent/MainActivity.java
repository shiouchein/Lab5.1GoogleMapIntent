package my.edu.tarc.lab51googlemapintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextLat, editTextLon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLat = (EditText)findViewById(R.id.editTextLat);
        editTextLon = (EditText)findViewById(R.id.editTextLon);

        Button buttonShowMap = (Button)findViewById(R.id.buttonShowMap);
        buttonShowMap.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Double lat, lon;
                String query = "cinema";
                lat = Double.parseDouble(editTextLat.getText().toString());
                lon = Double.parseDouble(editTextLon.getText().toString());

                //TODO: passing lat and lot values to an Intent Object
                Uri gmmIntentUri = Uri.parse("geo:" + lat + "," + lon + "?q=" + query);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);

            }
        });

    }
}
