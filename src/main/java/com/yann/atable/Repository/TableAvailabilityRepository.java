package com.yann.atable.Repository;

import com.yann.atable.Model.TableAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableAvailabilityRepository extends JpaRepository<TableAvailability, Long> {
}
