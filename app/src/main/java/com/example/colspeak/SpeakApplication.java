package com.example.colspeak;

import android.app.Application;
import com.example.colspeak.database.DatabaseHelper;

public class SpeakApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        
        // Cargar temas de pronunciación
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        dbHelper.loadTopicsFromFile(this);
    }
} 