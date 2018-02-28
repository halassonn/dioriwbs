package com.github.britter.springbootherokudemo.defaultdata;

import com.github.britter.springbootherokudemo.model.DataKantor;
import com.github.britter.springbootherokudemo.model.security.Authority;
import com.github.britter.springbootherokudemo.repo_mod.AuthorityRepo;
import com.github.britter.springbootherokudemo.repo_mod.DataKantor_repo;
import com.github.britter.springbootherokudemo.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class SetupDefaultData implements ApplicationListener<ContextRefreshedEvent> {
    private boolean alreadySetup = false;
    @Autowired
    AuthorityRepo authorityRepo;
    @Autowired
    UserRepository userRepository;
    @Autowired
    DataKantor_repo dataKantorRepo;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        if (alreadySetup) {
            return;
        }
        createRoleIfNotFound("ROLE_ADMIN");
        createRoleIfNotFound("ROLE_USER");

        alreadySetup = true;
    }

    private final Authority createRoleIfNotFound(String name) {
        Authority authority = authorityRepo.findByName(name);
        if (authority == null) {
            authority = new Authority(name);

            authorityRepo.save(authority);
        }
        return authority;
    }
    private final DataKantor createDataKantorIfNotFound(String idkantor, String namakantor, String alamat, String kodepos) {
        DataKantor dataKantor=dataKantorRepo.findByNamakantor(idkantor);

        if (dataKantor == null) {
            dataKantor = new DataKantor(idkantor,namakantor,alamat,kodepos);

            dataKantorRepo.save(dataKantor);
        }
        return dataKantor;
    }



    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
