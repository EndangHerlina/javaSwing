import java.awt.Toolkit;
import javax.swing.JButton;  
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class baruloh {  
    
    
        JFrame frame = new JFrame("Form OPREC Pengurus Baru Himasisfo 2021");  
        JPanel panel = new JPanel();  
//        panel.setLayout(new FlowLayout());  
        JLabel lnama = new JLabel("NAMA  ");
        final JTextField fnama = new JTextField(10);
        JLabel lnim = new JLabel("NIM  ");
        final JTextField fnim = new JTextField(10);
        JLabel langkatan = new JLabel ("Angkatan ");
        JRadioButton rb17 = new JRadioButton("2017");
        JRadioButton rb18 = new JRadioButton("2018");
        JRadioButton rb19 = new JRadioButton("2019");
        JRadioButton rb20 = new JRadioButton("2020");
        JLabel ldep = new JLabel("Departemen pilihan ");
        String[] namaDep = {"Pilih","Kewirausahaan" , "Minat & Bakat" , "Regenerasi & Pengembangan Manusia" , "Pengabdian Masyarakat" , "Humas & Kesekertariatan", "Akademik & Keprofesian", "Kesejahteraan Masyarakat", "Media Komunikasi & Informasi"};
        JComboBox ckdep = new JComboBox(namaDep);
        JLabel lhobi = new JLabel ("Cross Departemen?");
        JCheckBox cbsepakbola = new JCheckBox("YA");
        JCheckBox cbbasket = new JCheckBox("TIDAK");
        JButton button = new JButton();  
     public baruloh(){
        button.setText("Submit");  
        
        
       frame.add(lnama);
       frame.add(fnama);
       frame.add(lnim);
       frame.add(fnim);
       frame.add(langkatan);
       frame.add(rb17);
       frame.add(rb18);
       frame.add(rb19);
       frame.add(rb20);
       frame.add(ldep);
       frame.add(ckdep);
       frame.add(lhobi);
       frame.add(cbsepakbola);
       frame.add(cbbasket);
       frame.add(button);  
        
        lnama.setBounds(10,10,120,20);
	fnama.setBounds(150,10,150,20);
        lnim.setBounds(10,35,120,20);
	fnim.setBounds(150,35,150,20);
	langkatan.setBounds(10,60,120,20);
	rb17.setBounds(150,60,100,20);
	rb18.setBounds(250,60,100,20);
        rb19.setBounds(350,60,100,20);
	rb20.setBounds(450,60,100,20);
	ldep.setBounds(10,85,150,20);
	ckdep.setBounds(150,85,240,20);
	lhobi.setBounds(10,110,120,20);
	cbsepakbola.setBounds(150,110,100,20);
	cbbasket.setBounds(250,110,150,20);
	button.setBounds(400,150,120,20);
	 

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
        frame.add(panel);  
        frame.setSize(550, 220);  
        frame.setLocationRelativeTo(null);  
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}