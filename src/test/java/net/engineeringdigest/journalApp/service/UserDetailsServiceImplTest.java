package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

//@SpringBootTest
public class UserDetailsServiceImplTest {
    //@Autowired
    @InjectMocks
    private UserDetailsServiceImpl userDetailsServiceImpl;
    @Mock
    //.@MockBean
    private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void loadUserByUsername(){
        when(userRepository.findByUsername(ArgumentMatchers.anyString()))
                .thenReturn(User.builder()
                        .username("Ram")
                        .password("hgcagcyagscyu")
                        .roles(new ArrayList<>())
                        .build());
        UserDetails user = userDetailsServiceImpl.loadUserByUsername("username");
        Assertions.assertNotNull(user);
    }
}
