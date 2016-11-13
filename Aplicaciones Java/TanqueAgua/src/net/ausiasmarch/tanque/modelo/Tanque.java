package net.ausiasmarch.tanque.modelo;

/**
 * Clase que representa un Tanque de agua
 * @author  Pixel_Zer0
 */
public class Tanque extends javax.swing.JPanel {

   EstadoTanque estado;
    /**
     * Crea un tanque de agua
     */
    public Tanque() {
        initComponents();
        
        estado = EstadoTanque.VACIO;
        jLabelVacio.setVisible(true);
        jLabelMedio.setVisible(false);
        jLabelLleno.setVisible(false);
    }
    
    public EstadoTanque getEstado(){
        return estado;
    }
    
    public void llenarMedio() {
        
        switch (getEstado()) {
            case VACIO:
                estado = EstadoTanque.MEDIO;
                jLabelVacio.setVisible(false);
                jLabelMedio.setVisible(true);
                break;
            case MEDIO:
                estado = EstadoTanque.LLENO;
                jLabelMedio.setVisible(false);
                jLabelLleno.setVisible(true);
            case LLENO:
        }
    }
    
    public void vaciarMedio() {
        
        switch (getEstado()) {
            case LLENO:
                estado = EstadoTanque.MEDIO;
                jLabelLleno.setVisible(false);
                jLabelMedio.setVisible(true);
                break;
            case MEDIO:
                estado = EstadoTanque.VACIO;
                jLabelMedio.setVisible(false);
                jLabelVacio.setVisible(true);
            case VACIO:
        }
    }

    
     /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLleno = new javax.swing.JLabel();
        jLabelMedio = new javax.swing.JLabel();
        jLabelVacio = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Lleno.png"))); // NOI18N
        add(jLabelLleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Medio.png"))); // NOI18N
        add(jLabelMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Vacio.png"))); // NOI18N
        add(jLabelVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLleno;
    private javax.swing.JLabel jLabelMedio;
    private javax.swing.JLabel jLabelVacio;
    // End of variables declaration//GEN-END:variables
}