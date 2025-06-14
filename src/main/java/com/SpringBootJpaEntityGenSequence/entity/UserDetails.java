package com.SpringBootJpaEntityGenSequence.entity;

import jakarta.persistence.*;

@Table(name="user_details")
@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "unique_user_details_seq")
    @SequenceGenerator(
            name = "unique_user_details_seq",
            sequenceName = "db_user_details_seq",
            initialValue = 100,
            allocationSize = 5
    )
    private Long id;
    private String name;
    private String email;
    public UserDetails(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
