/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import util.DBUtility;
import java.sql.ResultSet;

/**
 *
 * @author lvdinh
 */
public class CodeSql extends Bussiness{
    public CodeSql(){
        DB= new DBUtility(4);
        Table="VChiTietLinhKien";
        ID="Model";     
    }
//    public ResultSet getRe(){
//        SQL="SELECT Distinct MaPhieuNhap FROM PHIEUNHAP";
//        return super.getDataBySQLString(SQL);
//    }
    public ResultSet getAllMaLinhKien(){
        SQL="SELECT VehicleID, Name FROM Vehicle";
        return super.getDataBySQLString(SQL);
    }
    public ResultSet searchByProperties(int[] pro, String value){
        SQL="SELECT *FROM "+Table+" WHERE MaLinhKien ='' ";
        
        if(pro[0]==1) SQL+=" OR Name like '%"+value+"%'";
        if(pro[1]==1) SQL+=" OR Model like '%"+value+"%'";
        if(pro[2]==1) SQL+=" OR WarrantyPeriod like '%"+value+"%'";
        if(pro[3]==1) SQL+=" OR Quantity like '%"+value+"%'";
        if(pro[4]==1) SQL+=" OR Description like '%"+value+"%'";
        if(pro[5]==1) SQL+=" OR ReceiptNote like '%"+value+"%'";
        
        SQL += " OR VehicleID = ''";
        
        return super.searchAll(SQL);
        
    }
    
}
