package com.senior.bluehome;

import android.os.Bundle;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.view.Menu;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	private ToggleButton toggle_living_room, toggle_kitchen,toggle_master_bedroom;
	private ToggleButton toggle_bedroom1,toggle_bedroom2;
	
	private Button btnDisplay;
	private static final int REQUEST_CONNECT_DEVICE = 1;
    private static final int REQUEST_ENABLE_BT = 2;
	// Name of connected device
    private String ConnectedDeviceName = null;
    // Local Bluetooth adapter
    private BluetoothAdapter BluetoothAdapter = null;
    // Member object for Bluetooth Command Service
   // private BluetoothCommandService CommandService = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		BluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
//		
//		if(BluetoothAdapter == null){
//			Toast.makeText(this, "Bluetooth not available on this device", Toast.LENGTH_LONG).show();
//            finish();
//            return;
//		}
		
		addListenerOnLightButton();
		 
	  }
	 
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.home_controls:
	        	return super.onOptionsItemSelected(item);
	        case R.id.media_player:
	            startActivity(new Intent(this, MediaPlayer.class));
	            return true;
	        case R.id.action_settings:
	            startActivity(new Intent(this, Settings.class));
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	public void addListenerOnLightButton() {
	 
		toggle_living_room = (ToggleButton) findViewById(R.id.toggle_living_room);
		toggle_living_room.setOnClickListener(new OnClickListener() {		 
			@Override
			public void onClick(View v) {
			   StringBuffer result = new StringBuffer();
			   result.append("Living Room : ").append(toggle_living_room.getText());
			   Toast.makeText(MainActivity.this, result.toString(),
				Toast.LENGTH_SHORT).show();
			}
		});
		
		toggle_kitchen = (ToggleButton) findViewById(R.id.	toggle_kitchen);
		toggle_kitchen.setOnClickListener(new OnClickListener() {		 
			@Override
			public void onClick(View v) {
			   StringBuffer result = new StringBuffer();
			   result.append("Kitchen : ").append(toggle_kitchen.getText());
			   Toast.makeText(MainActivity.this, result.toString(),
				Toast.LENGTH_SHORT).show();
			}
		});
		
		toggle_master_bedroom = (ToggleButton) findViewById(R.id.toggle_master_bedroom);
		toggle_master_bedroom.setOnClickListener(new OnClickListener() {		 
			@Override
			public void onClick(View v) {
			   StringBuffer result = new StringBuffer();
			   result.append("Master Bedroom : ").append(toggle_master_bedroom.getText());
			   Toast.makeText(MainActivity.this, result.toString(),
				Toast.LENGTH_SHORT).show();
			}
		});
		
		toggle_bedroom1 = (ToggleButton) findViewById(R.id.toggle_bedroom1);
		toggle_bedroom1.setOnClickListener(new OnClickListener() {		 
			@Override
			public void onClick(View v) {
			   StringBuffer result = new StringBuffer();
			   result.append("Bedroom 1 : ").append(toggle_bedroom1.getText());
			   Toast.makeText(MainActivity.this, result.toString(),
				Toast.LENGTH_SHORT).show();
			}
		});
		
		toggle_bedroom2 = (ToggleButton) findViewById(R.id.toggle_bedroom2);
		toggle_bedroom2.setOnClickListener(new OnClickListener() {		 
			@Override
			public void onClick(View v) {
			   StringBuffer result = new StringBuffer();
			   result.append("Bedroom 2 : ").append(toggle_bedroom2.getText());
			   Toast.makeText(MainActivity.this, result.toString(),
				Toast.LENGTH_SHORT).show();
			}
		});
		
		btnDisplay = (Button) findViewById(R.id.btnDisplay);
	 
		btnDisplay.setOnClickListener(new OnClickListener() {
	 
			@Override
			public void onClick(View v) {
	 
			   StringBuffer result = new StringBuffer();
			   result.append("Living Room : ").append(toggle_living_room.getText());
			   result.append("\nKitchen : ").append( toggle_kitchen.getText());
			   result.append("\nMaster Bedroom : ").append(toggle_master_bedroom.getText());
			   result.append("\nBedroom 1 : ").append(toggle_bedroom1.getText());
			   result.append("\nBedroom 2 : ").append(toggle_bedroom2.getText());
	 
			   Toast.makeText(MainActivity.this, result.toString(),
				Toast.LENGTH_SHORT).show();
	 
			}
	 
		});
	  }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
//		// If Bluetooth not on then request enable.
//        // setupCommand() will then be called during onActivityResult
//		if (!BluetoothAdapter.isEnabled()) {
//			Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//			startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
//		}
//		// otherwise set up the command service
//		else {
//		//	if (CommandService==null)
//				setupCommand();
//		}
	}
	
	
	
	private void setupCommand() {
		// Initialize the BluetoothChatService to perform bluetooth connections
      //  CommandService = new BluetoothCommandService(this, Handler);
	}
	

}
