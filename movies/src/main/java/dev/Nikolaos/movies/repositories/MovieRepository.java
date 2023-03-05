package dev.Nikolaos.movies.repositories;

import dev.Nikolaos.movies.entities.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //method for return a movie by imdb
    Optional<Movie> getMovieByImdbId(String ImdbId);
}
