package com.artiushenko.socnet.user.entity;

import com.artiushenko.socnet.role.entity.Role;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "user_login")
    private String login;

    @Column(name = "user_password")
    private String password;

    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "role_id" )
    private Role role;

    @Column (name = "user_nick_name")
    private String nick;

    @Column(name = "user_avatar")
    private byte[] avatar;
}
