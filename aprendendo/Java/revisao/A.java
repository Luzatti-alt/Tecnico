import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class A extends JFrame implements ActionListener{
    JButton b;
    A(){
        b = new JButton("Clique aqui");
        this.setTitle("aibuibdibfnsajlkbafas");
        this.add(b);
        b.addActionListener(this);
        this.setSize(new Dimension(500,500));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b){
            System.out.println("clicado");
        }
    }
    public static void main(String[]args){
        new A();
    }
}