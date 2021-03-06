package com.example.popla.gorkhavidyutpowerpay.activity.Employee_Data;

import com.example.popla.gorkhavidyutpowerpay.db.EmployeeDao;

import java.util.List;

/**
 * Created by Mohit on 19-03-2018.
 */

public class EmployeeDataProvider {
    private String emp_name;
    private String emp_designation;
    private String emp_email;

    public String getEmp_email()
    {
        return emp_email;
    }

    public void setEmp_email(String emp_email)  {
        this.emp_email= emp_email;
    }
    public EmployeeDataProvider(String emp_name, String emp_designation, String emp_email)
    {
        this.setEmp_designation(emp_designation);
        this.setEmp_name(emp_name);
        this.setEmp_email(emp_email);
    }
    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_designation() {
        return emp_designation;
    }

    public void setEmp_designation(String emp_designation) {
        this.emp_designation = emp_designation;
    }
}
