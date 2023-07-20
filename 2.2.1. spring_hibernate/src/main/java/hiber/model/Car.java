package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "serias")
    private int serias;
    @OneToOne(mappedBy = "car")
    private User user;

    public Car(String model, int serias) {
        this.model = model;
        this.serias = serias;
    }

    public Car() {
    }

    public Car(Long id, String model, int serias, User user) {
        this.id = id;
        this.model = model;
        this.serias = serias;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerias() {
        return serias;
    }

    public void setSerias(int serias) {
        this.serias = serias;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
