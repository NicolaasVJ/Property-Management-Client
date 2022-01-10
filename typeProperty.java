
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class typeProperty 
{
    private int id;
    private String name;
    private String description;
    
    //get and set for type property 
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer ID)
    {
        this.id=ID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String Name)
    {
        this.name=Name;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String Description)
    {
        this.description=Description;
    }
    
    //class construction
    
    public typeProperty()
    {
    
    }
    
    public typeProperty(Integer Id, String Name, String Description)
    {
        this.id=Id;
        this.name=Name;
        this.description=Description;
        
    }
    
    //function for insert, edit, remove and refresh
    
    public boolean execTypeQuery(String queryType, typeProperty type)
    {
        PreparedStatement ps;
        
        if(queryType.equals("add"))
        {
            try {
                ps=Connection_To_Db.getConnectionToDb().prepareStatement("INSERT INTO `type_property`(`name`, `description`) VALUES (?,?)");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                
                return (ps.executeUpdate()>0);
                
            } catch (SQLException ex) {
                Logger.getLogger(typeProperty.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        
        else if(queryType.equals("edit"))
        {
            try {
                ps=Connection_To_Db.getConnectionToDb().prepareStatement("UPDATE `type_property` SET `name`=?,`description`=? WHERE `id`=?");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                ps.setInt(3, type.getId());
                
                return (ps.executeUpdate()>0);
                
            } catch (SQLException ex) {
                Logger.getLogger(typeProperty.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        else if(queryType.equals("remove"))
        {
            try {
                ps=Connection_To_Db.getConnectionToDb().prepareStatement("DELETE FROM `type_property` WHERE `id`=?");
                ps.setInt(1, type.getId());
                
                return (ps.executeUpdate()>0);
                
            } catch (SQLException ex) {
                Logger.getLogger(typeProperty.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
         else
        {
            JOptionPane.showMessageDialog(null, "Select Add, Edit or Remove", "Invalid", 2);
            return false;
        }
    }
    
    
    
    //list for refresh button
    public HashMap<String,Integer> getTypesMap()
    {
        HashMap<String, Integer> map=new HashMap<>();
        Statement st;
        ResultSet rs;
        
        try {
            st=Connection_To_Db.getConnectionToDb().createStatement();
            rs=st.executeQuery("SELECT * FROM `type_property`");
            typeProperty type;
            
            while(rs.next())
            {
                type=new typeProperty(rs.getInt(1),rs.getString(2),rs.getString(3));
                map.put(type.getName(),type.getId());
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(typeProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }
    
    
    public typeProperty getTypeFromList(Integer id)
    {
        PreparedStatement ps;
        ResultSet rs;
        
        typeProperty type =new typeProperty();
        
        try 
        {
            ps=Connection_To_Db.getConnectionToDb().prepareStatement("SELECT * FROM `type_property` WHERE `id`=?");
            ps.setInt(1,id);
            rs=ps.executeQuery();
            
            
            if(rs.next())
            {
                type.setId(id);
                type.setName(rs.getString(2));
                type.setDescription(rs.getString(3));
            }
            
            
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(typeProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type;
        
    }
    
            
}
