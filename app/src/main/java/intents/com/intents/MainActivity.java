package intents.com.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    int request_Code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickWebBrowser(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.kz"));
        startActivity(Intent.createChooser(i, "Open URL using..."));
    }

    public void onClickMakeCalls(View v)
    {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+77012427339"));
        startActivity(i);
    }

    public void onClickShowMap(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.827500, -122.481670"));
        startActivity(i);
    }

    public void onClickLaunchMyBrowser(View v)
    {
        Intent i = new Intent("intents.com.intents.MyBrowser");
        i.setData(Uri.parse("http://www.google.kz"));
        startActivity(i);
    }
}
