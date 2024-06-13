/** Required package class namespace */
package finalprojectcs40s;

/**
 * WelcomeForm - the form to show the greeting to the user
 *
 * @author m.galinsky
 * @since May 20, 2024
 */
public class WelcomeForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public WelcomeForm() {
        initComponents();
        // Set random color for the form and set labels
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl2To = new javax.swing.JLabel();
        lbl3Welcome = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        lbl2To.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl2To.setText("TO");

        lbl3Welcome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl3Welcome.setText("WELCOME");

        lbl4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl4.setText("4");

        lbl5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl5.setText("5");

        lbl6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl6.setText("6");

        lbl7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl7.setText("7");

        lbl8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl8.setText("8");

        lbl9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl9.setText("9");

        lbl10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl10.setText("10");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Hero Battle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(lbl2To)
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(lbl3Welcome)
                    .addContainerGap(141, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(lbl4)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(lbl5)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(lbl6)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(lbl7)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(lbl8)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(lbl9)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(lbl10)
                    .addContainerGap(206, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(lbl2To)
                .addGap(147, 147, 147))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lbl3Welcome)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lbl4)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lbl5)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lbl6)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lbl7)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lbl8)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lbl9)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lbl10)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Sets the 1st label to be displayed and the random background color
     */
    public void lbl1() {
        Controller.randomColor(this);
        lblTitle.setVisible(true);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 2nd label to be displayed and the random background color
     */
    public void lbl2() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(true);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 3rd label to be displayed and the random background color
     */
    public void lbl3() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(true);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 4th label to be displayed and the random background color
     */
    public void lbl4() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(true);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 5th label to be displayed and the random background color
     */
    public void lbl5() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(true);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 6th label to be displayed and the random background color
     */
    public void lbl6() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(true);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 7th label to be displayed and the random background color
     */
    public void lbl7() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(true);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 8th label to be displayed and the random background color
     */
    public void lbl8() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(true);
        lbl9.setVisible(false);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 9th label to be displayed and the random background color
     */
    public void lbl9() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(true);
        lbl10.setVisible(false);
    }

    /**
     * Sets the 10th label to be displayed and the random background color
     */
    public void lbl10() {
        Controller.randomColor(this);
        lblTitle.setVisible(false);
        lbl2To.setVisible(false);
        lbl3Welcome.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
        lbl10.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2To;
    private javax.swing.JLabel lbl3Welcome;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
