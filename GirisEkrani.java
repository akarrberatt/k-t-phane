import java.awt.*;
import javax.swing.*;

public class GirisEkrani extends JFrame {
    public GirisEkrani() {
        setSize(400, 300);
        setTitle("Giriş Ekranı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new GridBagLayout()); 

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); 

        
        JLabel lblBaslik = new JLabel("Kütüphanemize Hoşgeldiniz!");
        lblBaslik.setFont(new Font("Arial", Font.BOLD, 18));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; 
        gbc.anchor = GridBagConstraints.CENTER;
        add(lblBaslik, gbc);

        
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); 

        JButton btnKutuphaneGiris = new JButton("Kütüphaneci Girişi");
        JButton btnOkuyucuGiris = new JButton("Okuyucu Girişi");

        btnKutuphaneGiris.setPreferredSize(new Dimension(150, 40));
        btnOkuyucuGiris.setPreferredSize(new Dimension(150, 40));

        btnPanel.add(btnKutuphaneGiris);
        btnPanel.add(btnOkuyucuGiris);

        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(btnPanel, gbc);

        setVisible(true);
    }
}

