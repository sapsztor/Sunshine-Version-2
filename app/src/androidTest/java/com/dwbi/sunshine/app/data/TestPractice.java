package com.dwbi.sunshine.app.data;

import android.test.AndroidTestCase;
import android.util.Log;

public class TestPractice extends AndroidTestCase {
    private static String TAG = "sunshine_teszt";
    private static boolean DEBUG = true;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        Log.d("PSX", "kezdodik--------------------------------------------------------");
    }

    public void testPSX0 (){
        int a = 4;
        int b = 5;
        if (DEBUG) {Log.d(TAG, "TestPractice.testPSX0"); }
        assertEquals("PSX0 nek egyenlonek kell lennie..", a , (b-1));
    }

    public void testPSX1 (){
        int a = 4;
        int b = 5;
        if (DEBUG) {Log.d(TAG, "TestPractice.testPSX1"); }
        assertTrue("PSX1 nek egyenlonek kell lennie..", a == (b-1));
    }
    public void testPSX2 () {
        int a = 4;
        int b = 5;
        if (DEBUG) {Log.d(TAG, "TestPractice.testPSX2"); }
        assertFalse("PSX2 nek egyenlonek kell lennie..", a==(b-2));

    }


    public void testThatDemonstratesAssertions() throws Throwable {
        int a = 5;
        int b = 3;
        int c = 5;
        int d = 10;

        assertEquals("X should be equal", a, c);
        assertTrue("Y should be true", d > a);
        assertFalse("Z should be false", a == b);

        assertFalse("ennek hamisnak kellene lennie", a != a);

        if (b > d) {
            fail("XX should never happen");
        }
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        Log.d("PSX", "vege====================================================");

    }
}
