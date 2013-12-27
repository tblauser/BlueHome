package com.senior.bluehome;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;

public class SongsManager {
	// SDCard Path
	final String MEDIA_PATH = new String("/sdcard/");
	private ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();
	
	// Constructor
	public SongsManager(){
		
	}
	
	/**
	 * Function to read all mp3 files from sdcard
	 * and store the details in ArrayList
	 * */
	public ArrayList<HashMap<String, String>> getPlayList(Context resolver){
//		File home = new File(MEDIA_PATH);
//
//		if (home.listFiles(new FileExtensionFilter()).length > 0) {
//			for (File file : home.listFiles(new FileExtensionFilter())) {
//				HashMap<String, String> song = new HashMap<String, String>();
//				song.put("songTitle", file.getName().substring(0, (file.getName().length() - 4)));
//				song.put("songPath", file.getPath());
//				
//				// Adding each song to SongList
//				songsList.add(song);
//			}
//		}
//		// return songs list array
//		return songsList;
	    Cursor cursor = resolver.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, 
	            new String [] {"ARTIST", "DURATION", "TITLE", "_DATA", "ALBUM"}, null, null, null);
	    while(cursor.moveToNext()) {
	    HashMap<String, String> song = new HashMap<String, String>();
	    song.put("artist", cursor.getString(0));
	    song.put("duration", cursor.getString(1));
	    song.put("songTitle", cursor.getString(2));
	    song.put("songPath",cursor.getString(3));
	    song.put("album",cursor.getString(4));
	    // Adding each song to SongList
	    songsList.add(song);

	    }
	    System.out.println(songsList.size());
	    return songsList;
	}
	
	/**
	 * Class to filter files which are having .mp3 extension
	 * */
	class FileExtensionFilter implements FilenameFilter {
		public boolean accept(File dir, String name) {
			return (name.endsWith(".mp3") || name.endsWith(".MP3"));
		}
	}
}
