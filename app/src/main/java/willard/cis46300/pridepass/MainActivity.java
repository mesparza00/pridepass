package willard.cis46300.pridepass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final EditText name = (EditText) findViewById(R.id.PUsername);
        final EditText password = (EditText) findViewById(R.id.PPassword);
        final CheckBox rememberme = (CheckBox)findViewById(R.id.cbRememberMe);
        final Button login = (Button) findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            if(name.getText().toString().equals("admin") &&

            password.getText().toString().equals("admin")){
                Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, DriverPassenger.class));
            }
            else{
                Toast.makeText(getApplicationContext(), "Wrong Credtials", Toast.LENGTH_SHORT).show();


            }

            }
        });
    }
}
