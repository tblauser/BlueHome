package com.senior.bluehome;

import android.os.Bundle;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuItem;

public class Settings extends Activity {
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
		setContentView(R.layout.settings);
		
//		BluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
//		
//		if(BluetoothAdapter == null){
//			Toast.makeText(this, "Bluetooth not available on this device", Toast.LENGTH_LONG).show();
//            finish();
//            return;
//		}
		
		
		 
	  }
	 
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.home_controls:
	        	startActivity( new Intent(this, MainActivity.class));
	            return true;
	        case R.id.media_player:
	            startActivity(new Intent(this, MediaPlayerActivity.class));
	            return true;
	        case R.id.action_settings:
	        	return super.onOptionsItemSelected(item);
	        default:
	            return super.onOptionsItemSelected(item);
	    }
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
