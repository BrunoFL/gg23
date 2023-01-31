package com.fapguys.studio.ggj23.gamer;


import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface GamerRepository extends ListCrudRepository<Gamer, Long> {

    @Override
    List<Gamer> findAll();

    @Override
    <S extends Gamer> S save(S entity);

    @Override
    long count();

    @Override
    Optional<Gamer> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    void deleteAll();

    @Override
    void deleteById(Long aLong);
}
