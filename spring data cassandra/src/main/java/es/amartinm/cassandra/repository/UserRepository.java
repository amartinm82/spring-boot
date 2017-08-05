package es.amartinm.cassandra.repository;

import es.amartinm.cassandra.domain.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by amartinm82 on 26/07/2017.
 */
@Repository
public interface UserRepository extends CassandraRepository<User> {
}
