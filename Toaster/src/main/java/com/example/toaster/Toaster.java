package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void SimpleToast(Context context,String toast){

        Toast.makeText(context,toast, Toast.LENGTH_SHORT).show();
    }
}
