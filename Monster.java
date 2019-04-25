import java.io.*;
import java.util.*;

public class Monster{
    
    private String monsa;
    private String monsb;
    private int hparcher;
    private int hpbarbarian;
    private int patkarcher;
    private int patkbarbarian;
    private int exparcher;
    private int expbarbarian;
    private String mn;
    private int mh;
    private int mp;
    private int me;

    public Monster(){
          monsa = "Archer";
          monsb = "Barbarian";
          hparcher = 500;
          hpbarbarian = 650;
          patkarcher = 30;
          patkbarbarian = 40;
          exparcher = 70;
          expbarbarian = 90;
          mn = "name";
          mh = 0;
          mp = 0;
          me = 2;

        
    }

    public String getMonsa(){
        return monsa;
    }
    public void setMonsa (String monsa){
        this.monsa = monsa;
    }

    public String getMonsb(){
        return monsb;
    }
    public void setMonsb (String monsb){
        this.monsb = monsb;
    }

    public int getHparcher(){
        return hparcher;
    }
    public void setHparcher (int hparcher){
        this.hparcher = hparcher;
    }
    
    public int getHpbarbarian(){
        return hpbarbarian;
    }
    public void setHpbarbarian (int hpbarbarian){
        this.hpbarbarian = hpbarbarian;
    }

    public int getPatkarcher(){
        return patkarcher;
    }
    public void setPatkarcher (int patkarcher){
        this.patkarcher = patkarcher;
    }
    public int getPatkbarbarian(){
        return patkbarbarian;
    }
    public void setPatkbarbarian (int patkbarbarian){
        this.patkbarbarian = patkbarbarian;
    }

    public int getExparcher(){
        return exparcher;
    }
    public void setExparcher (int exparcher){
        this.exparcher = exparcher;
    }
    public int getExpbarbarian(){
        return expbarbarian;
    }
    public void setExpbarbarian (int expbarbarian){
        this.expbarbarian = expbarbarian;
    }

    public String getMn(){
        return mn;
    }
    public void setMn (String mn){
        this.mn = mn;
    }
    
    public int getMh(){
        return mh;
    }
    public void setMh (int mh){
        this.mh = mh;
    }
    public int getMp(){
        return mp;
    }
    public void setMp (int mp){
        this.mp = mp;
    }
    public int getMe(){
        return me;
    }
    public void setMe (int me){
        this.me = me;
    }
    
    public void rando1(){
        int num2;

        num2 = (int)(Math.random()*2);
        mn =chk(num2);
        mh =chk1(num2);
        mp =chk2(num2);
        me =chk3(num2);

    }
    public String chk(int num2){
        if(num2 <= 2 && num2 > 0.5 ){
            return monsa;
        }
        else
          return monsb;
    }
    
    public int chk1(int num2){
        if(num2 <= 2 && num2 > 0.5){
            return hparcher;
        }
        else
          return hpbarbarian;
    }
    public int chk2(int num2){
        if(num2 <= 2 && num2 > 0.5){
            return patkarcher;
        }
        else
          return patkbarbarian;
    }
    public int chk3(int num2){
        if(num2 <= 2 && num2 > 0.5){
            return exparcher;
        }
        else
          return expbarbarian;
    }
}