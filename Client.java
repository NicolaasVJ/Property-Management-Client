import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
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
    
    public Client()
    {
    
    }
    
    public Client(int id, String fName, String surname, String cell, String email, String address)
    {
        this.id=id;
        this.firstName=fName;
        this.surname=surname;
        this.cell=cell;
        this.email=email;
        this.address=address;
    }
    
    //new
    
    public boolean addClient(Client client)
    {
        
        PreparedStatement ps;
        String addQuery="INSERT INTO `client`(`name`, `surname`, `cell`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        
        
        try {
            ps=Connection_To_Db.getConnectionToDb().prepareStatement(addQuery);
            ps.setString(1,client.getFName());
            ps.setString(2,client.getSurname());
            ps.setString(3,client.getCell());
            ps.setString(4,client.getEmail());
            ps.setString(5,client.getAddress());
            
            return (ps.executeUpdate()>0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    //edit
    
    public boolean editClient(Client client)
    {
        PreparedStatement ps;
        String editQuery="UPDATE `client` SET `name`=?,`surname`=?,`cell`=?,`email`=?,`address`=? WHERE `id`=?";
        
        
        
        try {
            ps=Connection_To_Db.getConnectionToDb().prepareStatement(editQuery);
            ps.setString(1,client.getFName());
            ps.setString(2,client.getSurname());
            ps.setString(3,client.getCell());
            ps.setString(4,client.getEmail());
            ps.setString(5,client.getAddress());
            
            ps.setInt(6,client.getId());
            
            return (ps.executeUpdate()>0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //delete
    
    public boolean removeClient(int clientId)
    {
        PreparedStatement ps;
        String removeQuery="DELETE FROM `client` WHERE `id`=?";
        
        try {
            ps=Connection_To_Db.getConnectionToDb().prepareStatement(removeQuery);
            ps.setInt(1,clientId);
            
            return (ps.executeUpdate()>0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //return values
    
    public ArrayList<Client> clientList()
    {
        ArrayList<Client> list=new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery="SELECT * FROM `client`";
        
        try {
            
            st=Connection_To_Db.getConnectionToDb().createStatement();
            rs=st.executeQuery(selectQuery);
            
            Client client;
            while(rs.next())
            {
                client=new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(client);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}

