package com.karma.gema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.karma.gema.model.CompanyType;

@Repository
public interface CompanyTypeRepository extends JpaRepository<CompanyType, Long> {
	
	@Query("select t from Company c join c.companyType t where c.id = (:idcompany)")
	public CompanyType findByCompanyId(@Param("idcompany") Long id);

}
