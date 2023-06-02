package com.example.projectnine.service.impl;

import com.example.projectnine.dto.user.RequestUsersDto;
import com.example.projectnine.dto.user.ResponseUsersDto;
import com.example.projectnine.entity.Users;
import com.example.projectnine.mapper.CommonMapper;
import com.example.projectnine.repository.impl.UsersRepository;
import com.example.projectnine.security.CustomPasswordEncoder;
import com.example.projectnine.service.BaseService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends BaseService<Users, UsersRepository, RequestUsersDto, ResponseUsersDto> implements UserDetailsService {

    public UsersServiceImpl(UsersRepository repository,
                            CommonMapper<Users, RequestUsersDto, ResponseUsersDto> commonMapper,
                            UsersRepository usersRepository,
                            CustomPasswordEncoder customPasswordEncoder) {
        super(repository, commonMapper);
        this.usersRepository = usersRepository;
        this.customPasswordEncoder = customPasswordEncoder;
    }

    private final UsersRepository usersRepository;

    private final CustomPasswordEncoder customPasswordEncoder;


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
        user.setPassword(customPasswordEncoder.encode(user.getPassword()));
        usersRepository.save(user);

    }

}
