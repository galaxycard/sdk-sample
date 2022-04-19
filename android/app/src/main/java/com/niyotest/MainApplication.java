package com.niyotest;

import android.app.Application;
import android.content.Context;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import in.galaxycard.android.GalaxyCard;

public class MainApplication extends Application implements ReactApplication {
  @Override
  public ReactNativeHost getReactNativeHost() {
    return GalaxyCard.getReactNativeHost();
  }

  @Override
  public void onCreate() {
    super.onCreate();
    GalaxyCard.init(this);
  }
}
