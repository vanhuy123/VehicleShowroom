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
public class Bussiness{
        DBUtility DB;
        String SQL;
        String Table;
        String ID;
    public Bussiness(){ 
        }
    public Bussiness(DBUtility db, String table, String ID){
        this.DB=db;
        this.Table=table;
        this.ID=ID;
    }
    public Bussiness(DBUtility db, String table){
        this.DB=db;
        this.Table=table;
    }
    
    //-----------------------------------------------
    public ResultSet getAll(){
        SQL="SELECT * FROM "+Table;
        ResultSet rs = DB.getData(SQL);
        return DB.getData(SQL);
    }
    //-----------------------------------------------
    public ResultSet getByID(String id){
        SQL="SELECT * FROM "+Table+" where "+ID+" = N'"+id+"'";
        return DB.getData(SQL);
    }
    //-----------------------------------------------
    public ResultSet searchByID(String id){
       SQL="SELECT *FROM "+Table+" WHERE "+ID+" LIKE '%"+id+"%'";
       return DB.getData(SQL);
    }
    public ResultSet searchAll(String s){
        return DB.getData(s);
    }
    public boolean deleteByID(String id){
        SQL="DELETE "+Table+" WHERE "+ID+" = '"+id+"'";
        if(DB.updateData(SQL)){
            System.out.println("Delete Success ID Number: "+id);
            return true;
        }
            return false;
    }
    public boolean updateBySQLString(String s){
        DB=new DBUtility(4);
        if(DB.updateData(s))
            return true;
        return false;
    }
    public boolean insertBySQLString(String s){
        return updateBySQLString(s);
    }
    public ResultSet getDataBySQLString(String s){
        return DB.getData(s);
    }
}
