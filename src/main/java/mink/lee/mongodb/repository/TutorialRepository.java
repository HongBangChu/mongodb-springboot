package mink.lee.mongodb.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import mink.lee.mongodb.model.*;
public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  Page<Tutorial> findByPublished(boolean published, Pageable pageable);
  Page<Tutorial> findByTitleContainingIgnoreCase(String title, Pageable pageable);
}