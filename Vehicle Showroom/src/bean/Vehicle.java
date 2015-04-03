/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author lvdinh
 */
public class Vehicle {
    String ReceiptNote;
    String Model;
    String Name;
    int WarrantyPeriod;
    int QuantityinStock;
    String Description;
    String Image;
    public Vehicle(String receiptnote,String name, String model, int warrantyperiod,
            int quantityinstock, String description,
            String image){
        ReceiptNote=receiptnote;
        Name=name;
        Model=model;
        WarrantyPeriod=warrantyperiod;
        QuantityinStock=quantityinstock;
        Description=description;
        Image=image;
        
    }

    public Vehicle() {
    }

    public String getReceiptNote() {
        return ReceiptNote;
    }

    public void setReceiptNote(String ReceiptNote) {
        this.ReceiptNote = ReceiptNote;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQuantityinStock() {
        return QuantityinStock;
    }

    public void setQuantityinStock(int QuantityinStock) {
        this.QuantityinStock = QuantityinStock;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public Object getWarrantyPeriod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
