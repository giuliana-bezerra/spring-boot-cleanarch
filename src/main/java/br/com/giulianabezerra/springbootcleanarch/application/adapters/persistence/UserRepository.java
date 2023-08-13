package br.com.giulianabezerra.springbootcleanarch.application.adapters.persistence;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
