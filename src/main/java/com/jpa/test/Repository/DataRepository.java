package com.jpa.test.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.Entity.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
}
