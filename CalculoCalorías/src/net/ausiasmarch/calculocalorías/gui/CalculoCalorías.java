package net.ausiasmarch.calculocalorías.gui;
import net.ausiasmarch.calculocalorías.modelo.*;
import net.ausiasmarch.common.Convert;

/**
 *
 * @author Julián_Martinez
 */
public class CalculoCalorías extends javax.swing.JFrame {
    
    private final MetabolismoBasal metabolismoBasal;
    
    public CalculoCalorías() {
        initComponents();
        
        metabolismoBasal = new MetabolismoBasal();
        
        jComboBoxActividad.addItem(TipoActividad.SEDENTARIA.toString());
        jComboBoxActividad.addItem(TipoActividad.LIGERA.toString());
        jComboBoxActividad.addItem(TipoActividad.MODERADA.toString());
        jComboBoxActividad.addItem(TipoActividad.INTENSA.toString());
        jComboBoxActividad.addItem(TipoActividad.MUY_INTENSA.toString());
        
        iniciar();
        
        jPanelListaErrores.setVisible(false);
    }

    private void iniciar(){
        setSize(619, 425);
        setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxActividad = new javax.swing.JComboBox<>();
        jButtonCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTasaMBasal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCalorias = new javax.swing.JTextField();
        jPanelListaErrores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListaErrores = new javax.swing.JTextArea();
        jButtonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo de calorías");
        setBackground(new java.awt.Color(255, 255, 204));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Género:");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Peso (en kg) :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Altura (en cm) :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Edad");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Actividad:");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setText("Metabolismo Basal");

        jTextFieldTasaMBasal.setEditable(false);
        jTextFieldTasaMBasal.setBackground(new java.awt.Color(51, 102, 255));
        jTextFieldTasaMBasal.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTasaMBasal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setText("Calorías para mantener el peso");

        jTextFieldCalorias.setEditable(false);
        jTextFieldCalorias.setBackground(new java.awt.Color(51, 102, 255));
        jTextFieldCalorias.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCalorias.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanelListaErrores.setName(""); // NOI18N

        jTextAreaListaErrores.setEditable(false);
        jTextAreaListaErrores.setBackground(new java.awt.Color(255, 102, 51));
        jTextAreaListaErrores.setColumns(20);
        jTextAreaListaErrores.setLineWrap(true);
        jTextAreaListaErrores.setRows(5);
        jTextAreaListaErrores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)), "Se han encontrado los siguientes errores:"));
        jScrollPane1.setViewportView(jTextAreaListaErrores);

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListaErroresLayout = new javax.swing.GroupLayout(jPanelListaErrores);
        jPanelListaErrores.setLayout(jPanelListaErroresLayout);
        jPanelListaErroresLayout.setHorizontalGroup(
            jPanelListaErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaErroresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanelListaErroresLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButtonCerrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelListaErroresLayout.setVerticalGroup(
            jPanelListaErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaErroresLayout.createSequentialGroup()
                .addComponent(jButtonCerrar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPeso)
                                        .addComponent(jTextFieldAltura)
                                        .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(116, 116, 116))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(14, 14, 14)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldCalorias)
                                    .addComponent(jTextFieldTasaMBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelListaErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldTasaMBasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButtonCalcular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanelListaErrores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        
        // Declaramos la variables de entrada
        double peso;
        int altura;
        int edad;
        
        // Declaramos las variables de salida provenientes de "MetabolismoBasal"
        double tmb;     // tmb = Tasa de metabolismo basal
        double calorias;
        
        // Declaramos el contenedor de strings con los errores de salida
        StringBuilder sb = new StringBuilder();
        
        // Limpiamos la salida de los resultados
        jTextFieldTasaMBasal.setText("");
        jTextFieldCalorias.setText("");
        
        // Obtenemos y validamos los datos de entrada
        
        // Si el peso no es un número válido
        if (!Convert.isValidDouble(jTextFieldPeso.getText())) {
            sb.append("  - Peso no válido.\n");
        }
        
        // Si la altura no es un número válido
        if (!Convert.isValidInt(jTextFieldAltura.getText())) {
            sb.append("  - Altura no válida.\n");
        }
        
        // Si la edad no es un número válido
        if (!Convert.isValidInt(jTextFieldEdad.getText())) {
            sb.append("  - Edad no válida.\n");
        }
        
        if (sb.length() > 0) {
            setSize(630, 640);
            jPanelListaErrores.setVisible(true);
            jTextAreaListaErrores.setText("");
            jTextAreaListaErrores.append(sb.toString());
            jTextAreaListaErrores.setCaretPosition(0);
            return;
        }
        
        // Hacemos las conversiones de datos numéricos
        peso = Convert.parseDouble(jTextFieldPeso.getText());
        altura = Convert.parseInt(jTextFieldAltura.getText());
        edad = Convert.parseInt(jTextFieldEdad.getText());
        
        // Pasamos los datos de entrada a MetabolismoBasal
        metabolismoBasal.setPeso(peso);
        metabolismoBasal.setAltura(altura);
        metabolismoBasal.setEdad(edad);
        
        // Pasamos las opciones elegidas en los desplegables a MetabolismoBasal
        metabolismoBasal.setGenero(jComboBoxGenero.getSelectedItem().toString());
        metabolismoBasal.setActividad(jComboBoxActividad
                .getSelectedItem().toString());
        
        // Comprobamos si los datos para el cálculo son correctos
        if (metabolismoBasal.validate() == false) {
            sb.append(metabolismoBasal.getMensaje());
            setSize(630, 640);
            jPanelListaErrores.setVisible(true);
            jTextAreaListaErrores.setText("");
            jTextAreaListaErrores.append(sb.toString());
            jTextAreaListaErrores.setCaretPosition(0);
            return;
        }
        
        
        // En este punto, todo está correcto.
        // Procedemos a mostrar los cálculos
        
        // Obtenemos los cálculos de "MetabolismoBasal"
        tmb = metabolismoBasal.getMetabolismoBasal();
        calorias = metabolismoBasal.getCaloriasMantenerPeso();
        
        // Mostramos el resultado con el formato correcto
        jTextFieldTasaMBasal.setText(Convert.format(tmb, 2));
        jTextFieldCalorias.setText(Convert.format(calorias, 2));
        
        // Limpiamos el listado de errores y lo ocultamos
        setSize(619, 425);
        jTextAreaListaErrores.setText("");
        jPanelListaErrores.setVisible(false);
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        setSize(619, 425);
        jPanelListaErrores.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(CalculoCalorías.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoCalorías.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoCalorías.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoCalorías.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoCalorías().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JComboBox<String> jComboBoxActividad;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelListaErrores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaListaErrores;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldCalorias;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldTasaMBasal;
    // End of variables declaration//GEN-END:variables
}
