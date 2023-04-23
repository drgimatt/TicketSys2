/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @OriginalAuthor @drgimatt
 * Data_Tickets class implements the methods specified in the Data Interface 
 * and uses the Tickets and MySQLConnector class.
 * 
 */
public class Data_Notification implements Data<NotificationInfo> {
    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRes = null;
    
    
    public void createTable(String table)
    {
        /*try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "CREATE TABLE `ticketsys`.`alltickets` (`Number` INT NOT NULL AUTO_INCREMENT,`TicketID` VARCHAR(12) NOT NULL,`RevisionCount` VARCHAR(5) NOT NULL,`SubjectTitle` VARCHAR(45) NULL,`SubjectDesc` VARCHAR(45) NULL,`TicketType` VARCHAR(45) NULL,`PriorityLevel` VARCHAR(45) NULL,`AssignedDepartment` VARCHAR(45) NULL,`AssignedPersonnel` VARCHAR(45) NULL,`DateCreated` VARCHAR(45) NULL,`DateUpdated` VARCHAR(45) NULL,`Status` VARCHAR(45) NULL,`Creator` VARCHAR(45) NULL,PRIMARY KEY (`Number`),UNIQUE INDEX `new_tablecol_UNIQUE` (`TicketID` ASC) VISIBLE);";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Table created");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }*/        
    }   
    
    public void deleteTable(String table)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "DROP TABLE " + table;
            myStmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Table deleted");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }        
    } 
    
    public ArrayList<NotificationInfo> ShowRec(String parameters)
    {
        ArrayList<NotificationInfo> notif = new ArrayList<NotificationInfo>();
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();	
            String qry = "SELECT * FROM notification";
            if(parameters.isEmpty()){
            parameters = qry;
            }
	    myRes = myStmt.executeQuery(parameters);
            System.out.println(parameters);
	    while(myRes.next())
            {
                notif.add(new NotificationInfo(myRes.getString("id"),myRes.getString("user_to_notify"),myRes.getString("user_who_fired_event"),myRes.getInt("event_id"),myRes.getInt("seen_by_user"),myRes.getString("date")));
            }				
        }
	catch(SQLException ex)
	{
            JOptionPane.showMessageDialog(null, ex.getMessage());
	} catch (IOException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }
        return notif;
    }     
    
        public void addRow(String table, NotificationInfo notif)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "INSERT INTO " + table + "(user_to_notify, user_who_fired_event, event_id, seen_by_user, date)" +  " VALUES ('" + notif.getNotifyUser() + "', '" + notif.getEventUser() + "', '" + notif.getEventID() + "', '"  + notif.getSeenNotif() + "', '"  + notif.getDate() + "')";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            System.out.println("Entry added");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }        
    } 
        public void editRow(String table, NotificationInfo notif)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "UPDATE " + table + " SET seen_by_user = " + notif.getSeenNotif() + "' WHERE id = " + "'" + notif.getId() + "'";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            System.out.println("Entry updated");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }        
    }
               
        public void deleteRow(String table, String parameters)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "DELETE FROM " + table + " WHERE id = " + parameters;
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            System.out.println("Entry deleted");           
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Notification.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }        
    }
}

 