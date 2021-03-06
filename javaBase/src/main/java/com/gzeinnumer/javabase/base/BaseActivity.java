package com.gzeinnumer.javabase.base;

import static com.gzeinnumer.javabase.utils.GblFunction.isDebugActive;
import static maes.tech.intentanim.CustomIntent.customType;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.gzeinnumer.da.dialog.confirmDialog.ConfirmDialog;
import com.gzeinnumer.da.dialog.datePickerDialog.multi.MultiDatePickerDialog;
import com.gzeinnumer.da.dialog.datePickerDialog.single.SingleDatePickerDialog;
import com.gzeinnumer.da.dialog.debug.DebugDialog;
import com.gzeinnumer.da.dialog.infoDialog.InfoDialog;
import com.gzeinnumer.da.dialog.loadingDialog.LoadingDialog;
import com.gzeinnumer.javabase.R;
import com.gzeinnumer.javabase.base.activity.BasePermissionActivity;
import com.gzeinnumer.javabase.base.dialog.BasePopUp;
import com.gzeinnumer.javabase.base.interfaceMethod.IBaseActivity;
import com.gzeinnumer.javabase.utils.GblFunction;

public class BaseActivity extends BasePermissionActivity implements IBaseActivity {

    private LoadingDialog loadingDialog;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            customType(this, BaseConstant.INTENT_ANIM_TYPE);
        }
    }

    @Override
    public void debugLocationActivity(View v, String TAG) {
        v.setOnClickListener(view -> {
            GblFunction.debugLocationActivity(getApplicationContext(), TAG);
        });
    }

    @Override
    public void debugDialog(String smg) {
        if (isDebugActive())
            new DebugDialog(getSupportFragmentManager())
                    .setAnimationStyle(R.style.CustomDialogStyle)
                    .setContent(smg)
                    .onOkPressedCallBack(() -> {
                        //ok action
                    })
                    .show();
    }

    @Override
    public void intentTo(Class<?> clss) {
        startActivity(new Intent(getApplicationContext(), clss));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            customType(this, BaseConstant.INTENT_ANIM_TYPE);
        }
    }

    @Override
    public void intentToPut(Intent intent) {
        startActivity(intent);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            customType(this, BaseConstant.INTENT_ANIM_TYPE);
        }
    }

    @Override
    public void onToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onToastLong(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onToastLongCenter(String msg) {
        BasePopUp.onToastLongCenter(getApplicationContext(), msg);
    }

    @Override
    public void onShowCustomToast(String msg) {
        BasePopUp.onShowCustomToast(this, getApplicationContext(), msg);
    }

    @Override
    public void onShowCustomToastTop(String msg) {
        BasePopUp.onShowCustomToastTop(this, getApplicationContext(), msg);
    }

    @Override
    public void onShowLoading() {
        loadingDialog = BasePopUp.onShowLoading(getSupportFragmentManager(), this);
        loadingDialog.show();
    }

    @Override
    public void onHideLoading() {
        if (loadingDialog != null) {
            loadingDialog.dismis();
        }
    }

    @Override
    public ConfirmDialog onShowConfirmDialog() {
        return BasePopUp.onShowConfirmDialog(getSupportFragmentManager(), this);
    }

    @Override
    public InfoDialog onShowInfoDialog() {
        return BasePopUp.onShowInfoDialog(getSupportFragmentManager(), this);
    }

    @Override
    public SingleDatePickerDialog datePickerSingle() {
        return BasePopUp.datePickerSingle(getSupportFragmentManager(), this);
    }

    @Override
    public MultiDatePickerDialog datePickerMulti() {
        return BasePopUp.datePickerMulti(getSupportFragmentManager(), this);
    }

    @Override
    public void enableEditText(EditText... editTexts) {
        for (EditText ed : editTexts) {
            ed.setFocusableInTouchMode(true);
            ed.setFocusable(true);
            ed.setEnabled(true);
        }
    }

    @Override
    public void disableEditText(EditText... editTexts) {
        for (EditText ed : editTexts) {
            ed.setFocusableInTouchMode(false);
            ed.setFocusable(false);
            ed.setEnabled(false);
        }
    }

    @Override
    public void onShowView(View view) {
        view.setVisibility(View.VISIBLE);
    }

    @Override
    public void onHideView(View view) {
        view.setVisibility(View.GONE);
    }

    @Override
    public void emptyState(int size, RecyclerView rv, View imgEmpty) {
        rv.setVisibility(View.GONE);
        imgEmpty.setVisibility(View.GONE);

        rv.setVisibility(size==0 ? View.GONE : View.VISIBLE);
        imgEmpty.setVisibility(size==0 ? View.VISIBLE : View.GONE);
    }

    @Override
    public void swipe(SwipeRefreshLayout swipeRefreshLayout, boolean swipe){
        swipeRefreshLayout.setRefreshing(swipe);
    }

    @Override
    public String xmlString(int idString) {
        return getResources().getString(idString);
    }

    @Override
    public int xmlColor(int idColor) {
        return ContextCompat.getColor(getApplicationContext(), idColor);
    }

    protected void onShowCustomToastDummy(){
        onShowCustomToast("message");
    }

    @Override
    public void onShowInfoDialogError(String title, String message) {
        BasePopUp.onShowInfoDialog(getSupportFragmentManager(), this).autoDismisOnSecond(-1).setTitle(title).setContent(message).show();
    }

    @Override
    public void fabDebug(LinearLayout llFab, String... tables) {

    }
}
