import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame {

    public static void main(String[] args) {
     JFrame frame=new JFrame("Calculator");
     JPanel panelup=new JPanel();
      JPanel paneldown=new JPanel();
      frame.setLayout(null);
      frame.setBackground(Color.lightGray);
     Font font1=new Font("number",Font.ITALIC,20);
     Font font2=new Font("oper",Font.LAYOUT_NO_LIMIT_CONTEXT,20);
      frame.setSize(450,550);
      panelup.setLayout(null);
      //panelup.setBackground(Color.black);
     paneldown.setBackground(Color.black);
      paneldown.setLayout(null);
      panelup.setBounds(0,0,450,120);
      JTextField textfield=new JTextField("");
      textfield.setBounds(20,20,400,80);
      textfield.setFont(font1);
      panelup.add(textfield);
      frame.add(panelup);
      paneldown.setBounds(10,120,420,250);
      paneldown.setBackground(Color.lightGray);
      frame.add(paneldown);
     GridBagConstraints constraints = new GridBagConstraints();
     paneldown.setLayout(new GridLayout(4,4));
     char [] operator=new char[1];
     Double[]num1=new Double[1];
     Double[]num2=new Double[1];
     Double[] result=new Double[1];
     JButton but1=new JButton("1");
     but1.setFont(font1);
     but1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("1"));
      }
     });
     paneldown.add(but1);
     JButton but2=new JButton("2");
     but2.setFont(font1);
     but2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("2"));
      }
     });
     paneldown.add(but2);
     JButton but3=new JButton("3");
     but3.setFont(font1);
     but3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("3"));
      }
     });
     paneldown.add(but3);
     JButton butplus=new JButton("+");
     butplus.setFont(font2);
     butplus.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       num1[0] = Double.parseDouble(textfield.getText());
       operator[0]='+';
       textfield.setText("");
      }
     });
     paneldown.add(butplus);
     JButton but4=new JButton("4");
     but4.setFont(font1);
     but4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("4"));
      }
     });
     paneldown.add(but4);
     JButton but5=new JButton("5");
     but5.setFont(font1);
     but5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("5"));
      }
     });
     paneldown.add(but5);
     JButton but6=new JButton("6");
     but6.setFont(font1);
     but6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("6"));
      }
     });
     paneldown.add(but6);
     JButton butmine=new JButton("_");
     butmine.setFont(font2);
     butmine.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       num1[0] = Double.parseDouble(textfield.getText());
       operator[0]='-';
       textfield.setText("");
      }
     });
     paneldown.add(butmine);
     JButton but7=new JButton("7");
     but7.setFont(font1);
     but7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("7"));
      }
     });
     paneldown.add(but7);
     JButton but8=new JButton("8");
     but8.setFont(font1);
     but8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("8"));
      }
     });
     paneldown.add(but8);
     JButton but9=new JButton("9");
     but9.setFont(font1);
     but9.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("9"));
      }
     });
     paneldown.add(but9);
     JButton butdot=new JButton(".");
     butdot.setFont(font2);
     butdot.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("."));
      }
     });
     paneldown.add(butdot);
     JButton but0=new JButton("0");
     but0.setFont(font1);
     but0.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("0"));
      }
     });
     paneldown.add(but0);
     JButton butmult=new JButton("*");
     butmult.setFont(font2);
     butmult.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        num1[0] = Double.parseDouble(textfield.getText());
       operator[0]='*';
       textfield.setText("");
      }
     });
     paneldown.add(butmult);
     JButton butdivi=new JButton("/");
     butdivi.setFont(font2);
     butdivi.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        num1[0] = Double.parseDouble(textfield.getText());
       operator[0]='/';
       textfield.setText("");
      }
     });
     paneldown.add(butdivi);

     JButton butequal=new JButton("=");
     butequal.setFont(font2);
     butequal.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       num2[0] = Double.parseDouble(textfield.getText());
       switch (operator[0]){
        case '+':
        result[0]=num1[0]+num2[0];
        break;
        case '-':
         result[0]=num1[0]-num2[0];
         break;
        case '*':
         result[0]=num1[0]*num2[0];
         break;
        case '/':
         result[0]=num1[0]/num2[0];
         break;
       }
       textfield.setText(String.valueOf(result[0]));

      }
     });
     paneldown.add(butequal);
     JPanel paneltah=new JPanel();
     paneltah.setBounds(113,370,320,80);
     Font font3=new Font("cc",Font.ITALIC,17);
     GridBagConstraints constraintss = new GridBagConstraints();
     paneltah.setLayout(new GridLayout(1,3));
     JButton butnegative=new JButton("-");
     butnegative.setFont(font2);
     butnegative.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText(textfield.getText().concat("-"));
      }
     });
     paneltah.add(butnegative);
     JButton butdel=new JButton ("DEL");
     butdel.setFont(font3);
     butdel.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       String string=textfield.getText();
       textfield.setText("");
       for(int i=0;i<string.length()-1;i++){
        textfield.setText(textfield.getText()+string.charAt(i));
       }
      }
     });
     paneltah.add(butdel);
     JButton butclr=new JButton("CLR");
     butclr.setFont(font3);
     butclr.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       textfield.setText("");
      }
     });
     paneltah.add(butclr);
     frame.add(paneltah);



      frame.setVisible(true);
    }
}