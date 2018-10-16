package com.example.user.bookaholic;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class DrawerActivity extends AppCompatActivity  {

    Toolbar toolbar;
    DrawerLayout drawer;
    ActionBarDrawerToggle  actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close);
        setSupportActionBar(toolbar);
        drawer.setDrawerListener(actionBarDrawerToggle);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container, new HomeFragment());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Home");
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new HomeFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Home");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                    case R.id.db:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new StartNewFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Start New");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                    case R.id.db1:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new FeedBackFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Continue");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                    case R.id.db2:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new ScoreBoardFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Score Board");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                    case R.id.db3:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new InstructionFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Instructions");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                    case R.id.db4:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new ChallengeFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Challenge");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                    case R.id.db5:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new PrizeFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Prizes");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                    case R.id.db6:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new SettingsFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Settings");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                    case R.id.db7:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new AboutFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("About us");
                        item.setChecked(true);
                        drawer.closeDrawers();
                        break;
                }

                return false;
            }
        });
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if( actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}