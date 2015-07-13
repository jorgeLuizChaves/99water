package labs.kuka.iwater.ui;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/**
 * Created by Jorge on 7/13/15.
 */
public class UpdateIndicatorUI {

    private int resizeValue;
    private int defaultValue;
    private Activity activity;
    private DisplayMetrics metrics;

    public UpdateIndicatorUI(Activity activity){
        this.activity = activity;
        metrics = activity.getResources().getDisplayMetrics();
        resizeValue =  (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 25, metrics);
        defaultValue = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15, metrics);
    }

    public void update(View targetView, View ... defaultViews){
        targetView.getLayoutParams().height = resizeValue;
        targetView.getLayoutParams().width = resizeValue;
        targetView.requestLayout();

        for(View view : defaultViews){
            view.getLayoutParams().height = defaultValue;
            view.getLayoutParams().width = defaultValue;
            view.requestLayout();
        }
    }

    public void updateAllToDefaultValue(View ... views){
        for(View view : views){
            view.getLayoutParams().height = defaultValue;
            view.getLayoutParams().width = defaultValue;
            view.requestLayout();
        }
    }
}
