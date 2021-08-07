package com.algaworks.algafoodapi.domain.repository;

import com.algaworks.algafoodapi.domain.model.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenRepository extends JpaRepository<Kitchen, Long> {
}
