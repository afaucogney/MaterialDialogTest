package fr.millezimu.app.materialdialogtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;

public class MainActivity extends AppCompatActivity {

    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialDialog.Builder dialogBuilder;


//        dialogBuilder = new MaterialDialog.Builder(this)
//                .title("Super Dialog")
//                .content("blananacldcla")
//                .progress(false, 10)
//                .negativeText("NON")
//                .positiveText("OK")
//                .neutralText("RESET")
//                .contentGravity(GravityEnum.CENTER)
//                .cancelable(false)
//                .autoDismiss(false)
//                .onNegative(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//                        materialDialog.dismiss();
//                    }
//                })
//                .onPositive(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//                        if (progress < 10) {
//                            progress++;
//                        }
//                        update(materialDialog);
//                    }
//                })
//                .onNeutral(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//                        progress = 0;
//                        update(materialDialog);
//                    }
//                });
//
//        dialogBuilder.show();


        dialogBuilder = new MaterialDialog.Builder(this)
                .title("Super Dialog")
//                .content("blananacldcla")
                .items(new CharSequence[]{"Category", "family"})
                .inputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)
                .input("Tapez votre aromes", "", new MaterialDialog.InputCallback() {
                    @Override
                    public void onInput(MaterialDialog dialog, CharSequence input) {
                        // Do something
                    }
                })
                .negativeText("NON")
                .positiveText("OK")
                .neutralText("RESET")
                .contentGravity(GravityEnum.CENTER)
                .cancelable(false)
                .autoDismiss(false)
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                        materialDialog.dismiss();
                    }
                })
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {

                    }
                })
                .onNeutral(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {

                    }
                });

        dialogBuilder.show();

    }

    private void update(MaterialDialog dialog){
        ((MaterialDialog) dialog).setProgress(progress);
        if (progress == 10) {
            ((MaterialDialog) dialog).getContentView().setVisibility(View.VISIBLE);
            ((MaterialDialog) dialog).getProgressBar().setVisibility(View.GONE);
        } else {
            ((MaterialDialog) dialog).getContentView().setVisibility(View.GONE);
            ((MaterialDialog) dialog).getProgressBar().setVisibility(View.VISIBLE);
        }
    }

}
