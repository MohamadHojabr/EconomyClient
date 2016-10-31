package com.economyportal.economyportalclient.utility;

import android.view.View;

/**
 * Created by mohamad on 10/30/2016.
 */

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
