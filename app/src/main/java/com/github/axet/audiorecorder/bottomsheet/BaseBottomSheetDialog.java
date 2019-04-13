package com.github.axet.audiorecorder.bottomsheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.axet.audiorecorder.R;


public abstract class BaseBottomSheetDialog extends BottomSheetDialogFragment {
    private Button btnAction;
    private ImageView iconHeader, iconClose;
    private TextView tvHeaderTitle;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanseState) {
        View container = inflater.inflate(R.layout.bottom_sheet_base_container, null);
        View body = provideBodyView(inflater, parent, savedInstanseState);
        ((FrameLayout) container.findViewById(R.id.container_body)).addView(body);

        iconHeader = (ImageView) container.findViewById(R.id.icon);
        tvHeaderTitle = (TextView) container.findViewById(R.id.title);
        btnAction = (Button) container.findViewById(R.id.btn_action);
        iconClose = (ImageView) container.findViewById(R.id.icon_close);

        iconClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActionButtonClicked();
            }
        });

        return container;
    }

    public abstract View provideBodyView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState);

    public abstract void onActionButtonClicked();

    public void setData(int headerIcon, String headerTitle, String actionButtonText) {
        iconHeader.setImageResource(headerIcon);
        tvHeaderTitle.setText(headerTitle);
        btnAction.setText(actionButtonText);
    }

    /*
     * Making the bottom sheet expanded completely on launch
     * */
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);

        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                BottomSheetDialog d = (BottomSheetDialog) dialog;
                FrameLayout bottomSheet = (FrameLayout) d.findViewById(R.id.design_bottom_sheet);
                BottomSheetBehavior.from(bottomSheet).setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
        return dialog;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        onActivityResultReceived(requestCode, resultCode, data);
    }

    public abstract Void onActivityResultReceived(int requestCode, int resultCode, Intent data);
}
