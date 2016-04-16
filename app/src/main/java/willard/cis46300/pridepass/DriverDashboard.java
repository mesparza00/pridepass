package willard.cis46300.pridepass;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Derrik on 4/14/2016.
 */
public class DriverDashboard extends MainActivity {

    double carColor;
    double carMake;
    double carModel;
    int numberOfPassengers;
    int departureTime;
    String campusChoice;
    String campusMeeting;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final EditText passengers = (EditText) findViewById(R.id.numPassengers);
    final EditText time = (EditText) findViewById(R.id.txtTime);
    final Spinner campus = (Spinner) findViewById(R.id.spinnerCampus);
    final Spinner meeting = (Spinner) findViewById(R.id.spinnerMeeting);
    final EditText color = (EditText) findViewById(R.id.txtColor);
    final EditText make = (EditText)findViewById(R.id.txtMake);
    final EditText model = (EditText)findViewById(R.id.txtModel);
    final Button   submit = (Button) findViewById(R.id.btnSubmit);

    submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            numberOfPassengers = Integer.parseInt(passengers.getText().toString());
            departureTime = Integer.parseInt(time.getText().toString());
            carColor = Double.parseDouble(color.getText().toString());
            carMake = Double.parseDouble(make.getText().toString());
            carModel = Double.parseDouble(model.getText().toString());
            campusChoice = campus.getSelectedItem().toString();
            campusMeeting = meeting.getSelectedItem().toString();
        }
    });

}
}