package css.cis3334.heartratetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    HeartRateList heartRateList;// The list of heart rate objects
    ArrayAdapter<HeartRate> hrAdapter;
    ListView lvHeartRates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHeartRates = (ListView) findViewById(R.id.listViewHeartRate);

        heartRateList = new HeartRateList();
        heartRateList.InitRandomElderly();

        hrAdapter = new HeartRateAdapter(this, R.layout.heart_rate_row, R.id.textviewpulse, heartRateList);
        hrAdapter.setDropDownViewResource(R.layout.heart_rate_row);
        lvHeartRates.setAdapter(hrAdapter);
    }
}
