
package gui;
//import java.io.*;
import javax.swing.*;
import java.awt.*;
public class GUI {
    private JRadioButton ckBird;
    private JRadioButton ckCat;
    private JRadioButton ckDog;
    private JRadioButton ckRabbit;
    private JRadioButton ckPig;
    private ButtonGroup animalGroup;
    public GUI(){
        
        
        JFrame frame = new JFrame("Animal Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new BoxLayout(checkboxPanel, BoxLayout.Y_AXIS));
        
        ckBird   = new JRadioButton("Bird");
        ckCat    = new JRadioButton("Cat");
        ckDog    = new JRadioButton("Dog");
        ckRabbit = new JRadioButton("Rabbit");
        ckPig    = new JRadioButton("Pig");

        
        ckBird.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        ckCat.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        ckDog.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        ckRabbit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        ckPig.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        
        animalGroup = new ButtonGroup();
        animalGroup.add(ckBird);
        animalGroup.add(ckCat);
        animalGroup.add(ckDog);
        animalGroup.add(ckRabbit);
        animalGroup.add(ckPig);

        checkboxPanel.add(ckBird);
        checkboxPanel.add(Box.createVerticalStrut(12));
        checkboxPanel.add(ckCat);
        checkboxPanel.add(Box.createVerticalStrut(12));
        checkboxPanel.add(ckDog);
        checkboxPanel.add(Box.createVerticalStrut(12));
        checkboxPanel.add(ckRabbit);
        checkboxPanel.add(Box.createVerticalStrut(12));
        checkboxPanel.add(ckPig);
        checkboxPanel.add(Box.createVerticalStrut(20));

       JButton CheckButton = new JButton("Submit");
       CheckButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
       
       checkboxPanel.add(CheckButton);
        
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

    
        try {
      
            ImageIcon icon = new ImageIcon(getClass().getResource("demmo.png"));
            if (icon.getImage() != null) {
                Image scaled = icon.getImage().getScaledInstance(220, 320, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(scaled));
            } else {
                imageLabel.setText("Image not found");
            }
        } catch (Exception e) {
            imageLabel.setText("Error loading image");
        }

  
        mainPanel.add(checkboxPanel, BorderLayout.WEST);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setSize(550, 380);
        frame.setLocationRelativeTo(null);   
        frame.setVisible(true);
    }
    
    public String SelectedAnimal(){
        if(ckBird.isSelected()) return "Bird";
        if(ckCat.isSelected()) return "Cat";
        if(ckDog.isSelected()) return "Dog";
        if(ckRabbit.isSelected()) return "Rabbit";
        if(ckDog.isSelected()) return "Dog";
        return null;
    }
    
    private String getSelectedAnimal() {
    for (java.util.Enumeration<AbstractButton> buttons = animalGroup.getElements(); 
         buttons.hasMoreElements(); ) {
        AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
            return button.getText();
        }
    }
    return null;
}

    public static void main(String[] args) {
        // TODO code application logic here
        GUI AnimalCheck = new GUI();
        while (true) {
            System.out.println(AnimalCheck.getSelectedAnimal());
        }
        
        
        
        
    }
    
}
