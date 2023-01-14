
package firstjavaform;

import java.util.Set;
    import javax.swing.UIManager;
    import javax.swing.UnsupportedLookAndFeelException;

public class Calculator extends javax.swing.JFrame {
    
   
    public Calculator() {
        initComponents();
    }
    private boolean CommaButtonWasClick = false;
    private  String Op;
    private double Num1;
    private double Num2;
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtn_7 = new javax.swing.JButton();
        jbtn_4 = new javax.swing.JButton();
        jtxt_1 = new javax.swing.JButton();
        jbtn_0 = new javax.swing.JButton();
        jbtn_ac = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn_8 = new javax.swing.JButton();
        jbtn_5 = new javax.swing.JButton();
        jbtn_2 = new javax.swing.JButton();
        jbtn_per = new javax.swing.JButton();
        jbtn_9 = new javax.swing.JButton();
        jbtn_6 = new javax.swing.JButton();
        jbtn_3 = new javax.swing.JButton();
        jbtn_comma = new javax.swing.JButton();
        jbtn_divide = new javax.swing.JButton();
        jbtn_multi = new javax.swing.JButton();
        jbtn_minus = new javax.swing.JButton();
        jbtn_plus = new javax.swing.JButton();
        jbtn_equal = new javax.swing.JButton();
        jtxt_field = new javax.swing.JTextField();
        jbtn_clean = new javax.swing.JButton();
        Result_jlabel = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jButton9.setText("jButton2");

        jButton5.setText("jButton1");
        jButton5.setPreferredSize(new java.awt.Dimension(80, 80));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(370, 610));

        jbtn_7.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_7.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_7.setText("7");
        jbtn_7.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_7ActionPerformed(evt);
            }
        });

        jbtn_4.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_4.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_4.setText("4");
        jbtn_4.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_4ActionPerformed(evt);
            }
        });

        jtxt_1.setBackground(new java.awt.Color(51, 51, 51));
        jtxt_1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jtxt_1.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_1.setText("1");
        jtxt_1.setPreferredSize(new java.awt.Dimension(70, 70));
        jtxt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_1ActionPerformed(evt);
            }
        });

        jbtn_0.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_0.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_0.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_0.setText("0");
        jbtn_0.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_0ActionPerformed(evt);
            }
        });

        jbtn_ac.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_ac.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtn_ac.setText("AC");
        jbtn_ac.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_acActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(204, 204, 204));
        jbtn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtn2.setText("+/-");
        jbtn2.setPreferredSize(new java.awt.Dimension(70, 70));

        jbtn_8.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_8.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_8.setText("8");
        jbtn_8.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_8ActionPerformed(evt);
            }
        });

        jbtn_5.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_5.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_5.setText("5");
        jbtn_5.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_5ActionPerformed(evt);
            }
        });

        jbtn_2.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_2.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_2.setText("2");
        jbtn_2.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_2ActionPerformed(evt);
            }
        });

        jbtn_per.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_per.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtn_per.setText("%");
        jbtn_per.setPreferredSize(new java.awt.Dimension(70, 70));

        jbtn_9.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_9.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_9.setText("9");
        jbtn_9.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_9ActionPerformed(evt);
            }
        });

        jbtn_6.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_6.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_6.setText("6");
        jbtn_6.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_6ActionPerformed(evt);
            }
        });

        jbtn_3.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtn_3.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_3.setText("3");
        jbtn_3.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_3ActionPerformed(evt);
            }
        });

        jbtn_comma.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_comma.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtn_comma.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_comma.setText(".");
        jbtn_comma.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_comma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_commaActionPerformed(evt);
            }
        });

        jbtn_divide.setBackground(new java.awt.Color(255, 159, 26));
        jbtn_divide.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jbtn_divide.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_divide.setText("÷");
        jbtn_divide.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_divideActionPerformed(evt);
            }
        });

        jbtn_multi.setBackground(new java.awt.Color(255, 159, 26));
        jbtn_multi.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jbtn_multi.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_multi.setText("×");
        jbtn_multi.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_multiActionPerformed(evt);
            }
        });

        jbtn_minus.setBackground(new java.awt.Color(255, 159, 26));
        jbtn_minus.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jbtn_minus.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_minus.setText("−");
        jbtn_minus.setToolTipText("");
        jbtn_minus.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_minusActionPerformed(evt);
            }
        });

        jbtn_plus.setBackground(new java.awt.Color(255, 159, 26));
        jbtn_plus.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jbtn_plus.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_plus.setText("+");
        jbtn_plus.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_plusActionPerformed(evt);
            }
        });

        jbtn_equal.setBackground(new java.awt.Color(255, 159, 26));
        jbtn_equal.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jbtn_equal.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_equal.setText("=");
        jbtn_equal.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_equalActionPerformed(evt);
            }
        });

        jtxt_field.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_field.setFont(new java.awt.Font("Times New Roman", 0, 82)); // NOI18N
        jtxt_field.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxt_field.setText("0");
        jtxt_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxt_field.setCaretColor(new java.awt.Color(0, 0, 204));

        jbtn_clean.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_clean.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtn_clean.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_clean.setText("C");
        jbtn_clean.setPreferredSize(new java.awt.Dimension(70, 70));
        jbtn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cleanActionPerformed(evt);
            }
        });

        Result_jlabel.setBackground(new java.awt.Color(0, 0, 0));
        Result_jlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Result_jlabel.setForeground(new java.awt.Color(255, 255, 255));
        Result_jlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxt_field)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtn_ac, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jtxt_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtn_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtn_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtn_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_comma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Result_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(Result_jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtn_per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_comma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jbtn_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxt_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void InputNumber(String Number)
    {
        if (jtxt_field.getText().equals("0"))
        {
            jtxt_field.setText(Number);
        }     
        else
        {
            jtxt_field.setText( jtxt_field.getText()+ Number);
        }
    }
    
    private void jtxt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_1ActionPerformed
       InputNumber ("1");
    }//GEN-LAST:event_jtxt_1ActionPerformed

    private void jbtn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_2ActionPerformed
       InputNumber("2");
    }//GEN-LAST:event_jbtn_2ActionPerformed

    private void jbtn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_3ActionPerformed
       InputNumber("3");
    }//GEN-LAST:event_jbtn_3ActionPerformed

    private void jbtn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_4ActionPerformed
        InputNumber("4");
    }//GEN-LAST:event_jbtn_4ActionPerformed

    private void jbtn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_5ActionPerformed
        InputNumber("5");
    }//GEN-LAST:event_jbtn_5ActionPerformed

    private void jbtn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_6ActionPerformed
        InputNumber("6");
    }//GEN-LAST:event_jbtn_6ActionPerformed

    private void jbtn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_7ActionPerformed
        InputNumber("7");
    }//GEN-LAST:event_jbtn_7ActionPerformed

    private void jbtn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_8ActionPerformed
        InputNumber("8");
    }//GEN-LAST:event_jbtn_8ActionPerformed

    private void jbtn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_9ActionPerformed
        InputNumber("9");
    }//GEN-LAST:event_jbtn_9ActionPerformed

    private void jbtn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_0ActionPerformed
        InputNumber("0");
    }//GEN-LAST:event_jbtn_0ActionPerformed

    private void jbtn_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_acActionPerformed
        jtxt_field.setText("0");
        CommaButtonWasClick = false;
        
    }//GEN-LAST:event_jbtn_acActionPerformed

    private void jbtn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cleanActionPerformed
        if (!jtxt_field.getText().equals("0"))
        {
             String Number = jtxt_field.getText();
             
             if (Number.length() == 1)
             {
                 jtxt_field.setText("0");
             }
             else
             {
             jtxt_field.setText(Number.substring(0, Number.length()-1));
             }    
        }  
    }//GEN-LAST:event_jbtn_cleanActionPerformed

    private void jbtn_commaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_commaActionPerformed
        if (!CommaButtonWasClick)
        {
            jtxt_field.setText( jtxt_field.getText()+ ".");
            CommaButtonWasClick = true;
        }
    }//GEN-LAST:event_jbtn_commaActionPerformed

     private void Operator(String op)
    {
        this.Op = op;
        this.Num1 = Double.parseDouble(jtxt_field.getText());
        Result_jlabel.setText(jtxt_field.getText()+ "" + Op);
        jtxt_field.setText("0");
    }
     
    private void jbtn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_plusActionPerformed
              Operator("+");
    }//GEN-LAST:event_jbtn_plusActionPerformed

    private void jbtn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_minusActionPerformed
              Operator("-");
    }//GEN-LAST:event_jbtn_minusActionPerformed

    private void jbtn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_multiActionPerformed
              Operator("×");
    }//GEN-LAST:event_jbtn_multiActionPerformed

    private void jbtn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_divideActionPerformed
              Operator("÷");
    }//GEN-LAST:event_jbtn_divideActionPerformed

    private void jbtn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_equalActionPerformed
        double Num2 = Double.parseDouble(jtxt_field.getText());
        Result_jlabel.setText(Result_jlabel.getText() + "" + jtxt_field.getText());
        
        switch (Op)
        {
            case "+": {
                 jtxt_field.setText(this.Num1 + Num2 + "");   
            }break;
            
            case "-": {
                 jtxt_field.setText(this.Num1 - Num2 + "");   
            }break;
            
            case "×": {
                 jtxt_field.setText(this.Num1 * Num2 + "");   
            }break;
            
            case "÷": {
                 jtxt_field.setText(this.Num1 / Num2 + "");   
            }break;
            
        }
    }//GEN-LAST:event_jbtn_equalActionPerformed

   
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Result_jlabel;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn_0;
    private javax.swing.JButton jbtn_2;
    private javax.swing.JButton jbtn_3;
    private javax.swing.JButton jbtn_4;
    private javax.swing.JButton jbtn_5;
    private javax.swing.JButton jbtn_6;
    private javax.swing.JButton jbtn_7;
    private javax.swing.JButton jbtn_8;
    private javax.swing.JButton jbtn_9;
    private javax.swing.JButton jbtn_ac;
    private javax.swing.JButton jbtn_clean;
    private javax.swing.JButton jbtn_comma;
    private javax.swing.JButton jbtn_divide;
    private javax.swing.JButton jbtn_equal;
    private javax.swing.JButton jbtn_minus;
    private javax.swing.JButton jbtn_multi;
    private javax.swing.JButton jbtn_per;
    private javax.swing.JButton jbtn_plus;
    private javax.swing.JButton jtxt_1;
    private javax.swing.JTextField jtxt_field;
    // End of variables declaration//GEN-END:variables
}
