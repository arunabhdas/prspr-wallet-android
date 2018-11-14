package com.rndflo.mobile.android.gophrit.views.lato;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.rndflo.mobile.android.gophrit.utils.Constants;
import com.rndflo.mobile.android.gophrit.utils.FontHelper;


/**
 * Created by das on 01/09/16.
 */

public class LatoNormalTextView extends TextView {

    public LatoNormalTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setType(context);
    }

    public LatoNormalTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setType(context);
    }

    public LatoNormalTextView(Context context) {
        super(context);
        setType(context);
    }

    private void setType(Context context){
        this.setTypeface(FontHelper.createTypeface(context, Constants.LATO_REGULAR_FONT_FILE));
        setIncludeFontPadding(false);
    }
}
