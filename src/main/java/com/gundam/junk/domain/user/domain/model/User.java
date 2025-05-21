package com.gundam.junk.domain.user.domain.model;

import common.jpa.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "p_user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login_id", unique = true)
    private String loginId;

    @Column(name = "password")
    private String password;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "UserRole")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    private User(
        String loginId,
        String password,
        String username
    ) {
        this.loginId = loginId;
        this.password = password;
        this.username = username;
        this.userRole = UserRole.USER;
    }

    public static User of(
        String loginId,
        String password,
        String username
    ) {
        return new User(
            loginId,
            password,
            username
        );
    }

}
