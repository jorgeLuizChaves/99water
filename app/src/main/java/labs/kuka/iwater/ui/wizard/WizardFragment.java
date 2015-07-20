package labs.kuka.iwater.ui.wizard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import labs.kuka.iwater.ui.wizard.WizardFlow;

/**
 * Created by Jorge on 7/11/15.
 */
public class WizardFragment extends Fragment {

    public static final String PAGE_POSITION = "PAGE_POSITION";

    public WizardFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final Bundle arguments = getArguments();
        final Integer pgPosition = arguments.getInt(PAGE_POSITION);
        final WizardFlow wizardFlowByPageNumber = WizardFlow.getWizardFlowByPageNumber(pgPosition);
        int layout_id = wizardFlowByPageNumber.getLayoutId();
        return inflater.inflate(layout_id, container, false);
    }
}
