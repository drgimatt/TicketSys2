/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @OriginalAuthor @drgimatt
 * Credentials class contains the user credentials and personal information for
 * the employee.
 * 
 */
public class Credentials {
    private int num;
    private String empNum;    
    private String userName;
    private String password;    
    private String email;       
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String phoneNum;
    private String gender;
    private String residence;
    private String acctType;
    private String startDate;
    private String department;
    private String position;

    public Credentials(String empnum, String u_name, String pass, String email, String f_name, String m_name, String l_name, int age, String bday, String phonenum, String gender, String residence, String actType, String startdate, String department, String position) {
        this.empNum = empnum;
        this.userName = u_name;
        this.password = pass;
        this.email = email;
        this.firstName = f_name;
        this.middleName = m_name;
        this.lastName = l_name;
        this.age = age;
        this.birthday = bday;
        this.phoneNum = phonenum;
        this.gender = gender;
        this.residence = residence;
        this.acctType = actType;
        this.startDate = startdate;
        this.department = department;
        this.position = position;
    }

    public Credentials(int num, String empnum, String u_name, String pass, String email, String f_name, String m_name, String l_name, int age, String bday, String phonenum, String gender, String residence, String actType, String startdate, String department, String position) {
        this.num = num;
        this.empNum = empnum;
        this.userName = u_name;
        this.password = pass;
        this.email = email;
        this.firstName = f_name;
        this.middleName = m_name;
        this.lastName = l_name;
        this.age = age;
        this.birthday = bday;
        this.phoneNum = phonenum;
        this.gender = gender;
        this.residence = residence;
        this.acctType = actType;
        this.startDate = startdate;
        this.department = department;
        this.position = position;
    }


    public int getNum() {
        return num;
    }

    public String getEmpnum() {
        return empNum;
    }

    public String getU_name() {
        return userName;
    }

    public String getPass() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getF_name() {
        return firstName;
    }

    public String getM_name() {
        return middleName;
    }

    public String getL_name() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getBday() {
        return birthday;
    }

    public String getPhonenum() {
        return phoneNum;
    }

    public String getGender() {
        return gender;
    }

    public String getResidence() {
        return residence;
    }

    public String getActType() {
        return acctType;
    }

    public String getStartdate() {
        return startDate;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }


    
}

