package com.nahid.ai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends Activity {
  int bg=Color.rgb(13,14,19), panel=Color.rgb(26,27,35), panel2=Color.rgb(36,29,37), red=Color.rgb(238,61,83), pale=Color.rgb(255,150,160), white=Color.WHITE, muted=Color.rgb(174,174,185);
  LinearLayout root, messages; TextView clock, status;
  GradientDrawable shape(int c,int r){ GradientDrawable d=new GradientDrawable(); d.setColor(c); d.setCornerRadius(r); return d; }
  TextView label(String s,int size,int color,boolean bold){ TextView t=new TextView(this); t.setText(s); t.setTextSize(size); t.setTextColor(color); if(bold)t.setTypeface(Typeface.DEFAULT,Typeface.BOLD); return t; }
  LinearLayout column(){ LinearLayout l=new LinearLayout(this); l.setOrientation(LinearLayout.VERTICAL); return l; }
  LinearLayout row(){ LinearLayout l=new LinearLayout(this); l.setOrientation(LinearLayout.HORIZONTAL); l.setGravity(Gravity.CENTER_VERTICAL); return l; }
  void pad(View v,int a){v.setPadding(a,a,a,a);} 
  @Override public void onCreate(Bundle b){super.onCreate(b); getWindow().setStatusBarColor(bg);getWindow().setNavigationBarColor(bg); build();}
  void build(){
    ScrollView scroll=new ScrollView(this); scroll.setFillViewport(true); root=column(); root.setBackgroundColor(bg); root.setPadding(18,18,18,18); scroll.addView(root); setContentView(scroll);
    LinearLayout head=row(); TextView logo=label("NAHID AI",23,white,true); head.addView(logo,new LinearLayout.LayoutParams(0,-2,1)); TextView live=label("●  READY",11,Color.rgb(112,224,158),true); head.addView(live); root.addView(head);
    TextView sub=label("YOUR PERSONAL AI ASSISTANT",10,muted,true); sub.setLetterSpacing(.13f); root.addView(sub);
    LinearLayout hero=column(); hero.setGravity(Gravity.CENTER); hero.setPadding(16,24,16,22); hero.setBackground(shape(panel2,26)); LinearLayout.LayoutParams hp=new LinearLayout.LayoutParams(-1,-2);hp.topMargin=20;root.addView(hero,hp);
    TextView orb=label("✦",42,white,true); orb.setGravity(Gravity.CENTER); orb.setBackground(shape(red,100)); LinearLayout.LayoutParams op=new LinearLayout.LayoutParams(94,94);op.bottomMargin=14;hero.addView(orb,op);
    hero.addView(label("Hello, Nahid!",24,white,true)); TextView greeting=label("আমি তোমার সহকারী। কী করতে পারি?",14,muted,false); greeting.setPadding(0,7,0,0);hero.addView(greeting);
    LinearLayout time=row(); time.setGravity(Gravity.CENTER); time.setPadding(0,16,0,0); clock=label(new SimpleDateFormat("hh:mm a",Locale.getDefault()).format(new Date()),19,pale,true);time.addView(clock); hero.addView(time);
    TextView section=label("QUICK ACTIONS",12,muted,true);section.setLetterSpacing(.12f);section.setPadding(2,22,0,10);root.addView(section);
    LinearLayout grid=row(); root.addView(grid); String[][] items={{"◷","Set alarm"},{"☎","Call contact"},{"▤","My routine"},{"♡","Mood check-in"}};
    for(int i=0;i<items.length;i++){ final String name=items[i][1]; LinearLayout card=column();card.setGravity(Gravity.CENTER);card.setPadding(8,14,8,14);card.setBackground(shape(panel,18));LinearLayout.LayoutParams cp=new LinearLayout.LayoutParams(0,112,1);cp.setMargins(3,0,3,0);grid.addView(card,cp);card.addView(label(items[i][0],25,red,true));TextView tx=label(name,11,white,true);tx.setPadding(0,8,0,0);card.addView(tx);card.setOnClickListener(v->addMessage("তুমি",name+" খুলতে বলেছ।",true)); }
    TextView activity=label("LIVE ACTIVITY",12,muted,true);activity.setLetterSpacing(.12f);activity.setPadding(2,22,0,10);root.addView(activity);
    messages=column();messages.setPadding(12,12,12,12);messages.setBackground(shape(panel,18));root.addView(messages);
    addMessage("NAHID AI","আমি প্রস্তুত। তুমি যা বলবে, তার লেখা ও কাজের অবস্থা এখানে দেখাবে।",false);
    status=label("●  Waiting for your command",12,muted,false);status.setPadding(2,12,2,12);root.addView(status);
    LinearLayout mic=row();mic.setGravity(Gravity.CENTER);mic.setPadding(0,8,0,4);TextView micBtn=label("🎙  TAP TO TALK",14,white,true);micBtn.setGravity(Gravity.CENTER);micBtn.setPadding(24,16,24,16);micBtn.setBackground(shape(red,30));mic.addView(micBtn);root.addView(mic);micBtn.setOnClickListener(v->{status.setText("Voice input is a UI preview; microphone permission and speech recognition are not connected yet.");addMessage("NAHID AI","ভয়েস ফিচারটি পরবর্তী ধাপে যুক্ত হবে। আপাতত এটি UI প্রিভিউ।",false);});
    TextView note=label("Preview UI • Phone actions require permissions and confirmation",10,muted,false);note.setGravity(Gravity.CENTER);note.setPadding(0,14,0,8);root.addView(note);
  }
  void addMessage(String who,String msg,boolean user){TextView title=label(who,11,user?pale:red,true);title.setPadding(0,5,0,3);messages.addView(title);TextView body=label(msg,14,white,false);body.setPadding(0,0,0,8);messages.addView(body);}
}
