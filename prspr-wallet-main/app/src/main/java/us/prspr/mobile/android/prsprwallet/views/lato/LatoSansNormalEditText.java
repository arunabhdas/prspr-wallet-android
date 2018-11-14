package com.rndflo.mobile.android.gophrit.views.lato;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.rndflo.mobile.android.gophrit.utils.Constants;
import com.rndflo.mobile.android.gophrit.utils.FontHelper;


/**
 * Created by xiaolin on 06/09/16.
 */

public class LatoSansNormalEditText extends EditText {
    public LatoSansNormalEditText(Context context) {
        this(context, null);
    }

    public LatoSansNormalEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LatoSansNormalEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontHelper.createTypeface(context, Constants.LATO_REGULAR_FONT_FILE));
    }
}
