package br.ufc.quixada.dadm.trabalho1;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class Item13Activity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager pgrPager;
    private TabLayout tabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item13);

        initComponents();

    }

    private void initComponents() {
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        pgrPager = findViewById(R.id.pgr_pager);
        pgrPager.setAdapter(mSectionsPagerAdapter);

        tabBar = findViewById(R.id.tab_bar);
        tabBar.setupWithViewPager(pgrPager);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return PlaceholderFragment.newInstance(i + 1);
                case 1:
                    return Tab2Fragment.newInstance(i + 1);
                case 2:
                    return Tab3Fragment.newInstance(i + 1);
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.tab_placeholder_title).toUpperCase();
                case 1:
                    return getString(R.string.tab_2_title).toUpperCase();
                case 2:
                    return getString(R.string.tab_3_title).toUpperCase();
                default:
                    return null;
            }
        }
    }

}
