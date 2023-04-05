package service;

import java.util.List;
import java.util.Optional;

import dto.MovieDTO;

public interface MovieService {
    List<MovieDTO> findall();

    Optional<MovieDTO> findById(Long id);
}
