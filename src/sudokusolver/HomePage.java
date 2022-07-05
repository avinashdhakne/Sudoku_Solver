
package SudokuSolver;
import SudokuSolver.SudokoSolver;
import  javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HomePage extends  JFrame {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
//        jToggleButton1 = new JToggleButton();
        
        setLocation(325,180);
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HG_sudoku_header.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1.setText("Play");
        jButton1.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jButton1ActionPerformed(evt);
                
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

//        jToggleButton1.setText("Help");
//        jToggleButton1.addActionListener(new ActionListener() {
//            public void actionPerformed( ActionEvent evt) {
//                jToggleButton1ActionPerformed(evt);
//            }
//        });

         GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 800,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jToggleButton1,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
//                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        pack();
    }                      

    private void jButton1ActionPerformed( ActionEvent evt) {
        this.setVisible(false);
        SudokoSolver myFrame=new SudokoSolver();

    }                                        

    private void jToggleButton1ActionPerformed( ActionEvent evt) {                                               

    }                                              

    private void jButton2ActionPerformed( ActionEvent evt) {  
        int a = JOptionPane.showConfirmDialog(null,"Do you want to Exit","selsect",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }                                        

    public static void main(String args[]) {
        
          EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    private  JButton jButton1;
    private  JButton jButton2;
    private  JLabel jLabel1;
//    private  JToggleButton jToggleButton1;

    private static class SudokuSolver {

        public SudokuSolver() {
        }
    }
}