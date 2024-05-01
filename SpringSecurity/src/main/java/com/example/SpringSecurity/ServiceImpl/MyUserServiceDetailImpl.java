package com.example.SpringSecurity.ServiceImpl;

import com.example.SpringSecurity.models.MyUser;
import com.example.SpringSecurity.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceDetailImpl implements UserDetailsService {
    @Autowired
    MyUserRepository myUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return myUserRepository.findByEmail(username);
    }
    public MyUser save(MyUser myUser){
        return myUserRepository.save(myUser);
    }
}
