package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dto.MovieDTO;
import entity.MovieEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import repository.MovieRepository;
import service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;
    private ModelMapper modelMapper;

    public MovieServiceImpl(MovieRepository movieRepository, ModelMapper modelMapper) {
        this.movieRepository = movieRepository;
        this.modelMapper = modelMapper;

        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setTitle("Star Wars");
        movieRepository.save(movieEntity);
    }

    @Override
    public List<MovieDTO> findall() {
        List<MovieEntity> movies = movieRepository.findAll();

        List<MovieDTO> result = new ArrayList<>();

        for (MovieEntity movieEntity : movies) {
            MovieDTO movieDTO = modelMapper.map(movieEntity, MovieDTO.class);
            result.add(movieDTO);
        }
        return result;
    }

    @Override
    public Optional<MovieDTO> findById(Long id) {
        Optional<MovieEntity> movieEntityOptional = movieRepository.findById(id);
        return null;
    }
}
