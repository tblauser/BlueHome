package com.senior.bluehome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
 
public class WebViewActivity extends Activity {
 
	private WebView webView;
 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview_activity);
 
		webView = (WebView) findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://blue-home.herokuapp.com");
		webView.setWebViewClient(new WebViewClient() {
	        @Override
	        public boolean shouldOverrideUrlLoading(WebView view, String url) {
	            return false;
	        }
	    });
//		webView.loadUrl("http://blue-home.herokuapp.com");
 
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.home:
	        	Intent intent1 = new Intent(this, BlueHome.class);
	        	intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	        	startActivity(intent1);
//	        	startActivity(new Intent(this, BlueHome.class));
	            return true;
	        case R.id.media_player:
	        	Intent intent2 = new Intent(this, MediaPlayerActivity.class);
	        	intent2.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	        	startActivity(intent2);
	        	return true;
	        case R.id.webview:
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
 
}
