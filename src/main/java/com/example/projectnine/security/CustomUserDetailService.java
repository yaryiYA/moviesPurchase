package com.example.projectnine.security;

import com.example.projectnine.entity.Role;
import com.example.projectnine.entity.Users;
import com.example.projectnine.repository.impl.RoleRepository;
import com.example.projectnine.repository.impl.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
   final UsersRepository usersRepository;
   final RoleRepository roleRepository;
   final CustomPasswordEncoder customPasswordEncoder;



    @Autowired
    public CustomUserDetailService(UsersRepository usersRepository, RoleRepository roleRepository, CustomPasswordEncoder customPasswordEncoder) {
        this.usersRepository = usersRepository;
        this.roleRepository = roleRepository;
        this.customPasswordEncoder = customPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Users user = usersRepository.findByLogin(login);
        Role roles = user.getRole();
        Role role = roleRepository.findById(roles.getId()).get();

        return User.builder()
                .username(user.getLogin())
                .password(user.getPassword())
                .roles(role.getTitle())
                .build();
    }


}

