package com.tolgaybalci.webticarialan.ticarialanerp.repository;

import com.tolgaybalci.webticarialan.ticarialanerp.domain.Teklifler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TekliflerRepository extends CrudRepository<Teklifler, Long> {
}
