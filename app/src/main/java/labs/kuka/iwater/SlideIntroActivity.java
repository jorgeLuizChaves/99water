package labs.kuka.iwater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import labs.kuka.iwater.ui.UpdateIndicatorUI;
import labs.kuka.iwater.ui.ViewPagerAdapter;
import labs.kuka.iwater.ui.wizard.WizardFlow;
import labs.kuka.iwater.ui.wizard.WizardFlowPage;

public class SlideIntroActivity extends FragmentActivity {

    private static final int FIRST_PAGE = 0;
    private ViewPager viewPager;
    private View indicator1;
    private View indicator2;
    private View indicator3;
    private TextView txtViewSkip;
    private UpdateIndicatorUI indicatorUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        indicatorUI = new UpdateIndicatorUI(this);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_slide_intro);

        indicator1 = (View) findViewById(R.id.indicator1);
        indicator2 = (View) findViewById(R.id.indicator2);
        indicator3 = (View) findViewById(R.id.indicator3);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new WizardPageChangeListener());
        updateIndicators(FIRST_PAGE);

        txtViewSkip = (TextView) findViewById(R.id.txt_view_skip);

        txtViewSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SlideIntroActivity.this, HomeActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the
            // system to handle the
            // Back button. This calls finish() on this activity and pops the
            // back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class WizardPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            updateIndicators(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

    public void updateIndicators(int position) {
        final WizardFlowPage wizardFlowPage = WizardFlow.getWizardFlowPage(this, position);
        wizardFlowPage.updateViewPages(indicator1, indicator2, indicator3);
    }
}
