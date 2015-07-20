package labs.kuka.iwater.ui.wizard;

import android.app.Activity;

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
