package com.SpringBootJpaEntityGenSequence.repository;

import com.SpringBootJpaEntityGenSequence.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
}
