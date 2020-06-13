package com.easyRent.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.easyRent.domain.Property;;

	@Repository
	public interface PropertyRepository extends  CrudRepository<Property, Long> 
	{
		@Query("select e from Property  e where e.id= :id")
		public Property findByPropertyNumber(@Param("id") Long propertyNumber);
 	}

