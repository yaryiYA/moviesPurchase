package com.example.projectnine.service.impl;

import com.example.projectnine.entity.Users;
import com.example.projectnine.repository.impl.UsersRepository;
import com.example.projectnine.security.CustomPasswordEncoder;
import com.example.projectnine.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseService<Users, UsersRepository>
        implements UserDetailsService {
    private UsersRepository usersRepository;


    private CustomPasswordEncoder customPasswordEncoder;

    @Autowired
    public UserServiceImpl(UsersRepository repository, UsersRepository usersRepository,
                           CustomPasswordEncoder customPasswordEncoder) {
        super(repository);
        this.usersRepository = usersRepository;
        this.customPasswordEncoder = customPasswordEncoder;
    }

    public UserServiceImpl(UsersRepository repository) {
        super(repository);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Users user = usersRepository.findByLogin(login);

        return User.builder()
                .username(user.getLogin())
                .password(user.getPassword())
                .roles(user.getRole().getTitle())
                .build();
    }

    public void registerUser(Users user) {
        Users userReg = new Users();
        userReg.setFirstName(user.getFirstName());
        userReg.setLastName(user.getLastName());
        userReg.setLogin(user.getLogin());
        userReg.setPassword(customPasswordEncoder.encode(user.getPassword()));
        userReg.setRole(user.getRole());
        super.create(userReg);
    }
}
