package willard.cis46300.pridepass;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by derri on 4/15/2016.
 */
public class ExtendedClientDash extends DriverDashboard {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView groupInfo = (TextView)findViewById(R.id.txtGroupInfo);
        final Button signup = (Button)findViewById(R.id.btnSignUpCancel);
        final TextView locationTime = (TextView)findViewById(R.id.txtLocationTime);
        final TextView carDescription = (TextView)findViewById(R.id.txtCarDescription);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sign student up to group code****

                signup.setText("Cancel");

            }
        });



}}
