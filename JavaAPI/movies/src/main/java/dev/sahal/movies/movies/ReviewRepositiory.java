package dev.sahal.movies.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepositiory extends MongoRepository<Review, ObjectId> {
}
