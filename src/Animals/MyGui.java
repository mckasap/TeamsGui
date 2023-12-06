package Animals;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui extends JFrame  implements ActionListener {
    JPanel jpn= new JPanel();
    JLabel lbl= new JLabel();
    ButtonGroup btnGrp= new ButtonGroup();
    Border bdr = BorderFactory.createTitledBorder("Teams");
    JRadioButton rb1= new JRadioButton("TrabzonSpor");
    JRadioButton rb2= new JRadioButton("Besiktaş");
    JRadioButton rb3= new JRadioButton("Galatasaray");
    JRadioButton rb4= new JRadioButton("FenerBahçe");
    public MyGui(){
        btnGrp.add(rb1);
        btnGrp.add(rb2);
        btnGrp.add(rb3);
        btnGrp.add(rb4);

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);
        jpn.setBorder(bdr);
        jpn.add(rb1);
        jpn.add(rb2);
        jpn.add(rb3);
        jpn.add(rb4);
    jpn.setLayout(new GridLayout(4,1));
    setLayout(new GridLayout(1,2));
    setTitle("maskots of teams");
    setSize(300,300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(jpn);
    add(lbl);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rb2)
        lbl.setIcon( new ImageIcon(getClass().getResource("images/besiktas.jpeg")));
        else if(e.getSource()==rb1)
            lbl.setIcon( new ImageIcon(getClass().getResource("images/TS.jpeg")));
        else if(e.getSource()==rb3)
            lbl.setIcon( new ImageIcon(getClass().getResource("images/Cimbom.jpeg")));
        else if(e.getSource()==rb4)
            lbl.setIcon( new ImageIcon(getClass().getResource("images/FB.jpeg")));


    }
}
