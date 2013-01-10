package com.vpm.golfjoust.activities;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.viewpagerindicator.IconPagerAdapter;
import com.viewpagerindicator.TabPageIndicator;
import com.viewpagerindicator.TitlePageIndicator;
import com.vpm.golfjoust.R;
import com.vpm.golfjoust.fragments.CourseTabFragment;



public class MainActivity extends SherlockFragmentActivity {

	//for later use in viewpager
	CoursePagerAdapter mCoursePagerAdapter;
    ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
		setContentView(R.layout.activity_main);
		
	   
		//make viewpager to switch b/w course views
		mViewPager = (ViewPager) findViewById(R.id.main_pager);
		//call with CHILD fragment manager... because fragmentception
	    mCoursePagerAdapter = new CoursePagerAdapter(getSupportFragmentManager());
	    mViewPager.setAdapter(mCoursePagerAdapter);
	    //set position to middle tab (nearby, for the time being)
	    mViewPager.setCurrentItem(1);

	    //Bind the title indicator to the adapter
	    TabPageIndicator tabIndicator = (TabPageIndicator)findViewById(R.id.titles);
	    tabIndicator.setViewPager(mViewPager);

	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getSupportMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }


	public static class CoursePagerAdapter extends FragmentPagerAdapter implements IconPagerAdapter{

        public CoursePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public SherlockFragment getItem(int position) {
            switch(position) {
            case 0:
            	return new CourseTabFragment();
			case 1:
            	return new CourseTabFragment();
			case 2:
            	return new CourseTabFragment();
			case 3:
				return new CourseTabFragment();
            default:
            	return null;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
        
        @Override
        public CharSequence getPageTitle(int position) {
            switch(position) {
            case 0:
            	return "SOCIAL";
            case 1:
            	return "DEALS";
            case 2:
            	return "COURSES";
            case 3:
            	return "PROFILE";
            default:
            	return null;
            }
        }

		@Override
		public int getIconResId(int index) {
			switch(index) {
			case 0:
            	return R.drawable.social_group;
            case 1:
            	return R.drawable.collections_labels;
            case 2:
            	return R.drawable.explorebutton;
            case 3:
            	return R.drawable.homebutton;
            default:
            	return 0;
            }
		}

    }
}
