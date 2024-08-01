import javax.swing.*;

public class FirstSwing
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("LOGIN FORM");
        JLabel u = new JLabel("USERNAME");
        u.setBounds(50, 50, 100, 30);
        JTextField ut = new JTextField();
        ut.setBounds(150, 50, 200, 30);
        JLabel p = new JLabel("PASSWORD");
        p.setBounds(50, 100, 100, 30);
        JPasswordField pt = new JPasswordField();
        pt.setBounds(150, 100, 200, 30);
        JButton b = new JButton("LOGIN");
        b.setBounds(150, 150, 100, 40);

        f.add(u);
        f.add(ut);
        f.add(p);
        f.add(pt);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
