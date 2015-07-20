package labs.kuka.iwater;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Jorge on 7/15/15.
 */
public class NavigationDrawerFragment extends Fragment {

    private ListView mDrawerListView;
    private int mCurrentSelectedPosition;

    public static final String TYPE_NORMAL = "Normal MapView";
    public static final String TYPE_SATELLITE = "Satellite MapView";
    public static final String TYPE_TERRAIN = "Terrain MapView";
    public static final String TYPE_HYBRID = "Hybrid MapView";
    public static final String TYPE_NORMAL_MARKEROPTIONS = "MapView with Markers";
    public static final String TYPE_NORMAL_ROUTES = "MapView with routes marked";
    public static final String TYPE_NORMAL_CIRCLE = "MapView with circle";
    public static final String TYPE_NORMAL_VIEW_MOVE = "MapView Movement Animation";

    public static final String[] MAP_VIEWS = { TYPE_NORMAL, TYPE_SATELLITE, TYPE_TERRAIN,
            TYPE_HYBRID, TYPE_NORMAL_MARKEROPTIONS, TYPE_NORMAL_ROUTES,
            TYPE_NORMAL_CIRCLE, TYPE_NORMAL_VIEW_MOVE };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
