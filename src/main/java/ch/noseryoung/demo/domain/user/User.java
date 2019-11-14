package ch.noseryoung.demo.domain.user;

import ch.noseryoung.demo.domain.auction.Auction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    @OneToMany
    @JoinColumn(name = "users_id")
    private List<Auction> auctions;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public List<Auction> getAuctions() {
        return auctions;
    }

    public User setAuctions(List<Auction> auctions) {
        this.auctions = auctions;
        return this;
    }
}
