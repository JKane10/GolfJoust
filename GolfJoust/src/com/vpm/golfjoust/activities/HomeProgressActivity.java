package com.vpm.golfjoust.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.vpm.golfjoust.R;

public class HomeProgressActivity extends Activity {
	
	private ProgressBar gamesProgress;
	private int gamesProgressStatus = 0;
	private ProgressBar winsProgress;
	private int winsProgressStatus = 0;
	
	
	private Handler gamesHandler = new Handler();
	private Handler winsHandler = new Handler();

    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_progress);
        
        gamesProgress = (ProgressBar) findViewById(R.id.games_progress);
        winsProgress = (ProgressBar) findViewById(R.id.wins_progress);
        
        new Thread (new Runnable() {
        	public void run() {
        		while (gamesProgressStatus < 100) {
        			//pull games value
        			//gamesProgressStatus = games value;
        			
        			gamesHandler.post(new Runnable() {
        				public void run() {
        					gamesProgress.setProgress(gamesProgressStatus);
        				}
        			});
        		}
        	}
        }).start();
        
        new Thread (new Runnable() {
        	public void run() {
        		while (winsProgressStatus < 100) {
        			//pull wins value
        			//winsProgressStatus = wins value;
        			
        			winsHandler.post(new Runnable() {
        				public void run() {
        					winsProgress.setProgress(winsProgressStatus);
        				}
        			});
        		}
        	}
        }).start();
        
    } 
    
}

