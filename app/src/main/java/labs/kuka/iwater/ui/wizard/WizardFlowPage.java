package labs.kuka.iwater.ui.wizard;

import android.app.Activity;
import android.view.View;

import labs.kuka.iwater.ui.UpdateIndicatorUI;

/**
 * Created by Jorge on 7/13/15.
 */
public abstract class WizardFlowPage {

    public static final int FIRST = 0;
    public static final int SECOND = 1;
    public static final int THIRD = 2;

    public WizardFlowPage(Activity activity){
        updateIndicatorUI = new UpdateIndicatorUI(activity);
    }

    private UpdateIndicatorUI updateIndicatorUI;

    public abstract int getTargetPosition();

    public void updateViewPages(View ... views) {
        View targetView = views[getTargetPosition()];
        View[] defaultViews = generateDefaultViews(views);
        updateIndicatorUI.update(targetView, defaultViews);
    }

    private View[] generateDefaultViews(View[] views){
        View[] defaultViews = new View[views.length - 1];
        int contExtern = 0;
        for(int cont = 0; cont <= views.length - 1; cont++){
            if(cont != getTargetPosition()){
                defaultViews[contExtern] = views[cont];
                contExtern++;
            }
        }
        return defaultViews;
    }
}
