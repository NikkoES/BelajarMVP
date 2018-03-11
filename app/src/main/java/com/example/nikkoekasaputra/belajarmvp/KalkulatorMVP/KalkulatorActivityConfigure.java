package com.example.nikkoekasaputra.belajarmvp.KalkulatorMVP;

/**
 * Created by gits on Configurator
 */
public class KalkulatorActivityConfigure {
    private static KalkulatorActivityConfigure ourInstance = new KalkulatorActivityConfigure();

    private KalkulatorActivityConfigure() {
    }

    public static KalkulatorActivityConfigure getInstance() {
        return ourInstance;
    }

    public void config(KalkulatorActivity activity) {
        KalkulatorActivityPresent present = new KalkulatorActivityPresent();
        present.output = activity;
        activity.input = present;
    }
}
