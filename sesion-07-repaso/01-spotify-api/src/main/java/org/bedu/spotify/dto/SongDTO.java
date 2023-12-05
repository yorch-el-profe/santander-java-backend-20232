package org.bedu.spotify.dto;

import lombok.Data;

@Data
public class SongDTO {
    
    private long id;
    private String name;
    private int duration;
}
