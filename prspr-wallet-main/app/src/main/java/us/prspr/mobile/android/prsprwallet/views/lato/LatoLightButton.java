package com.rndflo.mobile.android.gophrit.views.lato;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.rndflo.mobile.android.gophrit.utils.Constants;
import com.rndflo.mobile.android.gophrit.utils.FontHelper;


/**
 * Created by das on 01/09/16.
 */

public class LatoLightButton extends AppCompatButton {


    public LatoLightButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setType(context);
    }

    public LatoLightButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setType(context);
    }

    public LatoLightButton(Context context) {
        super(context);
        setType(context);
    }

    private void setType(Context context){
        this.setTypeface(FontHelper.createTypeface(context, Constants.LATO_LIGHT_FONT_FILE));
        setIncludeFontPadding(true);
    }
}
