package com.example.android.pharmegic;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.example.android.myapplication.Music.MusicActivity;
import com.example.android.myapplication.Widget.CanaroTextView;
import com.example.android.pharmegic.Auth.LoginActivity;
import com.example.android.pharmegic.ChatApp.AnonymousChat;
import com.example.android.pharmegic.Chatbot.ChatActivity;
import com.example.android.pharmegic.Maps.MapsActivity;
import com.example.android.pharmegic.Meme.MemeActivity;
import com.example.android.pharmegic.SpaceWars.Spacewar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.mxn.soul.flowingdrawer_core.ElasticDrawer;
import com.mxn.soul.flowingdrawer_core.FlowingDrawer;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;
import com.yalantis.guillotine.animation.GuillotineAnimation;

import java.text.DateFormat;
import java.util.Date;

import me.itangqi.waveloadingview.WaveLoadingView;

public class MenuScreen extends AppCompatActivity implements View.OnClickListener{

    private static final long RIPPLE_DURATION = 250;
    Button tvchat;
    Button tvpaytm;
    Button tvhosp;
    Button tvsignout;
    private WebView chatWindow;

    static int[] imageResources = new int[]{
//            R.drawable.emotion,
//            R.drawable.music_player,
//            R.drawable.robot,
            R.drawable.project,
//            R.drawable.clown,



    };
    static int[] Strings = new int[]{
//            R.string.voice,
//            R.string.news,
//            R.string.weather,
            R.string.forum,
//            R.string.buy,
    };

    private FlowingDrawer mDrawer;
    Toolbar toolbar;
    FrameLayout root;
    View contentHamburger;


    static int imageResourceIndex = 0;
    static int str = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(null);
        }


        root = findViewById(R.id.root);
        toolbar = findViewById(R.id.toolbar);
        contentHamburger = findViewById(R.id.content_hamburger);

        View guillotineMenu = LayoutInflater.from(this).inflate(R.layout.guillotine, null);
        root.addView(guillotineMenu);


        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();
//
//        LayoutInflater li  = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
//        assert li != null;
        View v = LayoutInflater.from(this).inflate(R.layout.guillotine,null);

        tvchat= v.findViewById(R.id.tvchat);
        tvpaytm= v.findViewById(R.id.tvpaytm);
        tvhosp= v.findViewById(R.id.tvhosp);
        tvsignout= v.findViewById(R.id.tvsignout);


        tvchat.setOnClickListener(this);
        tvpaytm.setOnClickListener(this);
        tvhosp.setOnClickListener(this);
        tvsignout.setOnClickListener(this);


        // Toast.makeText(this, currentDateTimeString, Toast.LENGTH_LONG).show();;

//        mDrawer = (FlowingDrawer) findViewById(R.id.drawerlayout);
//        WaveLoadingView mWaveLoadingView = (WaveLoadingView) findViewById(R.id.waveLoadingView);
//        mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.CIRCLE);
//
//        mWaveLoadingView.setCenterTitleColor(Color.GRAY);
//        mWaveLoadingView.setBottomTitleSize(18);
//        mWaveLoadingView.setProgressValue(20);
//        mWaveLoadingView.setBorderWidth(0);
//        mWaveLoadingView.setAmplitudeRatio(60);
//        mWaveLoadingView.setWaveColor(Color.parseColor("#ff64c2f4"));
//        mWaveLoadingView.setTopTitleStrokeColor(Color.parseColor("#ff1ca8f4"));
//        mWaveLoadingView.setTopTitleStrokeWidth(3);
//        mWaveLoadingView.setAnimDuration(6000);
//        mWaveLoadingView.pauseAnimation();
//        mWaveLoadingView.resumeAnimation();
//        mWaveLoadingView.cancelAnimation();
//        mWaveLoadingView.startAnimation();

        bmb();

//        setupToolbar();
//        setupMenu();

    }



//    protected void setupToolbar() {
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.drawable.ic_menu_white);
//
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mDrawer.toggleMenu();
//            }
//        });
//    }
//
//    private void setupMenu() {
//        FragmentManager fm = getSupportFragmentManager();
//        MenuListFragment mMenuFragment = (MenuListFragment) fm.findFragmentById(R.id.id_container_menu);
//        if (mMenuFragment == null) {
//            mMenuFragment = new MenuListFragment();
//            fm.beginTransaction().add(R.id.id_container_menu, mMenuFragment).commit();
//        }
//
//        mDrawer.setOnDrawerStateChangeListener(new ElasticDrawer.OnDrawerStateChangeListener() {
//            @Override
//            public void onDrawerStateChange(int oldState, int newState) {
//                if (newState == ElasticDrawer.STATE_CLOSED) {
//                    Log.i("MainActivity", "Drawer STATE_CLOSED");
//                }
//            }
//
//            @Override
//            public void onDrawerSlide(float openRatio, int offsetPixels) {
//                Log.i("MainActivity", "openRatio=" + openRatio + " ,offsetPixels=" + offsetPixels);
//            }
//        });
//
//        mDrawer = (FlowingDrawer) findViewById(R.id.drawerlayout);
//        mDrawer.setTouchMode(ElasticDrawer.TOUCH_MODE_BEZEL);
//        mDrawer.setOnDrawerStateChangeListener(new ElasticDrawer.OnDrawerStateChangeListener() {
//            @Override
//            public void onDrawerStateChange(int oldState, int newState) {
//                if (newState == ElasticDrawer.STATE_CLOSED) {
//                    Log.i("MenuActivity", "Drawer STATE_CLOSED");
//                }
//            }
//
//            @Override
//            public void onDrawerSlide(float openRatio, int offsetPixels) {
//                Log.i("MenuActivity", "openRatio=" + openRatio + " ,offsetPixels=" + offsetPixels);
//            }
//        });
//    }

    @Override
    public void onBackPressed() {
        if (mDrawer != null && mDrawer.isMenuVisible()) {
            mDrawer.closeMenu();

        } else {
            startActivity(new Intent(getBaseContext(),ChoiceActivity.class));
            finish();
        }
    }
    /*  public  void in()
      {

          WaveLoadingView mWaveLoadingView = (WaveLoadingView) findViewById(R.id.waveLoadingView);
          mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.CIRCLE);
          mWaveLoadingView.setTopTitle("Top Title");
          mWaveLoadingView.setCenterTitleColor(Color.GRAY);
          mWaveLoadingView.setBottomTitleSize(18);
          mWaveLoadingView.setProgressValue(80);
          mWaveLoadingView.setBorderWidth(10);
          mWaveLoadingView.setAmplitudeRatio(60);
          mWaveLoadingView.setWaveColor(Color.GRAY);
          mWaveLoadingView.setBorderColor(Color.GRAY);
          mWaveLoadingView.setTopTitleStrokeColor(Color.BLUE);
          mWaveLoadingView.setTopTitleStrokeWidth(3);
          mWaveLoadingView.setAnimDuration(6000);
          mWaveLoadingView.pauseAnimation();
          mWaveLoadingView.resumeAnimation();
          mWaveLoadingView.cancelAnimation();
          mWaveLoadingView.startAnimation();

      }*/
    public void bmb()
    {
        BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);
        bmb.setButtonEnum(ButtonEnum.Ham);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.HAM_1);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.HAM_1);
        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            HamButton.Builder builder = new HamButton.Builder()
                    .normalTextRes(getString())
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {

                            if (index == 0) {
                                sales(index);

                            }
                            if (index == 1) {
                                sales(index);
                            }
                            if (index == 4) {
                                anonymous(index);
                            }
                            if(index == 5){
                                anonymous(index);
                            }
                        }


                    })

                    .normalImageRes(getImageResource());
            bmb.addBuilder(builder);

        }
    }
    public static int getString() {
        if (str >= Strings.length) str = 0;
        return Strings[str++];
    }
    public static int getImageResource() {
        if (imageResourceIndex >= imageResources.length) imageResourceIndex = 0;
        return imageResources[imageResourceIndex++];
    }
    public void start(int pos)
    {
        //Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
                Intent in = new Intent( this, MainActivity.class);
                startActivity(in);
    }
    public void stock(int pos)
    {
       // Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
             Intent in = new Intent( this, ChatActivity.class);
              startActivity(in);
    }
    public void sales(int pos)
    {
        //Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
               Intent in = new Intent( this, Spacewar.class);
                startActivity(in);
    }
    public void buy(int pos)
    {
       // Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
                Intent in = new Intent( this, MemeActivity.class);
                startActivity(in);
    }
    public void anonymous(int pos)
    {
        // Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
        Intent in = new Intent( this, AnonymousChat.class);
        startActivity(in);
    }

    public void ordering(int pos)
    {
        //Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
                Intent in = new Intent( this, MusicActivity.class);
                startActivity(in);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.tvpaytm:
            {
                paytm(null);
                break;
            }
            case R.id.tvchat:
            { anonymousChat(null); break;}
            case R.id.tvhosp:
            {hosp(null); break;}
            case R.id.tvsignout:
            {
//                FirebaseAuth.getInstance().signOut();
                login(null);
                break;}


        }
    }

    public void login(View v ) {
        startActivity(new Intent(getBaseContext(), LoginActivity.class));
        //finish();
    }

    public void hosp(View v) {
        startActivity(new Intent(this, MapsActivity.class));
    }
    public void paytm(View v) {
        Toast.makeText(this,"Paytm ",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, PaytmActivity.class));
    }

    public void anonymousChat(View v) {
        startActivity(new Intent(this,AnonymousChat.class));
    }

}
