import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
public class ImageViewer extends JFrame
{
  Game game;
  Container c;
  JPanel p1 ;
  JPanel p2 ;
  JPanel p3 ;
  JPanel p4 ; 
  JPanel p6 ;
  JPanel p7 ; 
  JPanel pa ;
  JLabel lb1;
  JLabel lb2;
  JLabel lb3;
  JLabel lb4;
  JLabel lb5;
  JLabel lb6;
  JLabel lb7;
  JLabel b1 ;
  JLabel b2 ;
  JLabel b3 ;
  JLabel b4 ;
  JLabel la2 ;
  JLabel la3 ;
  JLabel la4 ;
  JLabel la5 ;
  JLabel la6 ;
  JLabel L1 ;
  JLabel L2 ; 
  JLabel jl1 ;
  JLabel jl2 ; 
  JButton jb1 ;
  JButton jb2 ;
  JButton jb3 ;
  JButton jb4 ;
  JButton jb5 ;
  JButton bt4 ;
  JButton ju1 ;
  JButton bb ;
  JTextField jf1 ;
  JComboBox cb1 ;
  JCheckBox jc1 ;
  JCheckBox jc2 ; 
  JFrame viewer1;
  JFrame viewer2;
  JFrame viewer3;
  JFrame viewer4;
  public ImageViewer()
  { 
    super("Status");
    game = new Game();
    c = getContentPane();
    //JPanel p1 = new JPanel();  
    p1 = new JPanel();
    p1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    p1.setLayout( new BoxLayout(p1, BoxLayout.Y_AXIS));
    lb1 = new JLabel("LEVEL :" + game.player.getLevel());
    lb2 = new JLabel("EXP :" + game.player.getExp()+"/100");
    lb3 = new JLabel("HP :" + game.player.getHp()+"/"+ game.player.getHpmax());
    lb4 = new JLabel("NAME :" + game.player.getName());
    lb5 = new JLabel("JOB :" + game.player.getJob());
    lb6 = new JLabel("P.atk :" + game.player.getPatk());
    lb7 = new JLabel("Number of killings :" + game.player.getKillnum());
    p1.add( lb4 );
    p1.add(Box.createRigidArea(new Dimension(0, 10)));
    p1.add( lb5 );
    p1.add(Box.createRigidArea(new Dimension(0, 10)));
    p1.add( lb1 );
    p1.add(Box.createRigidArea(new Dimension(0, 10)));
    p1.add( lb2 );
    p1.add(Box.createRigidArea(new Dimension(0, 10)));
    p1.add( lb3 );
    p1.add(Box.createRigidArea(new Dimension(0, 10)));
    p1.add( lb6 );
    p1.add(Box.createRigidArea(new Dimension(0, 10)));
    p1.add( lb7 );


    p2 = new JPanel();
    p2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    p2.setLayout( new BoxLayout(p2, BoxLayout.Y_AXIS));
    jb1 = new JButton("Fight");
    jb2 = new JButton("See the monsters around");
    jb3 = new JButton("Change Job");
    jb4 = new JButton("Free use HPpotion 1 time");
    jb5 = new JButton("Open your bag");
    p2.add(Box.createRigidArea(new Dimension(0, 3)));
    jb1.addActionListener( new ActionListener() {
      public void actionPerformed(ActionEvent e)
       {     
            String[] monsname = {"Choose monster", "Barbarian", "Archer"};
            viewer1 = new JFrame("Fight");
            String images[] = {"qustion.jpg", "barbarian.png", "archer.png"};
            viewer1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            viewer1.setLayout(new BoxLayout(viewer1.getContentPane(),BoxLayout.Y_AXIS));
            cb1 = new JComboBox(monsname);
            jf1 = new JTextField(25);
            L1 = new JLabel(new ImageIcon("question.jpg"));
            L2 = new JLabel("Drop items :");
            bt4 = new JButton("RUN");
            p3 = new JPanel();
            p4 = new JPanel(); 
            p3.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            p3.setLayout( new BoxLayout(p3, BoxLayout.X_AXIS));
            p4.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            p4.setLayout( new BoxLayout(p4, BoxLayout.X_AXIS));
            p3.add(L1);
            p4.add(L2);
            cb1.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e)
              { 

                  boolean ck;
                  if(cb1.getSelectedIndex() == 1)
                  {  
                     ck = game.player.monster(1);
                     if(game.player.getHp() <= 200 && game.player.getHp() > 0 )
                     {
                      JOptionPane.showMessageDialog(null, "You should use potion");
                     }
                     if(game.player.getHp() <= 0)
                     {
                      JOptionPane.showMessageDialog(null, "You can't fight monster");
                     }
                     else if(ck)
                     {
                       JOptionPane.showMessageDialog(null, "Monster died");
                       jf1.setText(game.player.getNamedrop());
                     }
                     if(game.player.getHp() == 0)
                     {
                       JOptionPane.showMessageDialog(null, "You died");
                     }
                  }
                  else if (cb1.getSelectedIndex() == 2)
                  {
                    
                     ck = game.player.monster(2); 
                     if(game.player.getHp() <= 200 && game.player.getHp() > 0 )
                     {
                      JOptionPane.showMessageDialog(null, "You should use potion");
                     }
                     if(game.player.getHp() <= 0)
                     {
                      JOptionPane.showMessageDialog(null, "You can't fight monster");
                     }
                     else if(ck)
                     {
                       JOptionPane.showMessageDialog(null, "Monster died");
                       jf1.setText(game.player.getNamedrop());
                     }
                     if(game.player.getHp() == 0)
                     {
                       JOptionPane.showMessageDialog(null, "You died");
                     }
                    
                  }
              }
            });

            bt4.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e){
                      viewer1.setVisible(false);
                      if(game.player.getLevel() >= 4 && game.player.getJob().equals("Novice") ){
                        JOptionPane.showMessageDialog(null, "You can change Jobs");
                      }
                   }
            });
      
            p3.add( cb1 );
            p3.add(Box.createRigidArea(new Dimension(0, 10)));
            p4.add( jf1 );
            p4.add(Box.createRigidArea(new Dimension(0, 10)));
            viewer1.add(p3);
            viewer1.add(p4);
            viewer1.add(bt4);
            viewer1.add(Box.createRigidArea(new Dimension(0, 10)));
            viewer1.setResizable(false);
            viewer1.pack();
            viewer1.setLocationRelativeTo(null);
            viewer1.setVisible(true);
       }
    });
    jb2.addActionListener( new ActionListener() {
      public void actionPerformed(ActionEvent e) {
              viewer2 = new JFrame("See monster around");
              viewer2.setDefaultCloseOperation(HIDE_ON_CLOSE);
              viewer2.setLayout(new BoxLayout(viewer2.getContentPane(), BoxLayout.Y_AXIS));
              game.player.mons.rando1();
              b1 = new JLabel("Monster :" +game.player.mons.getMn());
              b2 = new JLabel("HP :" + game.player.mons.getMh());
              b3 = new JLabel("P.atk :" + game.player.mons.getMp());
              b4 = new JLabel("Exp received from monster :" + game.player.mons.getMe());
              viewer2.add( b1 );
              viewer2.add(Box.createRigidArea(new Dimension(5, 10)));
              viewer2.add( b2 );
              viewer2.add(Box.createRigidArea(new Dimension(5, 10)));
              viewer2.add( b3 );
              viewer2.add(Box.createRigidArea(new Dimension(5, 10)));
              viewer2.add( b4 );
              viewer2.add(Box.createRigidArea(new Dimension(5, 10)));
              viewer2.setResizable(false);
              viewer2.setSize(200,150);
              viewer2.setLocationRelativeTo(null);
              viewer2.setVisible(true);
              redraw1(game);

      }
    });
    
    jb3.addActionListener( new ActionListener() {
    
      public void actionPerformed(ActionEvent e)
          {  
            if(game.player.getLevel() >= 4 && game.player.getJob().equals("Novice") ){
            viewer3 = new JFrame("See the monsters around");
            viewer3.setDefaultCloseOperation(HIDE_ON_CLOSE);
            viewer3.setLayout(new BoxLayout(viewer3.getContentPane(), BoxLayout.Y_AXIS));
            jc1 = new JCheckBox("Saint");
            jc2 = new JCheckBox("Archer");
            jl1 = new JLabel(new ImageIcon("arc.jpg"));
            jl2 = new JLabel(new ImageIcon("saint.jpg"));
            p6 = new JPanel();
            p6.setLayout(new BoxLayout(p6, BoxLayout.X_AXIS));
            p6.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            p7 = new JPanel();
            p7.setLayout(new BoxLayout(p7, BoxLayout.X_AXIS));
            p7.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            ju1 = new JButton("ok");
            jc1.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
                 game.changejob(2, game.player);
              }
            });
            jc2.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
                 game.changejob(1, game.player);
              }
            });
            ju1.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Successful Job change");
                viewer3.setVisible(false);
              }
            });
            p6.add(jl2);
            p6.add(jc1);
            p6.add(Box.createRigidArea(new Dimension(0, 10)));
            p7.add(jl1);
            p7.add(Box.createRigidArea(new Dimension(0, 10)));
            p7.add(jc2);
            viewer3.add(p6);
            viewer3.add(p7);
            viewer3.add(ju1);
            viewer3.add(Box.createRigidArea(new Dimension(0, 10)));
            viewer3.setResizable(false);
            viewer3.pack();
            viewer3.setLocationRelativeTo(null);
            viewer3.setVisible(true);
        }
        else{
           JOptionPane.showMessageDialog(null, "You can't change job");
        }
      }
    });
    jb4.addActionListener(new ActionListener() {
      int count = 1;
      public void actionPerformed(ActionEvent e){
           if(game.player.test(count))
           {
              count++;
              game.player.setHp(game.player.getHpmax());
              JOptionPane.showMessageDialog(null,"HP is FULL!!");
           }
           else
              JOptionPane.showMessageDialog(null,"You can use it once!!");
          
      }
    });
    jb5.addActionListener(new ActionListener() {
    
      public void actionPerformed(ActionEvent e){
           viewer4 = new JFrame("bag");
           viewer4.setDefaultCloseOperation(HIDE_ON_CLOSE);
           viewer4.setLayout(new BoxLayout(viewer4.getContentPane(), BoxLayout.Y_AXIS));
           pa = new JPanel();
           pa.setLayout(new BoxLayout(pa, BoxLayout.Y_AXIS));
           la2 = new JLabel("Axe * " +  game.player.bag.getCount());
           la3 = new JLabel("Bow * "+ game.player.bag.getCount1());
           la4 = new JLabel("Sword * "+ game.player.bag.getCount2());
           la5 = new JLabel("potion20hp * "+ game.player.bag.getCount3());
           la6 = new JLabel("potion70hp * "+ game.player.bag.getCount4());
           bb = new JButton("OK");
           pa.add(Box.createRigidArea(new Dimension(0, 10)));
           pa.add(la2);
           pa.add(Box.createRigidArea(new Dimension(0, 10)));
           pa.add(la3);
           pa.add(Box.createRigidArea(new Dimension(0, 10)));
           pa.add(la4);
           pa.add(Box.createRigidArea(new Dimension(0, 10)));
           pa.add(la5);
           pa.add(Box.createRigidArea(new Dimension(0, 10)));
           pa.add(la6);
           pa.add(Box.createRigidArea(new Dimension(0, 10)));
           viewer4.add( pa );
           bb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              viewer4.setVisible(false);
            }
          });
           viewer4.add( bb );
           viewer4.add(Box.createRigidArea(new Dimension(70, 10)));
           viewer4.setResizable(false);
           viewer4.pack();;
           viewer4.setLocationRelativeTo(null);
           viewer4.setVisible(true);
           redraw(game);


      }
    });
    p2.add( jb1 );
    p2.add(Box.createRigidArea(new Dimension(0, 10)));
    p2.add( jb2 );
    p2.add(Box.createRigidArea(new Dimension(0, 10)));
    p2.add( jb3 );
    p2.add(Box.createRigidArea(new Dimension(0, 10)));
    p2.add( jb4 );
    p2.add(Box.createRigidArea(new Dimension(0, 10)));
    p2.add( jb5 );
    
   
    c.add(p1, BorderLayout.WEST);
    c.add(p2, BorderLayout.CENTER);
    /*JPanel p2 = new JPanel();
    p2.setLayout( new BorderLayout(10, 7));
    p2.add(p1, BorderLayout.CENTER);*/
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setSize(500,300);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
    setResizable(false);

    while(true){
      redraw(game);
    }
  }

  public void redraw(Game game){
    lb1.setText("LEVEL :" + game.player.getLevel());
    lb2.setText("EXP :" + game.player.getExp()+"/100");
    lb3.setText("HP :" + game.player.getHp()+"/"+ game.player.getHpmax());
    lb4.setText("NAME :" + game.player.getName());
    lb5.setText("JOB :" + game.player.getJob());
    lb6.setText("P.atk :" + game.player.getPatk());
    lb7.setText("Number of killings :" + game.player.getKillnum());

  }

  public void redraw1(Game game){
    b1.setText("Monster :" +game.player.mons.getMn());
    b2.setText("HP :" + game.player.mons.getMh());
    b3.setText("P.atk :" + game.player.mons.getMp());
    b4.setText("Exp received from monster :" + game.player.mons.getMe());
  }
}
