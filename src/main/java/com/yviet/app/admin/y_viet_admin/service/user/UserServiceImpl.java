package com.yviet.app.admin.y_viet_admin.service.user;

import com.yviet.app.admin.y_viet_admin.config.security.UserInfoDetails;
import com.yviet.app.admin.y_viet_admin.config.security.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Lazy
    private PasswordEncoder encoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Optional<UserEntity> userEntity = repository.findByEmail(email);

        // Converting UserEntity to UserDetails
//        return userEntity.map(UserInfoDetails::new)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found "));
        UserInfoDetails userInfoDetails = new UserInfoDetails();
        return userInfoDetails;
    }

    @Override
    public String authenticateUser(String email, String password) {
//        try {
//            Optional<UserEntity> user = repository.findByEmail(email);
//            if (user != null && encoder.matches(password, user.get().getPassword())) {
//
//            }
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }

        return jwtUtil.generateToken(email);
    }
}
