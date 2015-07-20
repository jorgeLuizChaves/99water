package labs.kuka.iwater.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import labs.kuka.iwater.ui.wizard.WizardFlow;
import labs.kuka.iwater.ui.wizard.WizardFragment;

/**
 * Created by Jorge on 7/13/15.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        final WizardFragment wizardFragment = new WizardFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(WizardFragment.PAGE_POSITION, position);
        wizardFragment.setArguments(bundle);
        return wizardFragment;
    }

    @Override
    public int getCount() {
        return WizardFlow.values().length;
    }

}
