package com.manning.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;
//UTENTI APPLICAZIONE
public interface ReaderRepository extends JpaRepository<Reader, String> {
}