package willard.cis46300.pridepass;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverPassenger extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button driver = (Button)findViewById(R.id.btnDriver);
        final Button passenger = (Button) findViewById(R.id.btnPassenger);

        driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DriverPassenger.this, DriverDashboard.class));
            }
        });

        passenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DriverPassenger.this, ClientDashboard.class));
            }
        });
    }

}
