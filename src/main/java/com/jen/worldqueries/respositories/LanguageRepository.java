package com.jen.worldqueries.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jen.worldqueries.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	// Sets findAll() to return Language objects
	List<Language> findAll();
}
