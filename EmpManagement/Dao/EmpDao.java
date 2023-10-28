/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpManagement.Dao;

import EmpManagement.Dbutil.DBConnection;
import EmpManagement.Pojo.EmpPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class EmpDao {
    public static boolean addEmployees(EmpPojo e)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into employees values(?,?,?)");
        ps.setInt(1,e.getEmpNo());
        ps.setString(2,e.getEmpName());
        ps.setDouble(3,e.getEmpSal());
        return ps.executeUpdate()==1;
    }
    public static List<EmpPojo>getAllEmployees()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        List<EmpPojo> empList =new ArrayList<>();
        ResultSet rs=st.executeQuery("Select * from employees");
        while(rs.next()){
            EmpPojo e=new EmpPojo();
        e.setEmpNo(rs.getInt(1));
        e.setEmpName(rs.getString(2));
        e.setEmpSal(rs.getDouble(3));
        empList.add(e);
        }
        return empList;        
    }
        public static EmpPojo findEmpById(int id)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from employees where EmpId=?");
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        EmpPojo e=null;
        if(rs.next()){
        e=new EmpPojo();
        e.setEmpNo(id);
        e.setEmpName(rs.getString(2));
        e.setEmpSal(rs.getDouble(3));
        }
        return e;
        }
}
