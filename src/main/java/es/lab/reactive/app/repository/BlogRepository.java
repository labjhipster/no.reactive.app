package es.lab.reactive.app.repository;

import es.lab.reactive.app.domain.Blog;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Blog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BlogRepository extends MongoRepository<Blog, String> {
}
