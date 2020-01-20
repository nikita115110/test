package Magazine.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private byte type;
    private byte stars;
    private short price;
    private String item;
    private String company;
    private String roadtoimage;

    public Item() {
    }

    public Item( byte type, byte stars, String item, String company, short price, String roadtoimage) {
        this.type = type;
        this.stars = stars;
        this.item = item;
        this.company = company;
        this.price = price;
        this.roadtoimage = roadtoimage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getStars() {
        return stars;
    }

    public void setStars(byte stars) {
        this.stars = stars;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public String getRoadtoimage() {
        return roadtoimage;
    }

    public void setRoadtoimage(String roadtoimage) {
        this.roadtoimage = roadtoimage;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", type=" + type +
                ", stars=" + stars +
                ", price=" + price +
                ", item='" + item + '\'' +
                ", company='" + company + '\'' +
                ", roadtoimage='" + roadtoimage + '\'' +
                '}';
    }
}
