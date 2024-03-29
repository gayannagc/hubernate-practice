import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Customer implements Serializable {

    @Id
    private String id;

    private String name;
}
