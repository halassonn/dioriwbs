package com.github.britter.springbootherokudemo.helper.uniquejpa.service;

import com.github.britter.springbootherokudemo.repo_mod.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserDetailsDetailsImpl implements UserDetailsService {

    @Autowired
    UserDetailsRepo userDetailsRepo;

    @Override
    public boolean fieldValueExists(Object value, String fieldName) throws UnsupportedOperationException {
        Assert.notNull(fieldName);

        if (fieldName.equals("email")) {
            return this.userDetailsRepo.existsByEmail(value.toString());
        } else if (fieldName.equals("nik")) {
            return  this.userDetailsRepo.existsByNik(value.toString());
        } else {
            return false;
        }
    }
}
