package labs.kuka.iwater.ui.wizard;

import android.app.Activity;

/**
 * Created by Jorge on 7/13/15.
 */
public class WizardFlowThirdPage extends WizardFlowPage {
    public WizardFlowThirdPage(Activity activity) {
        super(activity);
    }

    @Override
    public int getTargetPosition() {
        return THIRD;
    }
}
