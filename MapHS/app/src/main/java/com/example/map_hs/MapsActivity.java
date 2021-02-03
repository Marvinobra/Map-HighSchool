package com.example.map_hs;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng SPA = new LatLng(16.111484228946473, 120.54432278364249);
        mMap.addMarker(new MarkerOptions().position(SPA).title("Marker in Saint Philomenas Academy"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPA));

        LatLng CIS = new LatLng(15.971176435632552, 120.48907782474461);
        mMap.addMarker(new MarkerOptions().position(CIS).title("Marker in Catablan Integrated School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CIS));

        LatLng STNHS = new LatLng(16.084047063568324, 120.73592464192534);
        mMap.addMarker(new MarkerOptions().position(STNHS).title("Marker in Sto. Tomas National High School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(STNHS));
    }
}