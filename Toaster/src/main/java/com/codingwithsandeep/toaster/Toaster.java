package com.codingwithsandeep.toaster;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class Toaster {

    public static void simpleToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void customToast(Context context, String message) {

        Toast toast = new Toast(context);
        @SuppressLint("InflateParams") View view = LayoutInflater.from(context)
                .inflate(R.layout.custom_toast_layout, null);

        //TextView tvMessage = view.findViewById(R.id.tvToastMessage);
        //tvMessage.setText(message);

        toast.setView(view);
        toast.show();

    }
}
