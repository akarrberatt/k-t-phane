import java.awt.*;
import javax.swing.*;

public class KütüphaneciArayüzü extends JFrame {
    public KütüphaneciArayüzü(String kütüphaneci_Girişi){
        
        setTitle("Kütüphaneci Girişi");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        
        JLabel baslık = new JLabel("Kütüphaneci Ekranı");
        baslık.setFont(new Font("Arial" , Font.BOLD , 18));
                        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; 
        gbc.anchor = GridBagConstraints.CENTER;
        add(baslık, gbc);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); 

        JButton btnKutuphaneciKayit = new JButton("Kütüphaneci Kayıt");
        JButton btnKutuphaneciGiris = new JButton("Kütüphaneci Giriş");

        btnKutuphaneciGiris.setPreferredSize(new Dimension(150, 40));
        btnKutuphaneciKayit.setPreferredSize(new Dimension(150, 40));

        btnPanel.add(btnKutuphaneciGiris);
        btnPanel.add(btnKutuphaneciKayit);

        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(btnPanel, gbc);

        btnKutuphaneciGiris.addActionListener(e -> new KütüphaneciGiris("Kütüphaneci Girişi"));
        btnKutuphaneciKayit.addActionListener(e -> new KütüphaneciKayit("Kütüphaneci Kayıt"));

        setVisible(true);



    }

}
