package org.bedu.spotify.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class InterpretationKey {
    
    @Column(name = "song_id")
    private long songId;

    @Column(name = "artist_id")
    private long artistId;
}
