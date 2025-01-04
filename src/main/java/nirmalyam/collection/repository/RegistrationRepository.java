package com.nirmalyam.collection.repository;

import com.nirmalyam.collection.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
