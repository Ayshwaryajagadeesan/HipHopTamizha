package com.example.jagadeesan.hiphoptamizha;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;



public class Albumtrial extends Fragment {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;
    public Albumtrial() {
}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_albumtrial, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(view.getContext(), albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(view.getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();


        return view;
    }
    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.meesayamuruku,
                R.drawable.hiphoptamizhancover,
                R.drawable.takarutakaru,
                R.drawable.internationaltamizhan,
                R.drawable.thanioruvan,
                R.drawable.kavan,
                R.drawable.aambalaposter,
                R.drawable.aranmanai,
                R.drawable.indrunetrunaalai,
                R.drawable.kathakali,
                R.drawable.dhruvadhruva,
                R.drawable.kathisandaisong
        };

        Album a = new Album("Meesaya Murukku", 7, covers[0]);
        albumList.add(a);
        a = new Album("Hip Hop Tamizhan", 11, covers[1]);
        albumList.add(a);
        a = new Album("Non Album Singles",9, covers[2]);
        albumList.add(a);
        a = new Album("International Tamizhan",1, covers[3]);
        albumList.add(a);
        a = new Album("Thani Oruvan", 5, covers[4]);
        albumList.add(a);

        a = new Album("Kavan", 5, covers[5]);
        albumList.add(a);

        a = new Album("Aambala", 6, covers[6]);
        albumList.add(a);

        a = new Album("Aranmanai 2", 6, covers[7]);
        albumList.add(a);

        a = new Album("Indru Netru Nalai", 5, covers[8]);
        albumList.add(a);

        a = new Album("kathakali", 4, covers[9]);
        albumList.add(a);

        a = new Album("Dhruva", 5, covers[10]);
        albumList.add(a);

        a = new Album("Kathi Sandai", 5, covers[11]);
        albumList.add(a);
        adapter.notifyDataSetChanged();
    }
    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}