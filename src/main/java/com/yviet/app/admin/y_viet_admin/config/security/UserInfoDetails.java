package com.yviet.app.admin.y_viet_admin.config.security;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserInfoDetails implements UserDetails {

    private final String username;
    private final String password;
    private final List<GrantedAuthority> authorities;

    public UserInfoDetails() {
        username = "admin@gmail.com";
        password = "admin";
        authorities = new ArrayList<>();

        authorities.add(new SimpleGrantedAuthority("Admin"));
    }

//    public UserInfoDetails(UserEntity userInfo) {
//        username = userInfo.getEmail();
//        password = userInfo.getPassword();
//
//        authorities = new ArrayList<GrantedAuthority>();
//        if (userInfo.getRoleId() == 1) {
//            authorities.add(new SimpleGrantedAuthority(Authorities.Admin.name()));
//        } else if (userInfo.getRoleId() == 2) {
//            authorities.add(new SimpleGrantedAuthority(Authorities.Doctor.name()));
//        } else {
//            authorities.add(new SimpleGrantedAuthority(Authorities.Patient.name()));
//        }
////        authorities =  List.of(userInfo.getRoles().split(","))
////                .stream()
////                .map(SimpleGrantedAuthority::new)
////                .collect(Collectors.toList());
////
////        System.err.println(authorities);
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }



}
