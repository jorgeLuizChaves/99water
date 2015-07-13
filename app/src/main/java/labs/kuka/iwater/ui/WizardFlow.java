package labs.kuka.iwater.ui;

import labs.kuka.iwater.R;

/**
 * Created by Jorge on 7/11/15.
 */
public enum WizardFlow {

    BOY_DRINKING(R.layout.fragment_page_boy_drinking),
    WATER_BOTTLE(R.layout.fragment_page_bottle_water),
    DRINKABLE_WATER(R.layout.fragment_page_drinkable_water);

    private int layoutId;

    private WizardFlow(int layoutId){
        this.layoutId = layoutId;
    }

}
