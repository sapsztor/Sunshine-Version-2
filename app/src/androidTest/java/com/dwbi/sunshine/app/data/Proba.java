package com.dwbi.sunshine.app.data;

import android.test.AndroidTestCase;
import android.util.Log;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;


public class Proba  extends AndroidTestCase{
    private static String TAG = "sunshine_teszt";
    private static boolean DEBUG = true;

    boolean PSX1 = true;

    @Test
    public void proba1() {

        if (DEBUG) { Log.d(TAG, "Proba.proba1");}
        assertTrue("PSX1 nek egyenlonek kell lennie..", true);

    }

    @Test
    public void testproba2() {

        if (DEBUG) { Log.d(TAG, "Proba.proba1");}
        assertTrue("PSX1 nek egyenlonek kell lennie..", true);

    }
}
