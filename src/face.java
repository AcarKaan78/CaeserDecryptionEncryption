import javax.swing.*;
import java.awt.*;

public class face {

    public void faceOfProgram(){
        Integer[] alpha = new Integer[27];
        for(int i=0;i<27;i++){
            alpha[i]= i;
        }
        JFrame face = new JFrame();
        face.setVisible(true);
        face.setSize(800,400);
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        face.setLayout(layout);
        face.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel mainText = new JLabel("Enter the text");
        JTextField testField = new JTextField();
        JComboBox<Integer> keyInt= new JComboBox<>(alpha);
        JButton decrypt = new JButton("Decrypt");
        JButton encrypt = new JButton("Encrypt");
        JLabel result = new JLabel();
        JLabel keySelect = new JLabel("  Key =");
        JLabel resultText = new JLabel("Result =");


        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        face.add(mainText,c);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 3;
        c.gridheight = 2;
        face.add(testField,c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        face.add(keySelect,c);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        face.add(keyInt,c);
        c.fill = GridBagConstraints.NONE;
        c.gridx = 1;
        c.gridy = 3;
        face.add(decrypt,c);
        decrypt.addActionListener(e -> {
            String code = testField.getText();
            int key = keyInt.getItemAt(keyInt.getSelectedIndex());
            Decryption1 decry = new Decryption1();
            result.setText(decry.DecryptionOfCaesar(key,code));
        });
        c.gridx = 3;
        c.gridy = 3;
        face.add(encrypt,c);
        encrypt.addActionListener(a -> {
            String code = testField.getText();
            int key = keyInt.getItemAt(keyInt.getSelectedIndex());
            Encryption encry = new Encryption();
            result.setText(encry.EncryptionOfCaesar(key,code));
        });
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 4;
        c.gridy = 1;
        face.add(resultText);

        c.gridx = 4;
        c.gridy = 2;
        face.add(result,c);
    }
}
