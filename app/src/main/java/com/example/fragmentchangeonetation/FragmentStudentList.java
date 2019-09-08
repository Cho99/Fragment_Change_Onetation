package com.example.fragmentchangeonetation;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {

    ArrayList<Student> studentArrayList;
    StudentAdapter adapter;
    TruyenSinhVien truyenSinhVien;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        truyenSinhVien = (TruyenSinhVien) getActivity();

        studentArrayList = new ArrayList<>();
        AddArray();
        adapter = new StudentAdapter(getActivity(), R.layout.row_student, studentArrayList);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_ds_sv, container, false);
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenSinhVien.DataStudent(studentArrayList.get(position));
    }

    private void AddArray() {
        studentArrayList.add(new Student("Nguyen van A", 1999, "Ha Noi", "A@gmail.com"));
        studentArrayList.add(new Student("Nguyen van B", 2000, "Ha Noi", "A@gmail.com"));
        studentArrayList.add(new Student("Nguyen van C", 1997, "Ha Noi", "A@gmail.com"));
        studentArrayList.add(new Student("Nguyen van D", 1995, "Ha Noi", "A@gmail.com"));
   }
}
