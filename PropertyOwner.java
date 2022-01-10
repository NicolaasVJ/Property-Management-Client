
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PropertyOwner 
{
    private int id;
    private String firstName;
    private String surname;
    private String cell;
    private String email;
    private String address;
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public String getFName()
    {
        return this.firstName;
    }
    
    public void setFName(String fName)
    {
        this.firstName=fName;
    }
    
    public String getSurname()
    {
        return this.surname;
    }
    
    public void setSurname(String surname)
    {
        this.surname=surname;
    }
    
    public String getCell()
    {
        return this.cell;
    }
    
    public void setCell(String cell)
    {
        this.cell=cell;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void getEmail(String email)
    {
        this.email=email;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void getAddress(String address)
    {
        this.address=address;
    }
    
    public PropertyOwner()
    {
    
    }
    
    public PropertyOwner(int id, String fName, String surname, String cell, String email, String address)
    {
        this.id=id;
        this.firstName=fName;
        this.surname=surname;
        this.cell=cell;
        this.email=email;
        this.address=address;
    }
    
    
    //add
    
    public boolean addOwner(PropertyOwner owner)
    {
        
        PreparedStatement ps;
        String addQuery="INSERT INTO `owner`(`name`, `surname`, `cell`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        
        
        try {
            ps=Connection_To_Db.getConnectionToDb().prepareStatement(addQuery);
            ps.setString(1,owner.getFName());
            ps.setString(2,owner.getSurname());
            ps.setString(3,owner.getCell());
            ps.setString(4,owner.getEmail());
            ps.setString(5,owner.getAddress());
            
            return (ps.executeUpdate()>0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PropertyOwner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    //edit
    
    public boolean editOwner(PropertyOwner owner)
    {
        PreparedStatement ps;
        String editQuery="UPDATE `owner` SET `name`=?,`surname`=?,`cell`=?,`email`=?,`address`=? WHERE `id`=?";
        
        
        
        try {
            ps=Connection_To_Db.getConnectionToDb().prepareStatement(editQuery);
            ps.setString(1,owner.getFName());
            ps.setString(2,owner.getSurname());
            ps.setString(3,owner.getCell());
            ps.setString(4,owner.getEmail());
            ps.setString(5,owner.getAddress());            
            ps.setInt(6,owner.getId());
            
            return (ps.executeUpdate()>0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PropertyOwner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //delete
    
    public boolean removeOwner(int ownerId)
    {
        PreparedStatement ps;
        String removeQuery="DELETE FROM `owner` WHERE `id`=?";
        
        try {
            ps=Connection_To_Db.getConnectionToDb().prepareStatement(removeQuery);
            ps.setInt(1,ownerId);
            
            return (ps.executeUpdate()>0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PropertyOwner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //return
    
    public ArrayList<PropertyOwner> ownerList()
    {
        ArrayList<PropertyOwner> list=new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery="SELECT * FROM `owner`";
        
        try {
            
            st=Connection_To_Db.getConnectionToDb().createStatement();
            rs=st.executeQuery(selectQuery);
            
            PropertyOwner owner;
            while(rs.next())
            {
                owner=new PropertyOwner(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(owner);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(PropertyOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
