package com.rndflo.mobile.android.gophrit.views.lato;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.rndflo.mobile.android.gophrit.utils.Constants;
import com.rndflo.mobile.android.gophrit.utils.FontHelper;


/**
 * Created by das on 01/09/16.
 */

public class LatoBoldTextView extends TextView {


    public LatoBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setType(context);
    }

    public LatoBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setType(context);
    }

    public LatoBoldTextView(Context context) {
        super(context);
        setType(context);
    }

    private void setType(Context context){
        this.setTypeface(FontHelper.createTypeface(context, Constants.LATO_BOLD_FONT_FILE));
        setIncludeFontPadding(false);
    }
}
