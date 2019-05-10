package fil.ecostate;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        //getSupportActionBar().hide();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        if(mapFragment == null){
            // Create new Map instance if it doesn't exist
            mapFragment = SupportMapFragment.newInstance();
        }

        mapFragment.getMapAsync(this);

        Button compte = findViewById(R.id.button27);
        Button astuces = findViewById(R.id.button24);
        Button stats = findViewById(R.id.button25);
        Button news = findViewById(R.id.button26);
        ImageButton map = findViewById(R.id.imageButton15);

        ImageButton mapAction = findViewById(R.id.imageButton14);
        ImageButton mapDefis = findViewById(R.id.imageButton21);

        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCompte = new Intent(Map.this, Compte.class);
                startActivity(goCompte);
            }
        });
        astuces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goAstuces = new Intent(Map.this, Astuces.class);
                startActivity(goAstuces);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMap = new Intent(Map.this, Map.class);
                startActivity(goMap);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNews = new Intent(Map.this, New.class);
                startActivity(goNews);
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStats = new Intent(Map.this, Stats.class);
                startActivity(goStats);
            }
        });

        mapAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStats = new Intent(Map.this, MapActionDay.class);
                startActivity(goStats);
            }
        });
        mapDefis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStats = new Intent(Map.this, MapDéfis.class);
                startActivity(goStats);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(50.640560, 3.075010);
        mMap.addMarker(new MarkerOptions().position(sydney).title("vous etes ici"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //CameraUpdateFactory.newLatLngZoom(sydney, 12.0f);
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 12.0f ) );

    }
    /*
    private void addHeatMap() {
        List<LatLng> list = null;

        // Get the data: latitude/longitude positions of police stations.
        try {
            list = readItems(R.raw.police_stations);
        } catch (JSONException e) {
            Toast.makeText(this, "Problem reading list of locations.", Toast.LENGTH_LONG).show();
        }

        // Create a heat map tile provider, passing it the latlngs of the police stations.
        mProvider = new HeatmapTileProvider.Builder()
                .data(list)
                .build();
        // Add a tile overlay to the map, using the heat map tile provider.
        mOverlay = mMap.addTileOverlay(new TileOverlayOptions().tileProvider(mProvider));
    }
    */

    private ArrayList<LatLng> readItems(int resource) throws JSONException {
        ArrayList<LatLng> list = new ArrayList<LatLng>();
        InputStream inputStream = getResources().openRawResource(resource);
        String json = new Scanner(inputStream).useDelimiter("\\A").next();
        JSONArray array = new JSONArray(json);
        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            double lat = object.getDouble("lat");
            double lng = object.getDouble("lng");
            list.add(new LatLng(lat, lng));
        }
        return list;
    }
}
