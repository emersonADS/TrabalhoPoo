
package telas;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class CadastrarItem extends javax.swing.JFrame {
    private ExibirItens telaExibirItens;
    public CadastrarItem(ExibirItens telaExibirItens) {
        initComponents();
        this.telaExibirItens = telaExibirItens;
    }

    CadastrarItem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtCadastra = new javax.swing.JButton();
        BtCancel = new javax.swing.JButton();
        TxItem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtCadastra.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtCadastra.setForeground(new java.awt.Color(51, 204, 0));
        BtCadastra.setText("Cadastrar");
        BtCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastraActionPerformed(evt);
            }
        });

        BtCancel.setText("Voltar");
        BtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelActionPerformed(evt);
            }
        });

        TxItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxItemActionPerformed(evt);
            }
        });

        TxDescricao.setColumns(20);
        TxDescricao.setRows(5);
        jScrollPane1.setViewportView(TxDescricao);

        jLabel1.setText("Item");

        jLabel2.setText("Descrição");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/cadastro_img2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtCadastra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(BtCancel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TxItem))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtCancel))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos(){ //método para limpar os campos de cadastro de itens
        TxItem.setText("");
        TxDescricao.setText("");

    }
    
    public void mostrarItem(Itens i){
        this.TxItem.setText(i.getNome());
        this.TxDescricao.setText(i.getDescricao());
        desabilitarCampos(); // talvez fazer alteração aqui!!.
        this.setVisible(true);
    }
    
    public void desabilitarCampos()
    {
        this.TxItem.setEnabled(false);
        this.TxDescricao.setEnabled(false);
        this.BtCadastra.setEnabled(false);
        //this.BtCancel.setEnabled(false);
    }
    
    public void habilitarCampos(){
        this.TxItem.setEnabled(true);
        this.TxDescricao.setEnabled(true);
        this.BtCadastra.setEnabled(true);
        this.BtCancel.setEnabled(true);
    }
    
    private void BtCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastraActionPerformed
        // TODO add your handling code here:
        Itens i = new Itens();
        i.setNome(TxItem.getText());
        i.setDescricao(TxDescricao.getText());
        
        if(TxItem.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nenhum item digitado!","",JOptionPane.INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(this, "Cadastrado com sucesso","",JOptionPane.INFORMATION_MESSAGE);
        this.telaExibirItens.addItem(i);
        }
        
        this.limparCampos();

    }//GEN-LAST:event_BtCadastraActionPerformed

    private void TxItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxItemActionPerformed

    private void BtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        this.telaExibirItens.setVisible(true);
        
        this.habilitarCampos();
        limparCampos();
    }//GEN-LAST:event_BtCancelActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastra;
    private javax.swing.JButton BtCancel;
    private javax.swing.JTextArea TxDescricao;
    private javax.swing.JTextField TxItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
