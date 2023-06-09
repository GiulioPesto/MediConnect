package com.example.TeamProject.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername().describeConstable();
    }
}
