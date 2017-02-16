package me.lionelfaber.smileappofflinenew;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
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
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView)findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.smile).into(img);

        ImageButton sub = (ImageButton) findViewById(R.id.imageButton1);
        Glide.with(this).load(R.drawable.library).into(sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Subjects.class);
                startActivity(intent);
            }
        });
        ImageButton tt = (ImageButton)findViewById(R.id.imageButton3);
        Glide.with(this).load(R.drawable.notebook).into(tt);

        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimeTable.class);
                startActivity(intent);
            }
        });

        ImageButton info = (ImageButton)findViewById(R.id.imageButton2);
        Glide.with(this).load(R.drawable.lecture).into(info);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Info.class);
                startActivity(intent);
            }
        });

        ImageButton pls = (ImageButton)findViewById(R.id.imageButton4);
        Glide.with(this).load(R.drawable.brainstorm).into(pls);
        pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Placement.class);
                startActivity(intent);
            }
        });
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        final DrawerLayout mDrawerLayout = (DrawerLayout) this.findViewById(R.id.drawer_layout);
        ImageButton fab = (ImageButton) findViewById(R.id.imgb);
        Glide.with(this).load(R.drawable.arrow).into(fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        TextView tx = (TextView)findViewById(R.id.textView);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/special.ttf");

        tx.setTypeface(custom_font);
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

            Intent intent = new Intent(MainActivity.this, Subjects.class);
            startActivity(intent);

        } else if (id == R.id.nav_announce) {
            Intent intent = new Intent(MainActivity.this,Info.class);
            startActivity(intent);

        } else if (id == R.id.nav_tt) {
            Intent intent = new Intent(MainActivity.this, TimeTable.class);
            startActivity(intent);

        } else if (id == R.id.nav_pls) {
            Intent intent = new Intent(MainActivity.this, Placement.class);
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
