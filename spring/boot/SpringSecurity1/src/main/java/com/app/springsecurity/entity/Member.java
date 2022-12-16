package com.app.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Member {

    @Id
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<MemberRole> roleSet;

    public void addMemberRole(MemberRole role) {
        roleSet.add(role);
    }
}
