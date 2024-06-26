/** Required package class namespace */
package finalprojectcs40s;

/** Required API imports */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * Countdown - Begins the countdown to the start of the game
 *
 * @author m.galinsky
 * @since May 20, 2024
 */
public class Countdown extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public Countdown() {
        initComponents();
//        Controller.randomColor(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBegin = new javax.swing.JLabel();
        comboSec = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lblBegin.setText("When would you like to begin?");

        comboSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 seconds", "5 seconds", "10 seconds" }));
        comboSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSecActionPerformed(evt);
            }
        });
        comboSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboSecKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblBegin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(comboSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblBegin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSecActionPerformed
        comboClick();
    }//GEN-LAST:event_comboSecActionPerformed

    private void comboSecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboSecKeyPressed
        comboClick();
    }//GEN-LAST:event_comboSecKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        comboClick();
    }//GEN-LAST:event_formKeyPressed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboSec;
    private javax.swing.JLabel lblBegin;
    // End of variables declaration//GEN-END:variables

    private int timerCount;
    private Timer timer;

    /**
     * Determines the number of seconds to display the form, sets the timer
     */
    private void comboClick() {
        // Get user input from the combo box
        Object object = comboSec.getSelectedItem();
        // Convert input to a string
        String objectAsString = object.toString();
        // Find the space in the user input
        int locationOfSpace = objectAsString.indexOf(" ");
        // Pull (parse) out the numeric value from the input
        String numberPart = objectAsString.substring(0, locationOfSpace);
        int count = Integer.parseInt(numberPart);       // Convert to integer
        int end = -1;                                   // Set end value
        Controller.welcomeForm = new WelcomeForm();     // Build form
        Controller.welcomeForm.setVisible(true);        // Show form
        Controller.countdown.setVisible(false);         // Hide this form
        timerCount = count;                             // For timing
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counting(end);                          // Call timer action
            }
        });
        timer.start();                      // Build and start timer
    }
    
    /**
     * Method to be used by the time to change the welcome form 
     *
     * @param end the variable that ends the timer
     */
    public void counting(int end) {
        // Check if the end of time has been reached
        if (timerCount == end) {
            timer.stop();                               // Stop timer
            Controller.welcomeForm.setVisible(false);   // Hide welcome form
            Controller.countdown.dispose();             // Dispose of this form
            Controller.welcomeForm.dispose();           // Dispose welcome form
            Controller.mainUI = new MainUI();           // Build main UI
            Controller.mainUI.initialize();             // Show main UI
        } 
        else {                                          // Keep timer running
            if (timerCount == 1) {
                Controller.welcomeForm.lbl1();          // Display various
            } else if (timerCount == 2) {               // labels on welcome
                Controller.welcomeForm.lbl2();          // form
            } else if (timerCount == 3) {
                Controller.welcomeForm.lbl3();
            } else if (timerCount == 4) {
                Controller.welcomeForm.lbl4();
            } else if (timerCount == 5) {
                Controller.welcomeForm.lbl5();
            } else if (timerCount == 6) {
                Controller.welcomeForm.lbl6();
            } else if (timerCount == 7) {
                Controller.welcomeForm.lbl7();
            } else if (timerCount == 8) {
                Controller.welcomeForm.lbl8();
            } else if (timerCount == 9) {
                Controller.welcomeForm.lbl9();
            } else if (timerCount == 10) {
                Controller.welcomeForm.lbl10();
            }
            timerCount--;                               // Decrease count
        }
    }
    
}
