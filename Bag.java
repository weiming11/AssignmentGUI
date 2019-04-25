import java.io.*;
import java.util.*;

public class Bag {
   
    public ArrayList<Item> items;
    public int limititem ;
    public int slot ;
    public String Itemdrop;
    public int count;
    public int count1;
    public int count2;
    public int count3;
    public int count4;
    public int i;
    public Bag() {
          i = 1 ;
          items = new ArrayList<Item>();
          limititem = 100;
          slot = 0 ;
          count = 0;
          count1 = 0;
          count2 = 0;
          count3 = 0;
          count4 = 0;
    }

    public int getCount(){
      return count;
  }
  public void setCount (int count){
      this.count = count;
  }
 
  public int getCount1(){
      return count1;
  }
  public void setCount1 (int count1){
      this.count1 = count1;
  }
  public int getCount2(){
      return count2;
  }
  public void setCount2 (int count2){
      this.count2 = count2;
  }
  public int getCount3(){
      return count3;
  }
  public void setCount3 (int count3){
      this.count3 = count3;
  }
  public int getCount4(){
      return count4;
  }
  public void setCount4 (int count4){
      this.count4 = count4;
  }
    public void openbag() {
        while(i-1 < items.size()){
       
             if(items.get(i-1).nameitem.equals("Axe")){
                count++;
             }
             else if (items.get(i-1).nameitem.equals("Bow")){
                count1++;
             }
             else if (items.get(i-1).nameitem.equals("Sword")){
                count2++;
             }
             else if (items.get(i-1).nameitem.equals("potion20hp")){
               count3++;
              
            }
             else if (items.get(i-1).nameitem.equals("potion70hp")){
               count4++;
             }
          
      
        i++;    
      }
        }
     public void dropitem(){
        if(slot < limititem){
            items.add(new Item().RandItems());
            slot++;
        }
        else {
          System.out.println("Your bag is FULL!!!!");  
         }
        }
         
    }

    

