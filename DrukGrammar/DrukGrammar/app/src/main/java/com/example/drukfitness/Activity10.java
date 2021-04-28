package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class Activity10 extends AppCompatActivity {
    MediaPlayer Ka, Kha, ga, nga, haha, ha, nag, chai, cha, ja, fish, zha, ya, sha, e, a, ta, tha, da, na, saaa,
            tsha, zaa, za, la, sa, paa, pha, ba, ma, wa, nu, o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);
        Ka = MediaPlayer.create(Activity10.this,R.raw.ka1);
        Kha = MediaPlayer.create(Activity10.this,R.raw.kha2);
        ga = MediaPlayer.create(Activity10.this,R.raw.ga3);
        nga = MediaPlayer.create(Activity10.this,R.raw.nga4);
        haha = MediaPlayer.create(Activity10.this,R.raw.haha);
        ha = MediaPlayer.create(Activity10.this,R.raw.ha);
        nag = MediaPlayer.create(Activity10.this,R.raw.nag7);
        chai = MediaPlayer.create(Activity10.this,R.raw.chai8);
        cha = MediaPlayer.create(Activity10.this,R.raw.cha);
        ja = MediaPlayer.create(Activity10.this,R.raw.ja);
        fish = MediaPlayer.create(Activity10.this,R.raw.fish);
        zha = MediaPlayer.create(Activity10.this,R.raw.zha);
        ya = MediaPlayer.create(Activity10.this,R.raw.ya);
        sha = MediaPlayer.create(Activity10.this,R.raw.sha);
        e = MediaPlayer.create(Activity10.this,R.raw.e);
        a = MediaPlayer.create(Activity10.this,R.raw.a);
        ta = MediaPlayer.create(Activity10.this,R.raw.ta);
        tha = MediaPlayer.create(Activity10.this,R.raw.tha);
        da = MediaPlayer.create(Activity10.this,R.raw.da);
        na = MediaPlayer.create(Activity10.this,R.raw.na);
        saaa = MediaPlayer.create(Activity10.this,R.raw.saaa);
        tsha = MediaPlayer.create(Activity10.this,R.raw.tsha);
        zaa = MediaPlayer.create(Activity10.this,R.raw.zaa);
        za = MediaPlayer.create(Activity10.this,R.raw.za);
        la = MediaPlayer.create(Activity10.this,R.raw.la);
        sa = MediaPlayer.create(Activity10.this,R.raw.sa);
        paa = MediaPlayer.create(Activity10.this,R.raw.paa);
        ba = MediaPlayer.create(Activity10.this,R.raw.ba);
        pha = MediaPlayer.create(Activity10.this,R.raw.ba);
        ma = MediaPlayer.create(Activity10.this,R.raw.ma);
        wa = MediaPlayer.create(Activity10.this,R.raw.wa);
        nu = MediaPlayer.create(Activity10.this,R.raw.nu);
        o = MediaPlayer.create(Activity10.this,R.raw.o);













    }

    public void part18(View view) {
        Intent obj = new Intent(Activity10.this, Activity9.class);
        startActivity(obj);
    }

    public void part19(View view) {
        Intent obj = new Intent(Activity10.this, Activity11.class);
        startActivity(obj);
    }
    public void play1(View view) {
        Ka.start();
    }

    public void play2(View view) {
        Kha.start();
    }

    public void play3(View view) { ga.start();}

    public void play4(View view) { nga.start();}

    public void play5(View view) {haha.start(); }

    public void play6(View view) { ha.start();}

    public void play7(View view) { nag.start();}

    public void play8(View view) { chai.start();}

    public void play9(View view) { cha.start();}

    public void play10(View view) { ja.start();}

    public void play11(View view) { fish.start();}

    public void play12(View view) { zha.start();}

    public void play13(View view) { ya.start();}

    public void play14(View view) {sha.start(); }

    public void play15(View view) { e.start();}

    public void play16(View view) {a.start(); }

    public void play17(View view) {ta.start(); }

    public void play18(View view) {tha.start(); }

    public void play19(View view) { da.start();}

    public void play20(View view) { na.start();}

    public void play21(View view) { saaa.start();}

    public void play22(View view) { tsha.start();}

    public void play23(View view) { zaa.start();}

    public void play24(View view) { za.start();}

    public void play25(View view) { la.start();}

    public void play26(View view) { sa.start();}

    public void play27(View view) { paa.start();}

    public void play28(View view) { pha.start();}

    public void play29(View view) {ba.start();}

    public void play30(View view) { ma.start();}

    public void play31(View view) {wa.start(); }

    public void play32(View view) { nu.start();}

    public void play33(View view) { o.start();}


    @Override
    protected void onPause(){
        super.onPause();
        Ka.release();
        Kha.release();
        ga.release();
        nga.release();
        haha.release();
        ha.release();
        nag.release();
        chai.release();
        cha.release();
        ja.release();
        fish.release();
        zha.release();
        ya.release();
        sha.release();
        e.release();
        a.release();
        ta.release();
        tha.release();
        da.release();
        na.release();
        saaa.release();
        tsha.release();
        zaa.release();
        za.release();
        la.release();
        sa.release();
        paa.release();
        pha.release();
        ba.release();
        ma.release();
        wa.release();
        nu.release();
        o.release();
    }



}