import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class User implements Serializable {

    @Id
    protected String userId;

    protected String username;
    protected String firstname;
    protected String lastname;

    public String getName(){
        return this.firstname + ' ' + this.lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal calcShippingCosts(Address fromLocation){
        return null;
    }
}
