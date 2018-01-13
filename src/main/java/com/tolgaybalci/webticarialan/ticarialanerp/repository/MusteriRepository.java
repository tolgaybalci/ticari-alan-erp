package com.tolgaybalci.webticarialan.ticarialanerp.repository;

import com.tolgaybalci.webticarialan.ticarialanerp.domain.Musteri;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusteriRepository extends CrudRepository<Musteri, Long> {
}
