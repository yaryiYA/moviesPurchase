package com.example.projectnine.service.impl;

import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.dto.user.RequestUsersDto;
import com.example.projectnine.dto.user.ResponseUsersDto;
import com.example.projectnine.entity.Film;
import com.example.projectnine.entity.Users;
import com.example.projectnine.mapper.film.FilmCommonMapper;
import com.example.projectnine.mapper.user.UsersCommonMapper;
import com.example.projectnine.repository.impl.UsersRepository;
import com.example.projectnine.security.CustomPasswordEncoder;
import com.example.projectnine.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsersServiceImpl extends BaseService<Users,
        UsersRepository,
        RequestUsersDto,
        ResponseUsersDto,
        UsersCommonMapper>
        implements UserDetailsService {
    @Autowired
    public UsersServiceImpl(UsersRepository repository,
                            UsersCommonMapper commonMapper,
                            UsersRepository usersRepository,
                            CustomPasswordEncoder customPasswordEncoder,
                            FilmCommonMapper filmCommonMapper) {
        super(repository, commonMapper);
        this.usersRepository = usersRepository;
        this.customPasswordEncoder = customPasswordEncoder;
        this.filmCommonMapper = filmCommonMapper;
    }

    private final UsersRepository usersRepository;

    private final CustomPasswordEncoder customPasswordEncoder;
    private final FilmCommonMapper filmCommonMapper;


    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Users user = usersRepository.findByLogin(login);

        return User.builder()
                .username(user.getLogin())
                .password(user.getPassword())
                .roles(user.getRole().getTitle())
                .build();
    }

    public ResponseUsersDto registerUser(RequestUsersDto requestUsersDto) {
        Users entity = super.commonMapper.toEntity(requestUsersDto);
        super.repository.save(entity);
        return super.commonMapper.toResponse(entity);
    }

    public List<ResponseFilmDto> allFilmsByUser(UUID userId) {
        List<Film> films = super.repository.findFilmsByUser(userId);
        return films.stream()
                .map(filmCommonMapper::toResponse).toList();
    }
}





