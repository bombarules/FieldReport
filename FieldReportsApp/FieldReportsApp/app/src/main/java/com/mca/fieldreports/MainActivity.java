package com.mca.fieldreports;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Opens the Field Reports page in whichever browser the person has set as their
 * default (Chrome, Samsung Internet, Edge, Firefox...). To pick a different browser,
 * change the default browser in Android Settings > Apps > Default apps.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri uri = Uri.parse(getString(R.string.app_url));
        Intent open = new Intent(Intent.ACTION_VIEW, uri);
        open.addCategory(Intent.CATEGORY_BROWSABLE);
        try {
            startActivity(open);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_browser, Toast.LENGTH_LONG).show();
        }
        finish();
    }
}
