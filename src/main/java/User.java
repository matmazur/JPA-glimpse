import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }
}
