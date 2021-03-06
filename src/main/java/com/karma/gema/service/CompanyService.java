package com.karma.gema.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.karma.gema.model.Company;
import com.karma.gema.request.CompanyRequest;

public interface CompanyService {
	
	public Company findById(Long id);
	public Company findByIdUser(Long id);
	public List<Company> findAll();
	public Company saveCompany(CompanyRequest companyRequest);
	public Company createCompany(CompanyRequest companyRequest);
	public List<Company> createCompany();
	public Company updateCompany(Long id, CompanyRequest companyRequest);
	public ResponseEntity<Object> deleteCompany(Long id);
	

}
