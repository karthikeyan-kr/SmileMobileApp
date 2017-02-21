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

public class Subjects extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        ImageButton madl = (ImageButton) findViewById(R.id.imageButtonn8);
        Glide.with(this).load(R.drawable.madlabb).into(madl);
        madl.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(Subjects.this, MadLab.class);
                                        startActivity(intent);
                                    }
                                });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_subjects) {

            Intent intent = new Intent(Subjects.this, Subjects.class);
            startActivity(intent);

        } else if (id == R.id.nav_announce) {
            Intent intent = new Intent(Subjects.this,Info.class);
            startActivity(intent);

        } else if (id == R.id.nav_tt) {
            Intent intent = new Intent(Subjects.this, TimeTable.class);
            startActivity(intent);

        } else if (id == R.id.nav_pls) {
            Intent intent = new Intent(Subjects.this, Placement.class);
            startActivity(intent);

        }else if (id == R.id.nav_contact) {
            Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "14itsjit@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Report from SMILE App");
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
