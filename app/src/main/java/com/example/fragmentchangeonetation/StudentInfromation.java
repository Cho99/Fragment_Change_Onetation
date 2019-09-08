package com.example.fragmentchangeonetation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StudentInfromation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infromation);

        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("ThongTinSV");

        FragmentStudentInfo studentInfo = (FragmentStudentInfo) getSupportFragmentManager().findFragmentById(R.id.fragmentChiTiet);
        studentInfo.SetInfo(student);

    }
}
