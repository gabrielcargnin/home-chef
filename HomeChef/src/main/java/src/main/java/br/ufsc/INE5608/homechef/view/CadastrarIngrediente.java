/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.br.ufsc.INE5608.homechef.view;

import src.main.java.br.ufsc.INE5608.homechef.controller.ControladorIngrediente;
import src.main.java.br.ufsc.INE5608.homechef.dto.IngredienteDTO;
import src.main.java.br.ufsc.INE5608.homechef.filter.DoubleFilter;
import src.main.java.br.ufsc.INE5608.homechef.filter.IntegerFilter;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.util.Enumeration;

/**
 * @author Gabriel
 */
public class CadastrarIngrediente extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarIngrediente1
     */
    public CadastrarIngrediente() {
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

        radioGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ingredienteLabel = new javax.swing.JLabel();
        ingredienteTextField = new javax.swing.JTextField();
        unidadeLabel = new javax.swing.JLabel();
        gramaRadio = new javax.swing.JRadioButton();
        quilogramaRadio = new javax.swing.JRadioButton();
        mililitroRadio = new javax.swing.JRadioButton();
        cancelaBtn = new javax.swing.JButton();
        salvaBtn = new javax.swing.JButton();
        litroRadio = new javax.swing.JRadioButton();
        precoLabel = new javax.swing.JLabel();
        unidadeRadio = new javax.swing.JRadioButton();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeTextField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        precoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ingredienteLabel.setText("Ingrediente:");

        unidadeLabel.setText("Unidade:");

        radioGroup.add(gramaRadio);
        gramaRadio.setMnemonic('k');
        gramaRadio.setText("Grama");

        radioGroup.add(quilogramaRadio);
        quilogramaRadio.setText("Quilograma");

        radioGroup.add(mililitroRadio);
        mililitroRadio.setText("Mililitro");

        cancelaBtn.setText("Cancela");
        cancelaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaBtnActionPerformed(evt);
            }
        });

        salvaBtn.setText("Salva");
        salvaBtn.setMaximumSize(new java.awt.Dimension(71, 23));
        salvaBtn.setMinimumSize(new java.awt.Dimension(71, 23));
        salvaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaBtnActionPerformed(evt);
            }
        });

        radioGroup.add(litroRadio);
        litroRadio.setText("Litro");

        precoLabel.setText("Preço:");

        radioGroup.add(unidadeRadio);
        unidadeRadio.setText("Unidade");

        quantidadeLabel.setText("Quantidade:");

        PlainDocument documentQuantidade = (PlainDocument) quantidadeTextField.getDocument();
        documentQuantidade.setDocumentFilter(new IntegerFilter());

        idLabel.setText("Id:");

        idTextField.setEditable(false);

        PlainDocument documentPreco = (PlainDocument) precoTextField.getDocument();
        documentPreco.setDocumentFilter(new DoubleFilter());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelaBtn)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(quantidadeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(quantidadeTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unidadeLabel)
                                    .addComponent(precoLabel))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gramaRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precoTextField))))
                        .addGap(18, 18, 18)
                        .addComponent(quilogramaRadio)
                        .addGap(18, 18, 18)
                        .addComponent(litroRadio)
                        .addGap(18, 18, 18)
                        .addComponent(mililitroRadio)
                        .addGap(18, 18, 18)
                        .addComponent(unidadeRadio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingredienteLabel)
                            .addComponent(idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingredienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingredienteLabel)
                    .addComponent(ingredienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mililitroRadio)
                        .addComponent(unidadeRadio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(unidadeLabel)
                        .addComponent(gramaRadio)
                        .addComponent(quilogramaRadio)
                        .addComponent(litroRadio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoLabel)
                    .addComponent(precoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeLabel)
                    .addComponent(quantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaBtnActionPerformed
        try {
            ControladorIngrediente.getInstance().salva(montaIngrediente());
            JOptionPane.showMessageDialog(null, "Ingrediente salvo!");
            setVisible(false);
            limpaTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_salvaBtnActionPerformed

    private void cancelaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaBtnActionPerformed
        setVisible(false);
        limpaTela();
    }//GEN-LAST:event_cancelaBtnActionPerformed

    public void abreInclusao() {
        idLabel.setVisible(false);
        idTextField.setVisible(false);
        setVisible(true);
    }

    public void abreAlteracao(IngredienteDTO ingredienteDTO) {
        idLabel.setVisible(true);
        idTextField.setVisible(true);
        idTextField.setText(ingredienteDTO.getIdIngrediente());
        ingredienteTextField.setText(ingredienteDTO.getNome());
        setUnidade(ingredienteDTO.getUnidade());
        precoTextField.setText(ingredienteDTO.getPreco());
        quantidadeTextField.setText(ingredienteDTO.getQuantidadePreco());
        setVisible(true);
    }

    private IngredienteDTO montaIngrediente() {
        return new IngredienteDTO()
                .setIdIngrediente(idTextField.getText())
                .setNome(ingredienteTextField.getText())
                .setPreco(precoTextField.getText())
                .setQuantidadePreco(quantidadeTextField.getText())
                .setUnidade(getUnidadeSelecionada())
                .setUnidadePreco(getUnidadeSelecionada());
    }

    private String getUnidadeSelecionada() {
        Enumeration<AbstractButton> elements = radioGroup.getElements();
        String unidadeSelecionada = null;
        while (elements.hasMoreElements()) {
            AbstractButton abstractButton = elements.nextElement();
            if (abstractButton.isSelected()) {
                return abstractButton.getText();
            }
        }
        return null;
    }

    private void setUnidade(String nomeUnidade) {
        Enumeration<AbstractButton> elements = radioGroup.getElements();
        String unidadeSelecionada = null;
        while (elements.hasMoreElements()) {
            AbstractButton abstractButton = elements.nextElement();
            if (abstractButton.getText().equals(nomeUnidade)) {
                abstractButton.setSelected(true);
            }
        }
    }

    private void limpaTela() {
        idTextField.setText("");
        quantidadeTextField.setText("");
        ingredienteTextField.setText("");
        precoTextField.setText("");
        radioGroup.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelaBtn;
    private javax.swing.JRadioButton gramaRadio;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel ingredienteLabel;
    private javax.swing.JTextField ingredienteTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton litroRadio;
    private javax.swing.JRadioButton mililitroRadio;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JTextField precoTextField;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JTextField quantidadeTextField;
    private javax.swing.JRadioButton quilogramaRadio;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JButton salvaBtn;
    private javax.swing.JLabel unidadeLabel;
    private javax.swing.JRadioButton unidadeRadio;
    // End of variables declaration//GEN-END:variables
}
