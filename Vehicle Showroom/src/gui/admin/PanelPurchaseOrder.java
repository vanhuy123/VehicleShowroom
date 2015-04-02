/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.admin;

import bean.PurchaseOrder;
import bean.PurchaseOrderDetails;
import bean.Vehicle;
import bean.VehicleRegistration;
import gui.Home;
import gui.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import util.DBUtility;

/**
 *
 * @author nguyenvanbien
 */
public class PanelPurchaseOrder extends javax.swing.JPanel {

    private Connection con = DBUtility.getConnection();
    public static DefaultTableModel modelListProduct;
    public static ArrayList<PurchaseOrderDetails> listPurchaseOrderDetailses;
    public static ArrayList<VehicleRegistration> listVehicleRegistrations;
    public PurchaseOrder purchaseOrder;

    /**
     * Creates new form PurchaseOrder
     */
    public PanelPurchaseOrder() {
        initComponents();
        AddPurchaseOrder();
        modelListProduct = new DefaultTableModel();
        modelListProduct.addColumn("Id");
        modelListProduct.addColumn("Name");
        modelListProduct.addColumn("Model");
        modelListProduct.addColumn("Brand");
        modelListProduct.addColumn("Speed");
        modelListProduct.addColumn("Image");
        modelListProduct.addColumn("Weight");
        modelListProduct.addColumn("Description");
        modelListProduct.addColumn("Remarks");
        modelListProduct.addColumn("OverallHeight");
        modelListProduct.addColumn("OverallWidth");
        modelListProduct.addColumn("OverallLength");
        modelListProduct.addColumn("SeatingCapacity");
        modelListProduct.addColumn("FuelTank");
        modelListProduct.addColumn("Color");
        modelListProduct.addColumn("Price");
        modelListProduct.addColumn("SalePrice");
        modelListProduct.addColumn("Quantity");
        tblListProduct.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblListProduct.setModel(modelListProduct);
        TableColumn column = tblListProduct.getColumnModel().getColumn(0);
        column.setPreferredWidth(15);
    }

    private void AddPurchaseOrder() {
        purchaseOrder = new bean.PurchaseOrder();
        purchaseOrder.setUser(Login.acc);
        Date today = new Date(System.currentTimeMillis());
        purchaseOrder.setPurchaseDate(today);
        purchaseOrder.setStatus(true);
        listPurchaseOrderDetailses = new ArrayList<>();
        listVehicleRegistrations = new ArrayList<>();
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
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        scrListproduct = new javax.swing.JScrollPane();
        tblListProduct = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        lblStatusPurchaseOrder = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Purchase Order");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("List of product");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFinish.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        scrListproduct.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrListproduct.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblListProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblListProduct.setEditingColumn(0);
        tblListProduct.setEditingRow(0);
        tblListProduct.setMinimumSize(new java.awt.Dimension(80, 80));
        tblListProduct.setPreferredSize(new java.awt.Dimension(1600, 900));
        tblListProduct.setRowHeight(20);
        tblListProduct.setSurrendersFocusOnKeystroke(true);
        scrListproduct.setViewportView(tblListProduct);

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblStatusPurchaseOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatusPurchaseOrder.setIconTextGap(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatusPurchaseOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrListproduct))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrListproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatusPurchaseOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddProductDialog d = new AddProductDialog(Home.homeFrame, true);
        d.setLocationRelativeTo(Home.homeFrame);
        d.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (tblListProduct.getSelectedRow() >= 0) {
            int selectedRow = tblListProduct.getSelectedRow();
            PurchaseOrderDetails pOD = listPurchaseOrderDetailses.get(selectedRow);
            EditProductDialog d = new EditProductDialog(Home.homeFrame, true, pOD, selectedRow);
            d.setLocationRelativeTo(Home.homeFrame);
            d.setVisible(true);
        } else {
            Icon ic = new ImageIcon("src/Images/1427748459_Warning.png");
            lblStatusPurchaseOrder.setIcon(ic);
            lblStatusPurchaseOrder.setText("No row are selected.");
        }
//        int showConfirmDialog = JOptionPane.showConfirmDialog(scrListproduct, "Rows were modified. Do you want to reload table?");
//        if(showConfirmDialog>0){
//            tblListProduct.validate();
//        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tblListProduct.getSelectedRow() >= 0) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(scrListproduct, "Are you sure you want to permanently delete this row?");
            if (showConfirmDialog == 0) {
                int selectedRow = tblListProduct.getSelectedRow();
                modelListProduct.removeRow(selectedRow);
                listPurchaseOrderDetailses.remove(selectedRow);
                listVehicleRegistrations.remove(selectedRow);
            }
        } else {
            Icon ic = new ImageIcon("src/Images/1427748459_Warning.png");
            lblStatusPurchaseOrder.setIcon(ic);
            lblStatusPurchaseOrder.setText("No row are selected.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        int i = 0;
        int purchaseOrderId = InsertDBPurchaseOrder(purchaseOrder.getUser().getUserId(),
                purchaseOrder.getPurchaseDate(), purchaseOrder.isStatus());
        purchaseOrder.setPurchaseId(purchaseOrderId);
        for (PurchaseOrderDetails oDetails : listPurchaseOrderDetailses) {
            int vehicleID = InsertDBVehicle(oDetails.getoVehicle());
            listVehicleRegistrations.get(i).getoVehicle().setVehicleId(vehicleID);
            listVehicleRegistrations.get(i).setoPurchaseOrder(purchaseOrder);
            InsertDBPurchaseOrderDetail(vehicleID, oDetails);
            i++;
        }
        for (VehicleRegistration oVehicle : listVehicleRegistrations) {
            InsertDBVehicleRegistration(oVehicle);
        }
        JOptionPane.showMessageDialog(scrListproduct, "Success!");
    }//GEN-LAST:event_btnFinishActionPerformed

    private int InsertDBPurchaseOrder(int userId, Date date, boolean status) {
        int id = 0;
        PreparedStatement pstmt = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = dateFormat.format(date);
        try {
            String str = "INSERT INTO [dbo].[PurchaseOrder] ([UserId],[PurchaseDate],[Status])"
                    + "VALUES(?,?,?)";
            pstmt = con.prepareStatement(str);
            pstmt.setInt(1, userId);
            pstmt.setString(2, format);
            pstmt.setBoolean(3, status);
            int i = pstmt.executeUpdate();

            String selectId = "SELECT TOP 1 [PurchaseId]\n"
                    + "  FROM [Vehicle].[dbo].[PurchaseOrder]\n"
                    + "  ORDER BY PurchaseId DESC";
            pstmt = con.prepareStatement(selectId);
            ResultSet rs = pstmt.executeQuery();
            if (!rs.wasNull()) {
                while (rs.next()) {
                    id = rs.getInt("PurchaseId");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPurchaseOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    private void InsertDBPurchaseOrderDetail(int vehicleId, PurchaseOrderDetails purchaseOrderDetails) {
        PreparedStatement pstmt = null;
        try {
            String str = "INSERT INTO [dbo].[PurchaseOrderDetails]"
                    + "([PurchaseId],[VehicleId],[PurchasePrice],[Quantity])"
                    + "VALUES"
                    + "(?,?,?,?)";
            pstmt = con.prepareStatement(str);
            pstmt.setInt(1, purchaseOrder.getPurchaseId());
            pstmt.setInt(2, vehicleId);
            pstmt.setFloat(3, purchaseOrderDetails.getPurchasePrice());
            pstmt.setInt(4, purchaseOrderDetails.getQuantity());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PanelPurchaseOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int InsertDBVehicle(Vehicle vehicle) {
        int id = 0;
        PreparedStatement pstmt = null;
        try {
            String str = "INSERT INTO [dbo].[Vehicle]"
                    + "([Name],[Image],[Model],[Speed],[Weight],[Description],[OverallHeight],"
                    + "[OverallWidth],[OverallLength],[SeatingCapacity],[FuelTank],[BrandId])"
                    + "VALUES"
                    + "(?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(str);
            pstmt.setString(1, vehicle.getName());
            pstmt.setString(2, vehicle.getImage());
            pstmt.setString(3, vehicle.getModel());
            pstmt.setFloat(4, vehicle.getSpeed());
            pstmt.setFloat(5, vehicle.getWeight());
            pstmt.setString(6, vehicle.getDescription());
            pstmt.setFloat(7, vehicle.getOverallHeight());
            pstmt.setFloat(8, vehicle.getOverallWidth());
            pstmt.setFloat(9, vehicle.getOverallLength());
            pstmt.setInt(10, vehicle.getSeatingCapacity());
            pstmt.setFloat(11, vehicle.getFuelTank());
            pstmt.setInt(12, vehicle.getoBrand().getBrandId());
            int i = pstmt.executeUpdate();

            String selectId = "SELECT [VehicleId]\n"
                    + "      ,[Name]"
                    + "      ,[Image]"
                    + "      ,[Model]"
                    + "      ,[Speed]"
                    + "      ,[Weight]"
                    + "      ,[Description]"
                    + "      ,[OverallHeight]"
                    + "      ,[OverallWidth]"
                    + "      ,[OverallLength]"
                    + "      ,[SeatingCapacity]\n"
                    + "      ,[FuelTank]\n"
                    + "      ,[BrandId]\n"
                    + "  FROM [dbo].[Vehicle]";
            pstmt = con.prepareStatement(selectId);
            ResultSet rs = pstmt.executeQuery();
            if (!rs.wasNull()) {
                while (rs.next()) {
                    id = rs.getInt("VehicleId");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPurchaseOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    private void InsertDBVehicleRegistration(VehicleRegistration vehicleRegistration) {
        PreparedStatement pstmt = null;
        try {
            String str = "INSERT INTO [dbo].[VehicleRegistration]"
                    + "([PurchaseId],[VehicleId],[Price],[Remarks],[Color])"
                    + "VALUES"
                    + "(?,?,?,?,?)";
            pstmt = con.prepareStatement(str);
            pstmt.setInt(1, vehicleRegistration.getoPurchaseOrder().getPurchaseId());
            pstmt.setInt(2, vehicleRegistration.getoVehicle().getVehicleId());
            pstmt.setFloat(3, vehicleRegistration.getPrice());
            pstmt.setString(4, vehicleRegistration.getRemarks());
            pstmt.setString(5, vehicleRegistration.getColor());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PanelPurchaseOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblStatusPurchaseOrder;
    private javax.swing.JScrollPane scrListproduct;
    private javax.swing.JTable tblListProduct;
    // End of variables declaration//GEN-END:variables
}
