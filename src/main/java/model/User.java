package model;

import utils.Hash;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    private String login;
    private String password;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

    public User() {
    }
    @PrePersist
    public void prePersist(){
        this.password=new Hash(this.password).hash();
    }

}
