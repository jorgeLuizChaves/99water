package labs.kuka.iwater.ui;

import android.app.Activity;
import android.view.View;

/**
 * Created by Jorge on 7/13/15.
 */
public final class WizardFlowFirstPage extends WizardFlowPage {

    public WizardFlowFirstPage(Activity activity) {
        super(activity);
    }

    @Override
    public int getTargetPosition() {
        return FIRST;
    }
}
