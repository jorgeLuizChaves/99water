package labs.kuka.iwater;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jorge on 7/11/15.
 */
public class WizardFragment extends Fragment {

    public static final String PAGE_POSITION = "PAGE_POSITION";

    public WizardFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layout_id = R.layout.fragment_page_1;
        final Bundle arguments = getArguments();
        final Integer pgPosition = arguments.getInt(PAGE_POSITION);
        switch (pgPosition) {
            case 0:
                layout_id = R.layout.fragment_page_1;
                break;

            case 1:
                layout_id = R.layout.fragment_page_2;
                break;

            case 2:
                layout_id = R.layout.fragment_page_3;
                break;
        }
        return inflater.inflate(layout_id, container, false);
    }
}
