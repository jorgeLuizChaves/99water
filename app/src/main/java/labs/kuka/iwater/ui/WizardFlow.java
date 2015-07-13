package labs.kuka.iwater.ui;

import android.app.Activity;

import labs.kuka.iwater.R;

/**
 * Created by Jorge on 7/11/15.
 */
public enum WizardFlow {

    WATER_BOTTLE(R.layout.fragment_page_bottle_water, 0),
    BOY_DRINKING(R.layout.fragment_page_boy_drinking, 1),
    DRINKABLE_WATER(R.layout.fragment_page_drinkable_water, 2);

    private int layoutId;
    private int pagePosition;
    private WizardFlowPage wizardFlowPage;

    private WizardFlow(int layoutId, int pagePosition){
        this.layoutId = layoutId;
        this.pagePosition = pagePosition;
    }

    public static WizardFlowPage getWizardFlowPage(Activity activity, int pagePosition){
        return new WizardFlowFactory(activity).getWizardFlow(pagePosition);
    }
}
