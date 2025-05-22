

public class CurrencyConverter extends javax.swing.JFrame {

    public CurrencyConverter() {
        initComponents();
        setSize(480,600);             // Set your preferred window size
        setLocationRelativeTo(null);   // Center it on screen
       setResizable(false);


    }
    private void initComponents() {

        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        choiceFrom = new javax.swing.JComboBox();
        choiceTo = new javax.swing.JComboBox();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        title.setFont(new java.awt.Font("Times New Roman", 1, 48));
        title.setText("Currency Converter");
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jButton1.setText("CONVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel1.setText("Enter Amount ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel2.setText("Convert From");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel3.setText("Convert To");

        input.setFont(new java.awt.Font("Times New Roman", 0, 18));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        choiceFrom.setFont(new java.awt.Font("Times New Roman", 1, 18));
        choiceFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR", "USD", "EUR", "CAD", "JPY", "CNY"}));
        choiceFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceFromItemStateChanged(evt);
            }
        });

        choiceTo.setFont(new java.awt.Font("Times New Roman", 1, 18));
        choiceTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR", "USD", "EUR", "CAD", "JPY", "CNY"}));
        choiceTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceToItemStateChanged(evt);
            }
        });

        output.setFont(new java.awt.Font("Times New Roman", 1, 24));
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
//                        .addComponent(title)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                                        .addComponent(jLabel1)
//                                        .addComponent(jLabel2)
//                                        .addComponent(jLabel3))
//                                .addGap(20)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(choiceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
//        );
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(title)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(choiceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34)
                                .addComponent(title)
                                .addGap(50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(choiceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32)
                                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null); // This centers the JFrame on the screen
    }



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Parse the input amount
            double amount = Double.parseDouble(input.getText());

            // Get selected currencies
            String fromCurrency = choiceFrom.getSelectedItem().toString();
            String toCurrency = choiceTo.getSelectedItem().toString();

            if (fromCurrency.equals(toCurrency)) {
                // Same currency, no conversion needed
                output.setText(amount + " " + fromCurrency + " = " + amount + " " + toCurrency);
            } else {
                // Fetch live exchange rate
                double rate = ExchangeRateFetcher.getRate(fromCurrency, toCurrency);

                if (rate == -1) {
                    // Error fetching rate
                    output.setText("Error fetching exchange rate. Please try again.");
                } else {
                    // Calculate conversion and display
                    double result = amount * rate;
                    output.setText(String.format("%.2f %s = %.2f %s", amount, fromCurrency, result, toCurrency));
                }
            }
        } catch (NumberFormatException e) {
            // Handle invalid input amount
            output.setText("Please enter a valid numeric amount.");
        }
    }

    private void inputActionPerformed(java.awt.event.ActionEvent evt) { }

    private void choiceFromItemStateChanged(java.awt.event.ItemEvent evt) { }
    private void choiceToItemStateChanged(java.awt.event.ItemEvent evt) { }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JComboBox choiceFrom;
    private javax.swing.JComboBox choiceTo;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel output;
    private javax.swing.JLabel title;
}

