/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import bean.Bussiness;
import util.DBUtility;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lvdinh
 */
public class BLoaiXe extends Bussiness{
    public BLoaiXe(){
        Table="LoaiLinhKien";
        ID="MaLoaiLinhKien";
        SQL="";
        DB= new DBUtility(4);
    }
    public boolean insertByProperties(String maloailinhkien, String tenloailinhkien, String ghichu){
        SQL="INSERT INTO LOAILINHKIEN VALUES("
                +"'"+maloailinhkien+"',"
                +"N'"+tenloailinhkien+"',"
                +"N'"+ghichu+"')";
         return insertBySQLString(SQL);
    }
    public boolean updateByProperties(String maloailinhkien, String tenloailinhkien, String ghichu){
        SQL="UPDATE LOAILINHKIEN SET "
                +"TenLoaiLinhKien = N'"+tenloailinhkien+"',"
                +"GhiChu = N'"+ghichu+"'"
                +" WHERE MaLoaiLinhKien = '"+maloailinhkien+"'";
        return updateBySQLString(SQL);
    }

    public String getMaLoaiLinhKien(String tenloailinhkien) {
        SQL = "SELECT MALOAILINHKIEN FROM LOAILINHKIEN WHERE TENLOAILINHKIEN = '" + tenloailinhkien + "'";
        ResultSet rs = getDataBySQLString(SQL);
        try {
            if (rs.next()) {
                return rs.getString("MaLoaiLinhKien");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ML0";
    }
    public ResultSet getAllTenLoaiLinhKien(){
      SQL="SELECT Distinct TenLoaiLinhKien FROM LOAILINHKIEN";
      return super.getDataBySQLString(SQL);
    }
    public String getTenLoaiLinhKien(String maloailinhkien){
        SQL = "SELECT TENLOAILINHKIEN FROM LOAILINHKIEN WHERE MALOAILINHKIEN = '" + maloailinhkien + "'";
        ResultSet rs = getDataBySQLString(SQL);
        try {
            if (rs.next()) {
                return rs.getString("TenLoaiLinhKien");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Loại khác";
    }

}
