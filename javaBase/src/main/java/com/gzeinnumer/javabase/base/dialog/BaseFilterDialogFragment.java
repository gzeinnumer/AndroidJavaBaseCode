package com.gzeinnumer.javabase.base.dialog;

import android.view.Gravity;

import com.gzeinnumer.javabase.R;
import com.gzeinnumer.javabase.base.BaseDialogFragment;

public class BaseFilterDialogFragment extends BaseDialogFragment {
    public BaseFilterDialogFragment() {
        super();
    }

    public BaseFilterDialogFragment(int style) {
        super(R.style.CustomDialogStyleFilter);
    }

    @Override
    public void onStart() {
        super.onStart();
        setGravity(Gravity.BOTTOM);
        setCanvasWidth(0.95);
    }
}
