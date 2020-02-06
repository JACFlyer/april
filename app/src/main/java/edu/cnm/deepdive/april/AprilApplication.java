package edu.cnm.deepdive.april;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class AprilApplication extends Application {


  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }
}
