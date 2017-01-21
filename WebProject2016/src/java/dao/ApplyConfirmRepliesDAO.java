/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.ChangeOwnerNotificationBean;
import beans.DeletePhotoNotificationBean;
import beans.NotificationBean;
import beans.NotificationRepliesBean;
import database.ManagerDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Marco
 */
public class ApplyConfirmRepliesDAO {
 ManagerDB db;
    Connection con;
    
    public ApplyConfirmRepliesDAO(){
        db= new ManagerDB();
        con = db.getConnection();
    }
    
    public int confirmReplies(int id) throws SQLException, Throwable{
        PreparedStatement replies = con.prepareStatement("UPDATE replies SET accepted = true WHERE id =? ");
        replies.setInt(1,id);
        int value = replies.executeUpdate();
        this.finalize();
        con.close();
        return value;
    }
    
     public int deleteReplies(int id) throws SQLException, Throwable{
        PreparedStatement replies = con.prepareStatement("DELETE FROM replies WHERE id = ?");
        replies.setInt(1,id);
        int value = replies.executeUpdate();
        this.finalize();
        con.close();
        return value;
    }
    
    public void discardReplies() throws SQLException, Throwable{
        
    }
    //finalize per chiudere la connessione quando ho finito con la ricerca all'interno del database
    @Override
    protected void finalize() throws Throwable  
{  
    try { con.close(); } 
    catch (SQLException e) { 
        e.printStackTrace();
    }
    super.finalize();  
}  
    
}
