package com.example.postgrespringboot.Repository;

import com.example.postgrespringboot.Model.School;
import org.springframework.data.repository.CrudRepository;

public interface SchoolRepository extends CrudRepository<School, String> {
}
