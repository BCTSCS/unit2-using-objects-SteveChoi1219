package Notes;
import javax.swing.*;
import java.awt.event.*; // Added this import for ActionListener and ActionEvent

public class NotesApp extends JFrame {
    public JButton addB;
    public JButton deleteB;
    public JTextArea textArea;
    public JTextArea notesArea;

    public NotesApp() {
        setTitle("Notes App");
        setLayout(null); // Set layout to null for absolute positioning
        setSize(600, 600); // Set window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Proper close operation

        addB = new JButton("+");
        deleteB = new JButton("-");
        textArea = new JTextArea();
        notesArea = new JTextArea();

        addB.setBounds(550, 550, 30, 30);
        deleteB.setBounds(510, 550, 30, 30); // Adjusted position slightly
        textArea.setBounds(10, 550, 480, 30); // Adjusted width for better alignment
        notesArea.setBounds(10, 10, 580, 500);

        // Adding ActionListeners
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNote();
            }
        });

        deleteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteNote();
            }
        });

        // Adding components to JFrame
        add(addB);
        add(deleteB);
        add(textArea);
        add(notesArea);

        setVisible(true); // Make the window visible
    }

    // Logic for adding notes
    public void addNote() {
        String note = textArea.getText();
        if (!note.trim().isEmpty()) {
            notesArea.append(note + "\n"); // Append new note to the notes area
            textArea.setText(""); // Clear input area
        }
    }

    // Logic for deleting notes
    public void deleteNote() {
        notesArea.setText(""); // Clear all notes
    }

    public static void main(String[] args) {
        new NotesApp(); // Create and show the NotesApp
    }
}
