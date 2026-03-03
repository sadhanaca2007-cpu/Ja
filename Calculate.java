import java.awt.*; import java.awt.event.*;
class Calc extends Frame implements ActionListener{
TextField t1=new TextField(),t2=new TextField(),t3=new TextField();
Button b=new Button("Add");
Calc(){
setLayout(new FlowLayout()); add(t1); add(t2); add(b); add(t3);
b.addActionListener(this); setSize(250,200); setVisible(true);
}
public void actionPerformed(ActionEvent e){
int a=Integer.parseInt(t1.getText()),c=Integer.parseInt(t2.getText());
t3.setText(String.valueOf(a+c));
}
public static void main(String[] args){ new Calc(); }
}