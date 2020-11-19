package com.tutorials.movies_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import com.tutorials.movies_app.databinding.MainFragmentBinding;

public class MainFragment extends Fragment {
    MainFragmentBinding mainFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainFragmentBinding = MainFragmentBinding.inflate(inflater, container, false);
        mainFragmentBinding.rvMovies.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mainFragmentBinding.rvMovies.setAdapter(new RecyclerAdapter(getActivity()));
        return mainFragmentBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mainFragmentBinding = null;
    }
}
