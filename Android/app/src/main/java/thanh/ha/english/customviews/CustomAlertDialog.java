package thanh.ha.english.customviews;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import thanh.ha.english.R;


/**
 * Created by HaVan on 6/1/2017.
 */

public class CustomAlertDialog{
    public void showAlertDialog(Activity activity, String title, String message) {

        final Dialog alertDialog = new Dialog(activity);
        alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        alertDialog.setCancelable(false);
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.setContentView(R.layout.view_alert_dialog);

        TextView tvTitle = (TextView) alertDialog.findViewById(R.id.tv_title);
        tvTitle.setText(title);

        TextView tvContent = (TextView) alertDialog.findViewById(R.id.tv_content);
        tvContent.setText(message);

        TextView tvCancel = (TextView) alertDialog.findViewById(R.id.btn_ok_dialog);
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });

        alertDialog.show();


    }
}
