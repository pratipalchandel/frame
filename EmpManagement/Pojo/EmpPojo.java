/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpManagement.Pojo;

/**
 *
 * @author Lenovo
 */
public class EmpPojo {
    public EmpPojo(int empNo,String empName,double empSal) {
        this.empNo=empNo;
        this.empName=empName;
        this.empSal=empSal;
    }

    public EmpPojo() {
    }
    public int getEmpNo(){
        return empNo;
    }
    public void setEmpNo(int empNo){
        this.empNo=empNo;
    }
     public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }
    private int empNo;
    private String empName;
    private double empSal;
}
