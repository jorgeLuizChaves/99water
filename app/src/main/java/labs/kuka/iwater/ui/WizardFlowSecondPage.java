package labs.kuka.iwater.ui;

import android.app.Activity;
import android.view.View;

/**
 * Created by Jorge on 7/13/15.
 */
public class WizardFlowSecondPage extends WizardFlowPage {

    public WizardFlowSecondPage(Activity activity) {
        super(activity);
    }

    @Override
    public int getTargetPosition() {
        return SECOND;
    }
}
