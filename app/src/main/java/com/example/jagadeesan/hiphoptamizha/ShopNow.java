package com.example.jagadeesan.hiphoptamizha;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.support.v7.app.ActionBar;
import com.etiya.etiyabadgetablib.EtiyaBadgeTab;
import java.util.ArrayList;
import java.util.List;

public class ShopNow extends Fragment {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;
    private RecyclerView shoeRecyclerView;
    private List<Shoe> shoes = new ArrayList<>();
    private ActionBar actionBar;
    private AppBarLayout appBarLayout;
    private Button btn;
    Context context;
    private EtiyaBadgeTab etiyaBadgeTab;
    public static boolean allowRefresh=false;
    public static int count=0;
  //  public static int finalquantity = 0;
    private int[] tabIcons = {
            R.drawable.shop,

    };
    public ShopNow() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop_now, container, false);
        appBarLayout = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        setOnOffsetChangedListener();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) actionBar.setTitle("");
        ViewPager viewPager = (ViewPager)view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        etiyaBadgeTab = (EtiyaBadgeTab)view.findViewById(R.id.etiyaBadgeTabs);
        etiyaBadgeTab.setupWithViewPager(viewPager);
        setupTabIcons();
        return view;
    }
    private void setupTabIcons() {
        etiyaBadgeTab.setSelectedTabIndicatorColor(getResources().getColor(R.color.white));
        etiyaBadgeTab.setSelectedTabIndicatorHeight(5);
        etiyaBadgeTab.setTabMode(TabLayout.MODE_SCROLLABLE);
        etiyaBadgeTab.setTabGravity(TabLayout.GRAVITY_CENTER);
        etiyaBadgeTab.setBackgroundColor(getResources().getColor(R.color.white));
        etiyaBadgeTab.selectEtiyaBadgeTab(0)
                .tabTitle("All")
                .tabTitleColor(R.color.black)
                .tabIconToTitle(1)
                .tabIconDirection("LEFT")
                .tabBadge(false)
                .createEtiyaBadgeTab();
        etiyaBadgeTab.selectEtiyaBadgeTab(1)
                .tabTitle("T-shirt")
                .tabTitleColor(R.color.black)
                .tabIconDirection("LEFT")
                .tabBadge(false)
                .createEtiyaBadgeTab();
        etiyaBadgeTab.selectEtiyaBadgeTab(2)
                .tabTitle("Phone-Cover")
                .tabTitleColor(R.color.black)
                .tabIconDirection("LEFT")
                .tabBadge(false)
                .createEtiyaBadgeTab();
        etiyaBadgeTab.selectEtiyaBadgeTab(3)
                .tabIcon(tabIcons[0])
                .tabBadge(true)
                .tabBadgeBgColor(R.color.red)
                .tabBadgeCornerRadius(10)
                .tabBadgeStroke(3, R.color.white)
                .tabBadgeCount(Home.finalquantity)
                .createEtiyaBadgeTab();
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager());
        adapter.addFrag(new all(), "all");
        adapter.addFrag(new Tshirt(), "T-Shirt");
        adapter.addFrag(new phonecover(), "Phone Cover");
        adapter.addFrag(new Cart(), "");
        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();
        ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }
        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private void setOnOffsetChangedListener() {

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {

            boolean isDisplayed = false;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                int totalScroll = appBarLayout.getTotalScrollRange();

                if (totalScroll + verticalOffset == 0) {
                    if (actionBar != null){
                    }
                    isDisplayed = true;
                } else if (isDisplayed) {
                    if (actionBar != null)
                        actionBar.setTitle("");
                    isDisplayed = false;
                }
            }

        });

    }
}