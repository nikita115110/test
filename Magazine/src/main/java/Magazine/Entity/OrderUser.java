package Magazine.Entity;

import javax.persistence.*;

@Entity
public class OrderUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String userName;
    private int UtemId;
    private byte state;
    //1 в корзине
    //2 доставляется
    //3 доставлен

    public OrderUser() {
    }

    public OrderUser(String userName, int utemId, byte state) {
        this.userName = userName;
        UtemId = utemId;
        this.state = state;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        username = username;
    }

    public int getUtemId() {
        return UtemId;
    }

    public void setUtemId(int utemId) {
        UtemId = utemId;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        state = state;
    }

    @Override
    public String toString() {
        return "OrderUser{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", UtemId=" + UtemId +
                ", state=" + state +
                '}';
    }
}
