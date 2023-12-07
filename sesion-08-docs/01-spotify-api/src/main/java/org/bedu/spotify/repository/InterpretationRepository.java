package org.bedu.spotify.repository;

import org.bedu.spotify.model.Interpretation;
import org.bedu.spotify.model.InterpretationKey;
import org.bedu.spotify.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterpretationRepository extends JpaRepository<Interpretation, InterpretationKey> {
    
    // JPQL
    // De todas las interpretaciones "i", obten la canción (i.song)
    // dónde el id del artista (i.artist.id) sea :artistId
    @Query("SELECT i.song FROM Interpretation i WHERE i.artist.id = :artistId")
    List<Song> findSongsByArtist(long artistId);
}
