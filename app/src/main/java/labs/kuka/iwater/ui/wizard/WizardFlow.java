package labs.kuka.iwater.ui.wizard;

import android.app.Activity;

import java.util.Map;
import java.util.TreeMap;

import labs.kuka.iwater.R;

/**
 * Created by Jorge on 7/11/15.
 */
public enum WizardFlow {

    WATER_BOTTLE(R.layout.fragment_page_bottle_water, 0),
    BOY_DRINKING(R.layout.fragment_page_boy_drinking, 2),
    DRINKABLE_WATER(R.layout.fragment_page_drinkable_water, 1);

    private int layoutId;
    private int pagePosition;
    private WizardFlowPage wizardFlowPage;
    private static Map<Integer, WizardFlow> flows;

    static{
        flows = new TreeMap<Integer, WizardFlow>();
        flows.put(WATER_BOTTLE.pagePosition, WATER_BOTTLE);
        flows.put(BOY_DRINKING.pagePosition, BOY_DRINKING);
        flows.put(DRINKABLE_WATER.pagePosition, DRINKABLE_WATER);
    }

    private WizardFlow(int layoutId, int pagePosition){
        this.layoutId = layoutId;
        this.pagePosition = pagePosition;
    }

    public static WizardFlowPage getWizardFlowPage(Activity activity, int pagePosition){
        return new WizardFlowFactory(activity).getWizardFlow(pagePosition);
    }

    public static WizardFlow getWizardFlowByPageNumber(int pageNumber){
        return flows.get(pageNumber);
    }

    public Integer getLayoutId(){
        return layoutId;
    }
}
