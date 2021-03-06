package com.karma.gema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.karma.gema.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	@Query("SELECT c FROM User u INNER JOIN Company c ON u.employer = c.id WHERE u.id = :idUser")
	public Company findByUserId(@Param("idUser") Long id);
}
