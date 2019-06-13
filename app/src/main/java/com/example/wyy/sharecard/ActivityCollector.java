package com.example.wyy.sharecard;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 振丿Love on 2017/6/10.
 */

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<>();

    public  static void addActivity(Activity activity){
        activities.add(activity);
    }

    public  static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finish2(){
            activities.get(activities.size()-1).finish();
            Log.e("finish", "1");
            activities.get(activities.size()-1).finish();
            Log.e("finish", "2");
    }

    public static void finishAll(){
        for (Activity activity : activities){
            if(!activity.isFinishing())
                activity.finish();
        }
    }

}
