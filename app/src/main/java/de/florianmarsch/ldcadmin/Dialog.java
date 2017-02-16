package de.florianmarsch.ldcadmin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;

import de.florianmarsch.ldcadmin.anim.FabTransform;

/**
 * Created by Florian on 15.02.2017.
 */

public class Dialog extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        ViewGroup target = (ViewGroup) findViewById(R.id.container);


        Intent intent = getIntent();
        int color =  Color.TRANSPARENT;
        int icon =  R.drawable.ic_add;
        Transition sharedEnter = new FabTransform(color, icon).addTarget(target);


        getWindow().setSharedElementEnterTransition(sharedEnter);


    }

    private void finishSetup() {
    }

    @Override
    public void onBackPressed() {
        dismiss(null);
    }

    public void dismiss(View view) {
        //isDismissing = true;
        setResult(Activity.RESULT_CANCELED);
        finishAfterTransition();
    }

}
