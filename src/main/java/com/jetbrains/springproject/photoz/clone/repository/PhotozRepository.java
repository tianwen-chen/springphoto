package com.jetbrains.springproject.photoz.clone.repository;

import com.jetbrains.springproject.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}
