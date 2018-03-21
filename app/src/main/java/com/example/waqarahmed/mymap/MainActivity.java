package com.example.waqarahmed.mymap;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    private LocationManager locationManager;
    private LocationListener locationListener;
    Location location;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button2);


                locationManager= (LocationManager) getSystemService(LOCATION_SERVICE);
                locationListener= new LocationListener() {
                    @Override
                    public void onLocationChanged(Location location) {
                        double lon= location.getLongitude();
                        double  lat=location.getLatitude();
                        Intent intent= new Intent(MainActivity.this,MapsActivity.class);
                               intent.putExtra("lat",lat );
                               intent.putExtra("lon",lon);
                               startActivity(intent);

                    }

                    @Override
                    public void onStatusChanged(String provider, int status, Bundle extras) {
                      //  double lat= lo getLongitude().location.getLatitude())
                    }

                    @Override
                    public void onProviderEnabled(String provider) {

                    }

                    @Override
                    public void onProviderDisabled(String provider) {

                    }
                };

                         }
        }

