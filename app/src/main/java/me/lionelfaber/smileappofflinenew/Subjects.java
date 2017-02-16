package me.lionelfaber.smileappofflinenew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;

import static me.lionelfaber.smileappofflinenew.R.drawable.art;

public class Subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        final DrawerLayout mDrawerLayout = (DrawerLayout) this.findViewById(R.id.drawer_layout);
        ImageButton fab = (ImageButton) findViewById(R.id.imgb);
        Glide.with(this).load(R.drawable.arrow).into(fab);


        ImageButton ai = (ImageButton) findViewById(R.id.imageButtonn1);
        Glide.with(this).load(R.drawable.art).into(ai);
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, AI.class);
                startActivity(intent);
            }
        });

        ImageButton cd = (ImageButton) findViewById(R.id.imageButtonn2);
        Glide.with(this).load(R.drawable.compiler).into(cd);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, CD.class);
                startActivity(intent);
            }
        });

        ImageButton ds = (ImageButton) findViewById(R.id.imageButtonn4);
        Glide.with(this).load(R.drawable.sd).into(ds);
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, DS.class);
                startActivity(intent);
            }
        });

        ImageButton mc = (ImageButton) findViewById(R.id.imageButtonn5);
        Glide.with(this).load(R.drawable.mc).into(mc);
        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, MC.class);
                startActivity(intent);
            }
        });

        ImageButton sa = (ImageButton) findViewById(R.id.imageButtonn3);
        Glide.with(this).load(R.drawable.soft).into(sa);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, SA.class);
                startActivity(intent);
            }
        });

        ImageButton tqm = (ImageButton) findViewById(R.id.imageButtonn6);
        Glide.with(this).load(R.drawable.total).into(tqm);
        tqm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, TQM.class);
                startActivity(intent);
            }
        });

        ImageButton cdl = (ImageButton) findViewById(R.id.imageButtonn7);
        Glide.with(this).load(R.drawable.cdl).into(cdl);
        cdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, CDLab.class);
                startActivity(intent);
            }
        });
        
    }
}
