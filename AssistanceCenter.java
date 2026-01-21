/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.EmptyBorder;
import java.net.MalformedURLException;
import java.net.URL;

public class AssistanceCenter extends JFrame {

    private List<String> assistanceTypes;

    public AssistanceCenter() {
        initializeComponents();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Add a window listener to the frame
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Show a JOptionPane when the user clicks the close button
                int choice = JOptionPane.showConfirmDialog(
                        AssistanceCenter.this,
                        "Are you sure you want to go back to the main page?",
                        "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION
                );

                if (choice == JOptionPane.YES_OPTION) {
                    // User chose to go back to the main page
                    MainPage jf = new MainPage();
                    jf.setVisible(true);
                    dispose();
                    System.out.println("User has ended the system.");
                }
                // If the user chose "No" or closed the JOptionPane, do nothing and keep the subpage open
            }
        });
    }

    private void initializeComponents() {
        setTitle("Assistance Center");
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Set the frame icon
        try {
            // Create an ImageIcon from the URL
            URL url = new URL("https://th.bing.com/th/id/OIP.NNnB8HbUoQ91zH1Am383AwHaHa?rs=1&pid=ImgDetMain");
            ImageIcon icon = new ImageIcon(url);

            // Set the icon for the JFrame
            setIconImage(icon.getImage());
        } catch (MalformedURLException e) {
            // Handle the case where the URL is malformed
            System.err.println("Malformed URL: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
        }

        JPanel panel = new JPanel();
        // Background color
        panel.setBackground(new Color(0, 100, 0));

        // Show the welcoming message
        JOptionPane.showMessageDialog(null, "Welcome to Assistance Center!");
        JButton startButton = new JButton("Start Assistance Center");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the "Start Assistance Center" button click
                handleStartAssistanceCenter();
            }
        });

        startButton.setBorder(new EmptyBorder(10, 20, 10, 20));
        startButton.setPreferredSize(new Dimension(200, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 0, 0);

        panel.setLayout(new GridBagLayout());
        panel.add(startButton, gbc);

        add(panel, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
    }

    private void handleStartAssistanceCenter() {
        String[] assistanceTypesArray = {"Medical", "Food", "Sanitation", "Shelter", "Education", "Financial", "Infrastructure",
                "Psychosocial Support", "Livelihood Support", "Child Protection Services"};
        assistanceTypes = new ArrayList<>(List.of(assistanceTypesArray));
        StringBuilder assistanceMessage = new StringBuilder("Here are the types of assistance we have:\n");
        for (String type : assistanceTypes) {
            assistanceMessage.append("- ").append(type).append("\n");
        }
        JOptionPane.showMessageDialog(null, assistanceMessage.toString());

        try {
            // Select the number of people
            String[] numPeopleOptions = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            String selectedNumPeople = (String) JOptionPane.showInputDialog(null, "Choose the number of people:",
                    "Number of People", JOptionPane.QUESTION_MESSAGE, null, numPeopleOptions, numPeopleOptions[0]);
            System.out.println("Number of People: " + selectedNumPeople);

            if (selectedNumPeople != null) {
                int numPeople = Integer.parseInt(selectedNumPeople);
                String[] names = new String[numPeople];
                List<List<String>> assistanceTypesList = new ArrayList<>();

                // Let the user input the name and selected options for each person
                for (int i = 0; i < numPeople; i++) {
                    // Loop until a non-null and non-blank name is provided
                    do {
                        names[i] = JOptionPane.showInputDialog(null, "Enter the name for person " + (i + 1) + ":",
                                "Name Input", JOptionPane.QUESTION_MESSAGE);
                        if(names[i] == null){
                            JOptionPane.showMessageDialog(null,"User canceled. Exiting the system.");
                            System.out.println("User canceled. Existing the system.");
                            System.exit(0);
                        }
                    } while (names[i] == null || names[i].trim().isEmpty());

                    List<String> selectedAssistanceTypes = chooseAssistanceTypes(names[i]);
                    assistanceTypesList.add(selectedAssistanceTypes);
                }               
                displayResult(names, assistanceTypesList, numPeople);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }
    
    // User able to choose the assistance type from the dropdown box
    private static List<String> chooseAssistanceTypes(String personName) {
        List<String> selectedAssistanceTypes = new ArrayList<>();
        String[] assistanceTypes = {"Medical", "Food", "Sanitation", "Shelter", "Education", "Financial", "Infrastructure",
                "Psychosocial Support", "Livelihood Support", "Child Protection Services"};
        String selectedOption;

        do {
            selectedOption = (String) JOptionPane.showInputDialog(null, "Choose assistance type(s) for " + personName + ":",
                    "Assistance Type", JOptionPane.QUESTION_MESSAGE, null, assistanceTypes, assistanceTypes[0]);
            if (selectedOption != null) {
                System.out.println("Assistance type needed: " + selectedOption);
                selectedAssistanceTypes.add(selectedOption);

                // Ask if the user needs more assistance types
                int choice = JOptionPane.showConfirmDialog(null,
                        "Do you need more assistance types for " + personName + "?",
                        "Choose Assistance Type", JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.NO_OPTION) {
                    System.out.println("User has finished choosing assistance types.\n");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null,"Please choose an assistace type from the list。", "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
        return selectedAssistanceTypes;
    }
    
    // Display the finalised assistance types needed to the user.
    private void displayResult(String[] names, List<List<String>> assistanceTypesList, int numPeople) {
        StringBuilder Message = new StringBuilder();
        Message.append("Number of People: " + numPeople);
        Message.append("\nAssistance needed: \n");
        Message.append("------------------------------------------------------------------\n");
        Message.append("| Names     | Assistance Types Needed                             \n");
        Message.append("------------------------------------------------------------------\n");

        for (int i = 0; i < names.length; i++) {
            Message.append(String.format("| %-10s | %-70s \n", names[i], String.join(", ", 
                    assistanceTypesList.get(i))));
        }

        Message.append("-------------------------------------------------------------------\n");
        Message.append("Assistance will be sent to all shortly! ");

        JOptionPane.showMessageDialog(null, Message.toString());
        JOptionPane.showMessageDialog(null, "Thank you for using the assistance center.");
        
        MainPage jf= new MainPage();
        jf.show();
        dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AssistanceCenter();
        });
    }
}