package com.example.modul2_kel27;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import com.example.modul2_kel27.R;

public class DetailActivity extends AppCompatActivity {

    private CircleImageView imgProfile;
    private TextView tvNamaDepan;
    private TextView tvNamaBelakang;
    private TextView tvEmail;
    public static final String EXTRA_ACCOUNT = "extra_account";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgProfile = findViewById(R.id.img_photo_user);
        tvNamaDepan = findViewById(R.id.tv_item_first_name);
        tvNamaBelakang = findViewById(R.id.tv_item_last_name);
        tvEmail = findViewById(R.id.tv_item_email);


        if (getIntent().hasExtra("nameD") && getIntent().hasExtra("nameB") && getIntent().hasExtra("email") && getIntent().hasExtra("Avatar")) {

            String nameD = getIntent().getStringExtra("nameD");
            String nameB = getIntent().getStringExtra("nameB");
            String email = getIntent().getStringExtra("email");
            String Avatar = getIntent().getStringExtra("Avatar");
            tvNamaDepan.setText(nameD);
            tvNamaBelakang.setText(nameB);
            tvEmail.setText("Email: " + email);
            Glide.with(this).load(Avatar).into(imgProfile);

        }
    }

}
