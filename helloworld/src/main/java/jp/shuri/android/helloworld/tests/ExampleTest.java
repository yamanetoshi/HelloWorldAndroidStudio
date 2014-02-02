package jp.shuri.android.helloworld.tests;

import android.app.Activity;
import android.app.Instrumentation;
import android.test.InstrumentationTestCase;
import android.widget.TextView;

import jp.shuri.android.helloworld.MainActivity;
import jp.shuri.android.helloworld.R;

/**
 * Created by rms on 2/1/14.
 */
public class ExampleTest extends InstrumentationTestCase {

    private MainActivity mCurrentActivity;
    Instrumentation mInstrumentation;
    private Instrumentation.ActivityMonitor mMonitor;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mInstrumentation = getInstrumentation();
        mMonitor = mInstrumentation.addMonitor(MainActivity.class.getName(), null, false);
        mCurrentActivity = (MainActivity)mInstrumentation.waitForMonitorWithTimeout(mMonitor, 5);
    }

    public void testExample() throws Exception {
        TextView textView = (TextView)mCurrentActivity.findViewById(R.id.hello_world);
        assertEquals("Hello World!", textView.getText().toString());
    }
}
