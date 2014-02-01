package jp.shuri.android.helloworld.tests;

import android.test.InstrumentationTestCase;

/**
 * Created by rms on 2/1/14.
 */
public class ExampleTest extends InstrumentationTestCase {
    public void testExample() throws Exception {
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}
