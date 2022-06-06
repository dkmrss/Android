package com.el_rangxanh.test_11.monhoc;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.el_rangxanh.test_11.MainActivity;
import com.el_rangxanh.test_11.R;
import com.el_rangxanh.test_11.slide.ScreenSlideActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HoaFragment extends Fragment {

    ExamAdapter examAdapter;
    android.widget.ListView lv_dethi;
    java.util.ArrayList<com.el_rangxanh.test_11.monhoc.Exam> arr_exam = new java.util.ArrayList<com.el_rangxanh.test_11.monhoc.Exam>();
    View view;
    public HoaFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Hoá Học");
       view = inflater.inflate(R.layout.fragment_toan, container, false);
        lv_dethi = view.findViewById(R.id.lvdethi);
        arr_exam.add(new Exam("Làm Bài"));

        examAdapter=new ExamAdapter(getContext(),arr_exam);
        lv_dethi.setAdapter(examAdapter);

        lv_dethi.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), ScreenSlideActivity.class);
                i.putExtra("loaiMon","hoa");
                startActivity(i);
            }
        });
        return view;
    }



}
