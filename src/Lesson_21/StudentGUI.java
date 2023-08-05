package Lesson_21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGUI extends JFrame {
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel scoreLabel;
    private JTextField scoreField;
    private JButton displayButton;
    private JButton promoteButton;

    private Student student;

    public StudentGUI() {
        setTitle("Student Grade");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 50, 20);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(80, 20, 150, 20);
        add(nameField);

        scoreLabel = new JLabel("Score:");
        scoreLabel.setBounds(20, 50, 50, 20);
        add(scoreLabel);

        scoreField = new JTextField();
        scoreField.setBounds(80, 50, 150, 20);
        add(scoreField);

        displayButton = new JButton("Show");
        displayButton.setBounds(20, 80, 120, 30);
        add(displayButton);

        promoteButton = new JButton("Promote ");
        promoteButton.setBounds(150, 80, 120, 30);
        add(promoteButton);

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                double score = Double.parseDouble(scoreField.getText());
                Grade grade = new Score(score).convertToGrade();
                student = new Student(name, grade);
                student.displayGrade();
            }
        });

        promoteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (student != null) {
                    student.promoteStudent();
                    student.displayGrade();
                } else {
                    JOptionPane.showMessageDialog(null, "No student information available!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentGUI gui = new StudentGUI();
                gui.setVisible(true);
            }
        });
    }
}
