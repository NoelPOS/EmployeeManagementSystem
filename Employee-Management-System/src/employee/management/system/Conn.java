
package employee.management.system;

import java.sql.*;

public class Conn {
    
    public Connection c;
    public Statement s;
    public String username = "ti4mlv2kebx8dbpzgofb";
    public String password = "pscale_pw_fMzneUYN7E0UPrH920ebroqhHlnRUInmNVNTLrOuWMG";
//    public String url = "jdbc:mysql://localhost:3306/hotelbookingsystem";
    public String url = "jdbc:mysql://aws.connect.psdb.cloud/employeesystem?sslMode=VERIFY_IDENTITY";
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(url,username,password);
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
