package com.springbootboilerplate.security.config;


import com.springbootboilerplate.security.entity.Role;
import com.springbootboilerplate.security.repository.RoleRepository;
import com.springbootboilerplate.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SecurityConfiguration {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Bean
    public void setupData(){
        //Roles
        Role role;

        role = new Role("USER");
        role.setId(1L);
        roleRepository.save(role);

        role = new Role("MODERATOR");
        role.setId(2L);
        roleRepository.save(role);

        role = new Role("ADMIN");
        role.setId(3L);
        roleRepository.save(role);
/*

        //User
        User user;

        user = new User();
        user.setUsername("sazeem");
        user.setEmail("sazeem@nisum.com");
        user.setPassword("sazeem@123");

        Set<Role> roles = new HashSet<>();
        Role role1 = new Role("ADMIN");
        role1.setId(3L);

        roles.add(role1);

        user.setRoles(roles);
        userRepository.save(user);

 */
    }
}
