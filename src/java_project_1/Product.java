
package java_project_1;

/**
 *
 * @author BartoszPrzybylowski
 */
public class Product {
    
    private int id;
    private String name;
    private float price;
    private byte[] picture;
    private String addDate;
    
    public Product(int pid, String pname, float pprice, String pAddDate, byte[] pimg  ){
        
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = pAddDate;
        this.picture = pimg;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public byte[] getPicture(){
        return picture;
    }
    public String getAddDate(){
        return addDate;
    }
}
