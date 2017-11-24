package com.karma.gema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.karma.gema.model.Stores;

@Repository
public interface StoresRepository extends JpaRepository<Stores, Long> {
	
	@Query("SELECT s FROM Stores s WHERE s.wharehouse.id = :id")
	public List<Stores> findByWharehouseId(@Param("id") Long id);
	
	@Procedure
	public boolean sp_stores(Long idProduct, Long idWharehouse, double quantity);
}
