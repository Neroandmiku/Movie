package com.example.neroandmiku;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav_Mamiferos2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav_Mamiferos2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nav_Mamiferos2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav_Mamiferos2.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_Mamiferos2 newInstance(String param1, String param2) {
        nav_Mamiferos2 fragment = new nav_Mamiferos2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    ImageView img1, img2, img4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav__mamiferos2, container, false);

        img1 = view.findViewById(R.id.leon);
        img2 = view.findViewById(R.id.teveo);
        img4 = view.findViewById(R.id.mortalkombat);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Navigation.findNavController(v).navigate(R.id.leon); }
        });
        return view;
    }
}