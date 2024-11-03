package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.Builder;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "Users")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
	@Column(name="UserName", nullable=false)
    private String userName;
	@Column(name="PhoneNumber",nullable=false)
    private String phoneNumber;
    @Column(name="password", length = 255)
    private String password;
}
