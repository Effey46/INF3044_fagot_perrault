package org.esiea.fagot_perrault.app00;

import android.app.DatePickerDialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public DatePickerDialog dpd=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvhello=(TextView)findViewById(R.id.tvhello);
        final Button btnhello=(Button)findViewById(R.id.btnhello);
        DatePickerDialog.OnDateSetListener odsl=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                btnhello.setText(dayOfMonth+"/"+(month+1)+"/"+year);
            }
        };
        dpd=new DatePickerDialog(this, odsl,2016,05,23);
    }


    public void boum(View v)
    {
        Toast.makeText(getApplicationContext(),getString(R.string.boum),Toast.LENGTH_LONG).show();
        //dpd.show();
        //NotificationCompat.Builder builder=(NotificationCompat.Builder)new NotificationCompat.Builder(this).setSmallIcon(R.mipmap.ic_launcher).setContentText("plop").setContentTitle("first plop");
        //NotificationManager nm=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        //nm.notify(0,builder.build());
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
        GetBiersServices.startActionGetBiers(this);

    }
}
