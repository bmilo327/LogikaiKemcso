
package main;

import javax.swing.Icon;
import javax.swing.JButton;


public class Jatek extends javax.swing.JFrame {

    public Jatek() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblLeiras = new javax.swing.JLabel();
        btn1_1 = new javax.swing.JButton();
        btn1_2 = new javax.swing.JButton();
        btn1_3 = new javax.swing.JButton();
        btn1_4 = new javax.swing.JButton();
        btn2_1 = new javax.swing.JButton();
        btn2_2 = new javax.swing.JButton();
        btn2_3 = new javax.swing.JButton();
        btn2_4 = new javax.swing.JButton();
        btn3_2 = new javax.swing.JButton();
        btn3_3 = new javax.swing.JButton();
        btn4_1 = new javax.swing.JButton();
        btn3_4 = new javax.swing.JButton();
        btn3_1 = new javax.swing.JButton();
        btn4_2 = new javax.swing.JButton();
        btn4_3 = new javax.swing.JButton();
        btn4_4 = new javax.swing.JButton();
        lblKivalasztva = new javax.swing.JLabel();
        lblLepesSzam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logikai játék");
        setResizable(false);

        lblLeiras.setText("Válaszd ki az egyik oszlop legfelső elemét!");

        btn1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kek.png"))); // NOI18N
        btn1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_2ActionPerformed(evt);
            }
        });

        btn1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/piros.png"))); // NOI18N

        btn1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/zold.png"))); // NOI18N

        btn2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/zold.png"))); // NOI18N
        btn2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_2ActionPerformed(evt);
            }
        });

        btn2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/piros.png"))); // NOI18N

        btn2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/zold.png"))); // NOI18N

        btn3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/piros.png"))); // NOI18N
        btn3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_2ActionPerformed(evt);
            }
        });

        btn3_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kek.png"))); // NOI18N

        btn3_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kek.png"))); // NOI18N

        btn4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_4ActionPerformed(evt);
            }
        });

        lblKivalasztva.setText("Kiválasztva: -");

        lblLepesSzam.setText("Lépések száma: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn3_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblLeiras)
                    .addComponent(lblKivalasztva)
                    .addComponent(lblLepesSzam))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn1_1, btn1_2, btn1_3, btn1_4, btn2_1, btn2_2, btn2_3, btn2_4, btn3_1, btn3_2, btn3_3, btn3_4, btn4_1, btn4_2, btn4_3, btn4_4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLeiras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1_4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn3_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3_4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn2_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2_4)))))
                .addGap(18, 18, 18)
                .addComponent(lblKivalasztva)
                .addGap(18, 18, 18)
                .addComponent(lblLepesSzam)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn1_1, btn1_2, btn1_3, btn1_4, btn2_1, btn2_2, btn2_3, btn2_4, btn3_1, btn3_2, btn3_3, btn3_4, btn4_1, btn4_2, btn4_3, btn4_4});

        jTabbedPane1.addTab("Játék", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Megoldás", jPanel2);

        jMenu1.setText("Program");

        jMenuItem4.setText("Új játék");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

        jMenuItem1.setText("Mentés");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Betöltés");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Kilépés");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    JButton aktivGomb = null;
    JButton elozoGomb = null;
    String aktiv = "";
    int klikk = 0;
    /*számozás: oszlop_sor*/
    private void btn1_1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn1_1;
        gombKezelo(btn1_1);
    }
    
    private void btn1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_2ActionPerformed
        aktivGomb = btn1_2;
        gombKezelo(btn1_2);
    }//GEN-LAST:event_btn1_2ActionPerformed
    
    private void btn1_3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn1_3;
        gombKezelo(btn1_3);
    }
    
    private void btn1_4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn1_4;
        gombKezelo(btn1_4);
    }
    
    private void btn2_1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn2_1;
        gombKezelo(btn2_1);
    }
    
    private void btn2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_2ActionPerformed
        aktivGomb = btn2_2;
        gombKezelo(btn2_2);
    }//GEN-LAST:event_btn2_2ActionPerformed

    private void btn2_3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn2_3;
        gombKezelo(btn2_3);
    }
    
    private void btn2_4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn2_4;
        gombKezelo(btn2_4);
    }
    
    private void btn3_1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn3_1;
        gombKezelo(btn3_1);
    }
    
    private void btn3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_2ActionPerformed
        aktivGomb = btn3_2;
        gombKezelo(btn3_2);
    }//GEN-LAST:event_btn3_2ActionPerformed

    private void btn3_3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn3_3;
        gombKezelo(btn3_3);
    }
    
    private void btn3_4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        aktivGomb = btn3_4;
        gombKezelo(btn3_4);
    }
    
    private void gombKezelo(JButton gomb){                                       
        Icon ikon = gomb.getIcon();
        if(ikon != null){
            String szoveg = ikon.toString();
            char elsoBetu = szoveg.substring(szoveg.lastIndexOf("/") + 1).charAt(0);
            aktiv = elsoBetu+"";
            String szin = "";
            lblLeiras.setText("Jelöld, hogy hova rakod!");
            if (aktiv.equals("k")){
                szin = "kék";
            }else if (aktiv.equals("p")){
                szin = "piros";
            }else if (aktiv.equals("z")){
                szin = "zöld";
            }
            elozoGomb = gomb;
            lblKivalasztva.setText("Kiválsztva: " + szin);
            klikk++;
            lblLepesSzam.setText("Lépések száéma: " + klikk);
        }else{
            if(aktiv.equals("k")){
                gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kek.png")));
            }else if(aktiv.equals("z")){
                gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/zold.png")));
            }else if(aktiv.equals("p")){
                gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/piros.png")));
            }
            aktiv = "";
            elozoGomb.setIcon(null);
        }
    }
        
    private void btn4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_4ActionPerformed
        aktivGomb = btn4_4;
        gombKezelo(aktivGomb);
        
        
    }//GEN-LAST:event_btn4_4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jatek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1_1;
    private javax.swing.JButton btn1_2;
    private javax.swing.JButton btn1_3;
    private javax.swing.JButton btn1_4;
    private javax.swing.JButton btn2_1;
    private javax.swing.JButton btn2_2;
    private javax.swing.JButton btn2_3;
    private javax.swing.JButton btn2_4;
    private javax.swing.JButton btn3_1;
    private javax.swing.JButton btn3_2;
    private javax.swing.JButton btn3_3;
    private javax.swing.JButton btn3_4;
    private javax.swing.JButton btn4_1;
    private javax.swing.JButton btn4_2;
    private javax.swing.JButton btn4_3;
    private javax.swing.JButton btn4_4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblKivalasztva;
    private javax.swing.JLabel lblLeiras;
    private javax.swing.JLabel lblLepesSzam;
    // End of variables declaration//GEN-END:variables
}
