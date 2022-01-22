package com.example.jagadeesan.hiphoptamizha;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.etiya.etiyabadgetablib.EtiyaBadgeTab;

import java.util.ArrayList;
import java.util.List;

public class all extends Fragment {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;
    private RecyclerView shoeRecyclerView;
    private List<Shoe> shoes = new ArrayList<>();
    private ActionBar actionBar;
    private AppBarLayout appBarLayout;
    private Button btn;
   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all, container, false);
        shoeRecyclerView = (RecyclerView) view.findViewById(R.id.shoe_recycler_view);
         EtiyaBadgeTab etiyaBadgeTab = (EtiyaBadgeTab) getActivity().findViewById(R.id.etiyaBadgeTabs);
        etiyaBadgeTab.selectEtiyaBadgeTab(3)
                .tabBadgeCount(Home.finalquantity)
                .createEtiyaBadgeTab();
        shoes= ShoppingCartHelper.getCatalog(getResources());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        RecyclerView.Adapter adapter = new ShoeAdapter(view.getContext(), shoes);

        shoeRecyclerView.setLayoutManager(layoutManager);
        shoeRecyclerView.setAdapter(adapter);
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        if (ShopNow.allowRefresh)
        {
            ShopNow.allowRefresh = false;

            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }

}
