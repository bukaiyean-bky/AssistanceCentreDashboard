/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.EmptyBorder;

public class EditorBoard extends JFrame {

    private List<String> assistanceTypes;

    public EditorBoard() {
        initializeComponents();
        setResizable(false);
       
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            // Add a window listener to the frame
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Show a JOptionPane when the user clicks the close button
            int choice = JOptionPane.showConfirmDialog(EditorBoard.this,
                    "Are you sure you want to go back to the main page?",
                    "Exit Confirmation",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                // User chose to go back to the main page
                AdminPage jf = new AdminPage();
                jf.show();
                dispose();
            }
                // If the user chose "No" or closed the JOptionPane, do nothing and keep the subpage open
            }
        });
    }

    private void initializeComponents() {
        
        setTitle("Editor Board");
        setDefaultCloseOperation(Search.EXIT_ON_CLOSE);
        
        // Customize the background of the panel
        setSize(500, 500);
        setLocationRelativeTo(null);
        
        // Set the frame icon
        try {
            // Create an ImageIcon from the URL
            URL url = new URL("https://th.bing.com/th/id/OIP.NNnB8HbUoQ91zH1Am383AwHaHa?rs=1&pid=ImgDetMain");
            ImageIcon icon = new ImageIcon(url);
            
            // Set the icon for the Search
            setIconImage(icon.getImage());
        } catch (MalformedURLException e) {
            // Handle the case where the URL is malformed
            System.err.println("Malformed URL: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
        }
        
        JPanel panel = new JPanel();
        // Set background colour
        panel.setBackground(new Color(230, 230, 250));
        
        // System starts
        JButton startButton = new JButton("Start Editor Board");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display method
                handleStartAssistanceCenter();
            }
        });
        
        startButton.setBorder(new EmptyBorder(10,20,10,20));
        startButton.setPreferredSize(new Dimension(200,40));
        
        
        // To make the button at the center
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        
        panel.setLayout(new GridBagLayout());
        panel.add(startButton, gbc);
        
        //Set size of the panel included 3 buttons
        panel.setPreferredSize(new Dimension(300,200));
        
        add(panel, BorderLayout.CENTER);
        setTitle("Editor Board");
        setDefaultCloseOperation(Search.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void handleStartAssistanceCenter() {
        JOptionPane.showMessageDialog(null, "Dear Admin, Welcome to Editor Board!");

        String[]assistanceTypesArray = {"Medical", "Food", "Sanitation", "Shelter", "Education", "Financial", "Infrastructure", 
                    "Psychosocial Support", "Livelihood Support", "Child Protection Services"};
        assistanceTypes = new ArrayList<>(List.of(assistanceTypesArray));
        StringBuilder assistanceMessage = new StringBuilder("Here are the types of assistance we have:\n");
        for (String type : assistanceTypes) {
            assistanceMessage.append("- ").append(type).append("\n");
        }
                
        JOptionPane.showMessageDialog(null, assistanceMessage.toString());
        JOptionPane.showMessageDialog(null, "Here is the page you can modify the assistance type.");
        displayAssistanceTypes();
    }

    
    // Display the function of the button
    private void displayAssistanceTypes() {

        // Add "Edit", "Delete" and "Update" buttons to allow the EditorBoard to modify the assistance types
        JButton editButton = new JButton("Edit");
        JButton deleteButton = new JButton("Delete");
        JButton updateButton = new JButton("Update");

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editAssistanceType();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteAssistanceType();
            }
        });
        
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAssistanceType();                
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(230,230,250));
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);
        
        getContentPane().setBackground(new Color(230,230,250));
        add(buttonPanel, BorderLayout.SOUTH);
        
        // Adjusts the size of the Search to fit its contents
        pack(); 
    }
    
    // EDIT button
    private void editAssistanceType() {
        // Edit the name of assistance type
        String selectedType = (String) JOptionPane.showInputDialog(
                null,"Choose the assistance type to edit:","Edit Assistance Type",JOptionPane.QUESTION_MESSAGE,
                null,assistanceTypes.toArray(),assistanceTypes.get(0)
        );

        if (selectedType != null) {
            String editedType = JOptionPane.showInputDialog(null, "Enter the new name for the assistance type:", 
                    selectedType);
            if (editedType != null && !editedType.trim().isEmpty()) {
                assistanceTypes.set(assistanceTypes.indexOf(selectedType), editedType);
                JOptionPane.showMessageDialog(null,"Changes have been made successfully!");
                System.out.println("Changes have been made successfully!\n");
                
                // Build the message for display
                StringBuilder assistanceMessage = new StringBuilder("Here are the types of assistance we have:\n");
                for (String type : assistanceTypes) {
                    assistanceMessage.append("- ").append(type).append("\n");
                }
                
                // Display the updated list
                JOptionPane.showMessageDialog(null, assistanceMessage.toString());
                displayAssistanceTypes();
            }
        }
    }
    
    // DELETE button
    private void deleteAssistanceType() {
        // Delete an assistance type
        String selectedType = (String) JOptionPane.showInputDialog(
                null,
                "Choose the assistance type to delete:",
                "Delete Assistance Type",
                JOptionPane.QUESTION_MESSAGE,
                null,
                assistanceTypes.toArray(),
                assistanceTypes.get(0));

        if (selectedType != null) {
            assistanceTypes.remove(selectedType);
            JOptionPane.showMessageDialog(null,"Changes have been made successfully!");
            System.out.println("Changes have been made successfully!\n");
            
            // Build the message for display
                StringBuilder assistanceMessage = new StringBuilder("Here are the types of assistance we have:\n");
                for (String type : assistanceTypes) {
                    assistanceMessage.append("- ").append(type).append("\n");
                }
                
                // Display the updated list
                JOptionPane.showMessageDialog(null, assistanceMessage.toString());
            
            displayAssistanceTypes();
        }
    }
    
    // UPDATE button
    private void updateAssistanceType() {
    String updatedType = JOptionPane.showInputDialog(null, "Enter a new assistance type:");

    if (updatedType != null && !updatedType.trim().isEmpty()) {
        assistanceTypes.add(updatedType);
        JOptionPane.showMessageDialog(null, "Changes have been made successfully!");
        System.out.println("Changes have been made successfully!\n");

        // Build the message for display
        StringBuilder assistanceMessage = new StringBuilder("Here are the types of assistance we have:\n");
        for (String type : assistanceTypes) {
            assistanceMessage.append("- ").append(type).append("\n");
        }

        // Display the updated list
        JOptionPane.showMessageDialog(null, assistanceMessage.toString());
        

        // Call displayAssistanceTypes to show the buttons for further actions
        displayAssistanceTypes();
    }
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EditorBoard();
        });
    }
}