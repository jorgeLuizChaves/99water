package labs.kuka.iwater.ui;

import android.app.Activity;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Jorge on 7/13/15.
 */
public class WizardFlowFactory {

    private Activity activity;
    private Map<Integer, WizardFlowPage> pages;

    public WizardFlowFactory(Activity activity){
        this.activity = activity;
        configureMaps(activity);
    }

    private void configureMaps(Activity activity) {
        pages = new TreeMap<Integer, WizardFlowPage>();
        pages.put(WizardFlowPage.FIRST, new WizardFlowFirstPage(activity));
        pages.put(WizardFlowPage.SECOND, new WizardFlowSecondPage(activity));
        pages.put(WizardFlowPage.THIRD, new WizardFlowThirdPage(activity));
    }

    public WizardFlowPage getWizardFlow(int position){
        final WizardFlowPage wizardFlowPage = pages.get(position);
        return wizardFlowPage;
    }
}
