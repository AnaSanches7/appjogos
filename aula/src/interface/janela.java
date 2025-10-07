package
import java.awt.CardLayout;
import java.security.Principal;
import javax.swing.JFrame;
import javax.swing.JPanel;

 interface;
import javax.swing.JFrame;

 interface;
import java.security.Principal;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class janela extends JFrame{
  public janela(){
    this.setBounds(0, 0, 1920, 1800);
    CardLayout controleTela = new CardLayout();
    JPanel telas = new JPanel(controleTela);
    LoginPanel LoiginPanel = new LoginPanel(telas, this);
    PrincipalPanel PrincipalPanel = new pricipalPanel(telas, this)

    this.add(telas);
    this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setUndecorated(true);
    this.setVisible(true);

  }
    
}
