package org.bedu.spotify.repository;

import org.bedu.spotify.model.Interpretation;
import org.bedu.spotify.model.InterpretationKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterpretationRepository extends JpaRepository<Interpretation, InterpretationKey> {
    
}
