package Lesson_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamGUI extends JFrame {
    private JLabel questionLabel;
    private JLabel choiceLabel;
    private JButton submitButton;
    private JComboBox<String> choiceComboBox;
    private JTextArea resultTextArea;

    private String[] exam = {
            " ",
            "Mən GOL vurduğum zaman sevinmirəm,sadecə işimi görürəm.Poçtalyon sizə məktubu çatdıran zaman sevinirmi?" +
                    " Deyən futbolçu kimdir? ",
            "İtaliyada yerləşən bu stadion iki ada malikdir. 1-ci adı San Siro , 2-ci adı isə Giuseppe Meazzadır." +
                    " Bu stadion hansı 2 kluba məxsusdur ",
            "Almaniya-Azərbaycan oyunu zamanı nəhəng qapıçı Manuel Peter Neuerə künc zərbəsindən birbaşa GOL vuran " +
                    "oyunçumuzun adı nədir?",
            "Real Madrid və Barcelonada oynayıb.Ləqəbi \"The Maradona of the Carpathiansdır\" ." +
                    " \"Sağ ayağına kitab yazılar,son sətrinə solaxay idi cümlə əlavə olunar\".Söhbət hansı futbolçudan gedir "
    };

    private int correctCount = 0;
    private int wrongCount = 0;

    public ExamGUI() {
        setTitle("İmtahan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        choiceLabel = new JLabel("Bir bilet seçin:");
        add(choiceLabel);

        choiceComboBox = new JComboBox<>(new String[]{"", "1", "2", "3", "4"});
        add(choiceComboBox);

        submitButton = new JButton("Təsdiqlə");
        add(submitButton);

        resultTextArea = new JTextArea(20, 30);
        resultTextArea.setEditable(false);
        add(resultTextArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = choiceComboBox.getSelectedIndex();
                if (choice >= 1 && choice <= 4) {
                    String question = exam[choice];
                    String[] options = getOptions(choice);
                    int answer = JOptionPane.showOptionDialog(null, question, "Sual", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options);

                    if ((choice == 1 && answer == 1) || (choice == 2 && answer == 0) || (choice == 3 && answer == 0) || (choice == 4 && answer == 1)) {
                        correctCount++;
                        resultTextArea.setText("Təbriklər siz doğru cavabı seçib imtahandan uğurla keçdiniz");
                        resultTextArea.setForeground(Color.GREEN);
                        resultTextArea.setFont(resultTextArea.getFont().deriveFont(Font.BOLD, resultTextArea.getFont().getSize() + 2));
                    } else {
                        wrongCount++;
                        resultTextArea.setText("Yanlış cavab.Siz imtahandan kəsildiniz.");
                        resultTextArea.setForeground(Color.RED);
                        resultTextArea.setFont(resultTextArea.getFont().deriveFont(Font.BOLD, resultTextArea.getFont().getSize() + 2));
                    }

                } else {
                    resultTextArea.setText("Yanlış bilet nömrəsi");
                }
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private String[] getOptions(int choice) {
        if (choice == 1) {
            return new String[]{"Robert Lewandowski", "Mario Balotelli"};
        } else if (choice == 2) {
            return new String[]{"İnter və Milan", "Juventus və Fiorentina"};
        } else if (choice == 3) {
            return new String[]{"Vaqif Cavadov", "Əfran İsmayılov"};
        } else if (choice == 4) {
            return new String[]{"Andriy Mykolayovych Shevchenko", "Gheorghe Hagi"};
        } else {
            return new String[]{};
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExamGUI();
            }
        });
    }
}
