package Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class DynamicPanelList {

    public static void main(String[] args) {
        new DynamicPanelList();
    }

    public DynamicPanelList() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                }

                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TestPane());
                frame.pack();
                frame.setSize(new Dimension(420, 600));
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        private JPanel mainList;
        public int i = 1;

        public TestPane() {
            setLayout(new BorderLayout());

            mainList = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.weightx = 1;
            gbc.weighty = 1;
            mainList.add(new JPanel(), gbc);

            add(new JScrollPane(mainList));
            JButton add = new JButton("Add");
            add.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    JPanel panel = new JPanel();
//                    panel.add(new JLabel("Hello"));
//                    panel.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
                JLabel jLabel1 = new javax.swing.JLabel();
                JButton jButton1 = new javax.swing.JButton();
                jLabel1.setText("jLabel"+i); 
                jButton1.setText("jButton"+i);
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {   System.out.println("alo of "+jButton1.getText());  }   });
                i++;
                JPanel pan = new JPanel();
                javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
                        pan.setLayout(panLayout);
                        panLayout.setHorizontalGroup(
                            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(112, 112, 112))
                        );
                        panLayout.setVerticalGroup(
                            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addContainerGap(36, Short.MAX_VALUE))
                        );
                        
                        
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.gridwidth = GridBagConstraints.REMAINDER;
                    gbc.weightx = 1;
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    mainList.add(pan, gbc, 0);

                    validate();
                    repaint();
                }
            });

            add(add, BorderLayout.SOUTH);

        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 100);
        }
    }
}