package com.github.britter.springbootherokudemo.helper.uniquejpa.service;

import com.github.britter.springbootherokudemo.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserAuthImpl implements UserAuthService {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean fieldValueExists(Object value, String fieldName) throws UnsupportedOperationException {
        Assert.notNull(fieldName);

        if(fieldName.equals("username")){
            return this.userRepository.existsByUsername(value.toString());
        }else{
            return false;
        }
    }
}
