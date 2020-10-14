package com.dominic.assignment.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "construct")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    @NonNull private String userName;

    @NonNull private String password;

    @NonNull private String firstName;

    @NonNull private String lastName;

    @Column(unique = true)
    @NonNull private String email;

    @OneToOne
    @NonNull private Role role;

    @OneToOne
    @NonNull private Account account;

}
