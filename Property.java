
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Property 
{
    private int id;
    private int type;
    private int size;
    private int ownerId;
    private String price;
    private String address;
    private int bedroom;
    private int bathroom;
    private int levies;
    private String description;
    private boolean pool;
    private boolean pet;
    private int garage;

    Property(int i, int type, int squareM, int ownerId, String price, String address, int bedroom, int bathroom, int levies, boolean havePool, boolean havePet, int garage, String description) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getLevies() {
        return levies;
    }

    public void setLevies(int levies) {
        this.levies = levies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }
    
    public Property()
    {
        
    }
    
    public Property(int id, int type, int size, int ownerId, String price, String address,
            int bedroom, int bathroom, int levies, String desc, boolean pool, boolean pet, int garage)
    {
        this.id=id;
        this.type=type;
        this.size=size;
        this.ownerId=ownerId;
        this.price=price;
        this.address=address;
        this.bedroom=bedroom;
        this.bathroom=bathroom;
        this.levies=levies;
        this.description=desc;
        this.pool=pool;
        this.pet=pet;
        this.garage=garage;
        
        
    }
     public Property(int id){
        this.id=id; 
     }
      public ArrayList<Property> propertyList()
    {
        ArrayList<Property> list=new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery="SELECT * FROM `property_details`";
        
        try {
            
            st=Connection_To_Db.getConnectionToDb().createStatement();
            rs=st.executeQuery(selectQuery);
            
            Property property;
            while(rs.next())
            {
                property=new Property(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),
                        rs.getString(5),rs.getString(6), rs.getInt(7),rs.getInt(8),
                        rs.getInt(9),rs.getString(10),rs.getBoolean(11),rs.getBoolean(12),rs.getInt(13));
                list.add(property);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(PropertyOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    

    //new property
    //https://docs.oracle.com/cd/E17802_01/j2se/javase/6/jcp/beta/apidiffs/java/sql/PreparedStatement.html
    public boolean addProperty(Property property)
    {
        PreparedStatement ps;
        String addQuery="INSERT INTO `property_details`(`type`, `square_m`, `ownerId`, `price`, `address`, `bedroom`, `bathroom`, `levies`, `description`, `pool`, `pet`, `garage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ps= Connection_To_Db.getConnectionToDb().prepareStatement(addQuery);
            ps.setInt(1, property.getType());
            ps.setInt(2, property.getSize());
            ps.setInt(3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString(5, property.getAddress());
            ps.setInt(6, property.getBedroom());
            ps.setInt(7, property.getBathroom());
            ps.setInt(8, property.getLevies());
            ps.setString(9, property.getDescription());
            ps.setBoolean(10, property.isPool());
            ps.setBoolean(11, property.isPet());
            ps.setInt(12, property.getGarage());
            
            return(ps.executeUpdate()>0);
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
    //edit property
    public boolean editProperty(Property property)
    {
        PreparedStatement ps;
        String editQuery="UPDATE `property_details` SET `type`=?,`square_m`=?,`ownerId`=?,`price`=?,`address`=?,`bedroom`=?,`bathroom`=?,`levies`=?,`description`=?,`pool`=?,`pet`=?,`garage`=? WHERE `id`=? ";
        
        try {
            ps= Connection_To_Db.getConnectionToDb().prepareStatement(editQuery);
            ps.setInt(1, property.getType());
            ps.setInt(2, property.getSize());
            ps.setInt(3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString(5, property.getAddress());
            ps.setInt(6, property.getBedroom());
            ps.setInt(7, property.getBathroom());
            ps.setInt(8, property.getLevies());
            ps.setString(9, property.getDescription());
            ps.setBoolean(10, property.isPool());
            ps.setBoolean(11, property.isPet());
            ps.setInt(12, property.getGarage());
            ps.setInt(13, property.getId());
            
            return(ps.executeUpdate()>0);
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //remove
    public boolean removeProperty(Property property)
    {
        PreparedStatement ps;
        String deleteQuery="DELETE FROM `property_details` WHERE `id`=? ";
        
        
        try {
            ps= Connection_To_Db.getConnectionToDb().prepareStatement(deleteQuery);
             ps.setInt(1, property.getId());
             return(ps.executeUpdate()>0);
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
    //https://docs.oracle.com/javase/tutorial/jdbc/basics/retrieving.html
    public Property searchProperty(int propertyId)
    {
        PreparedStatement ps;
        ResultSet rs;
        Property property=null;
         
        String searchQuery="SELECT * FROM `property_details` WHERE `id`=?";
        
        try {
           
            ps= Connection_To_Db.getConnectionToDb().prepareStatement(searchQuery);
             ps.setInt(1, propertyId);
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                property=new Property(rs.getInt("id"),rs.getInt("type"),rs.getInt("square_m"),rs.getInt("ownerId"),
                        rs.getString("price"),rs.getString("address"),rs.getInt("bedroom"),rs.getInt("bathroom"),
                        rs.getInt("levies"),rs.getString("description"),rs.getBoolean("pool"),
                        rs.getBoolean("pet"),rs.getInt("garage"));

            }
            return property;
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return property;
    }
    
}
