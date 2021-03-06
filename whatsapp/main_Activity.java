package com.domain.whatsapp;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity  {  //implements Chats.FragmentChatListener, Status.FragmentStatusListener
        TabLayout tabLayout;
        ViewPager viewPager;
        pageAdapter pageAdapter;
        TabItem tabChats,tabStatus,tabCalls;

        private DrawerLayout drawer;



//    private Chats fragmentA;
//    private Status fragmentB;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            drawer = findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();


            tabLayout = findViewById(R.id.tabLayout);
            tabChats = findViewById(R.id.tabChats);
            tabStatus = findViewById(R.id.tabStatus);
            tabCalls = findViewById(R.id.tabCalls);
            viewPager = findViewById(R.id.viewPager);

            pageAdapter = new pageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
            viewPager.setAdapter(pageAdapter);



            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

//            fragmentA = new Chats();
//            fragmentB = new Status();
//
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container_a,fragmentA)
//                    .replace(R.id.container_b,fragmentB)
//                    .commit();
        }

//    @Override
//    public void onInputASent(CharSequence input) {
//        fragmentB.updateEditText(input);
//    }
//
//    @Override
//    public void onInputBSent(CharSequence input) {
//        fragmentA.updateEditText(input);
//    }


}
