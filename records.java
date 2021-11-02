package molesoft;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
public class records {
public static void main(String args[])
{
try
{
	Connection con = null;
	Driver d = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	System.out.println("Driver Class Loaded");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/njc1","root","root");
	Statement stmt1 = con.createStatement();
	Statement stmt2 = con.createStatement();
	Statement stmt3 = con.createStatement();
	String sql1 = "insert into naga values('Ala Vaikuntapuramloo','Allu Arjun','Pooja','Trivikram',2020)";
	String sql2 = "insert into naga values('Dsco Raja','Ravi Teja','Payal Rajput','Anand',2020)";
	String sql3 = "insert into naga values('Savaari','Nandu','Priyanka','Saahith Mothkuri',2020)";
    stmt1.executeUpdate(sql1);
    stmt2.executeUpdate(sql2);
    stmt3.executeUpdate(sql3);
    System.out.println("Records inserted successfully!");
	con.close();
  
  
	con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
