package org.example.springbe.dto;

import jakarta.websocket.server.ServerEndpoint;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MoviesDto {
    private List<MovieDto> movies;
}
