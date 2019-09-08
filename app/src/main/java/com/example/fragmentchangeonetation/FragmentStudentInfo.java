package com.example.fragmentchangeonetation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentStudentInfo extends Fragment {

    TextView txtTen, txtNamSinh, txtDiaChi, txtEmail;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info, container, false);

        AnhXa();

        return view;
    }

    public void SetInfo(Student student) {
        txtTen.setText(student.getHoten());
        txtNamSinh.setText("Năm sinh: "+student.getNamSinh());
        txtDiaChi.setText("Địa Chỉ: " + student.getDiaChi());
        txtEmail.setText("Email: " + student.getEmail());
    }

    private void AnhXa() {
        txtTen     = (TextView) view.findViewById(R.id.textviewName);
        txtNamSinh = (TextView) view.findViewById(R.id.textviewNamSinh);
        txtDiaChi  = (TextView) view.findViewById(R.id.textviewDiaChi);
        txtEmail   = (TextView) view.findViewById(R.id.textviewEmail);
    }
}
