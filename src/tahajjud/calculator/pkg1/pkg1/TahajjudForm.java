/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahajjud.calculator;

/**
 *
 * @author user
 */
public class TahajjudForm extends javax.swing.JFrame 
{
    
    public TahajjudForm() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        labInit = new javax.swing.JLabel();
        labFin = new javax.swing.JLabel();
        labTitle = new javax.swing.JLabel();
        spInitHr = new javax.swing.JSpinner();
        labColon1 = new javax.swing.JLabel();
        spInitMin = new javax.swing.JSpinner();
        labColon2 = new javax.swing.JLabel();
        spFinMin = new javax.swing.JSpinner();
        spFinHr = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        labRes = new javax.swing.JLabel();
        labPM = new javax.swing.JLabel();
        labAM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labInit.setText("Maghrib Time:");

        labFin.setText("Tomorrow's Fajr Time:");

        labTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("Tahajjud Start Time Calculator");

        spInitHr.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));

        labColon1.setText(":");

        spInitMin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        labColon2.setText(":");

        spFinMin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        spFinHr.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));

        btnCalc.setText("Calculate");
        btnCalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcMouseClicked(evt);
            }
        });

        labRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labRes.setText("Results: ");

        labPM.setText("pm");

        labAM.setText("am");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labFin)
                            .addComponent(labInit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spInitHr, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labColon1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spInitMin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spFinHr, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labColon2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spFinMin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labPM)
                            .addComponent(labAM))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labInit)
                    .addComponent(spInitHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labColon1)
                    .addComponent(spInitMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labPM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labFin)
                    .addComponent(spFinHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labColon2)
                    .addComponent(spFinMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labAM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labRes)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcMouseClicked
        int initHr, initMin, finHr, finMin;
        
        initHr = (int) spInitHr.getValue()+12;
        initMin = (int) spInitMin.getValue();
        finHr = (int) spFinHr.getValue()+24;
        finMin = (int) spFinMin.getValue();
        
        int tahajjudTime = calcTahajjud(toSerial(initHr,initMin),toSerial(finHr,finMin));
        String tHr = new String();
        String tMn = new String();
        
        if(getHr(tahajjudTime) == 0)
        {
            tHr = "12";
        }
        else
        {
            tHr = Integer.toString(getHr(tahajjudTime));
        }
        
        if(getMin(tahajjudTime)<10)
        {
            tMn = "0"+Integer.toString(getMin(tahajjudTime));
        }
        else
        {
            tMn = Integer.toString(getMin(tahajjudTime));
        }
        
        labRes.setText("Tahajjud is at " + tHr + ":"+ tMn +" am.");
        //labTemp.setText("Serial:init,fin,tah"+toSerial(initHr,initMin)+","+toSerial(finHr,finMin)+","+tahajjudTime);
    }//GEN-LAST:event_btnCalcMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TahajjudForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TahajjudForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TahajjudForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TahajjudForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TahajjudForm().setVisible(true);
            }
        });
    }
    
    
    
    int calcTahajjud(int init, int fin)
    {
        int diff3 = (fin - init)/3;
        return ((init + diff3 + diff3)%1440);
    }
    
    int toSerial(int hr, int mn)
    {
        return (hr*60 + mn);
    }
    
    int getHr (int n)
    {
        return (n/60);
    }
    
    int getMin (int n)
    {
        return (n%60);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalc;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JLabel labAM;
    private javax.swing.JLabel labColon1;
    private javax.swing.JLabel labColon2;
    private javax.swing.JLabel labFin;
    private javax.swing.JLabel labInit;
    private javax.swing.JLabel labPM;
    public javax.swing.JLabel labRes;
    private javax.swing.JLabel labTitle;
    public javax.swing.JSpinner spFinHr;
    public javax.swing.JSpinner spFinMin;
    public javax.swing.JSpinner spInitHr;
    public javax.swing.JSpinner spInitMin;
    // End of variables declaration//GEN-END:variables
}
