package com.example.fragmentchangeonetation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TruyenSinhVien {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataStudent(Student student) {
        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo) getSupportFragmentManager().findFragmentById(R.id.fragmentInfo);

        Configuration configuration = getResources().getConfiguration();

        if (fragmentStudentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentStudentInfo.SetInfo(student);
        }else {
            Intent intent = new Intent(MainActivity.this, StudentInfromation.class);
            intent.putExtra("ThongTinSV", student);
            startActivity(intent);
        }

    }
}
