package com.example.backend.service.implementation;

import com.example.backend.model.Topic;
import com.example.backend.model.User;
import com.example.backend.model.dto.UserCredentialsDto;
import com.example.backend.model.dto.UserDto;
import com.example.backend.model.exceptions.InvalidPasswordException;
import com.example.backend.model.exceptions.UserDoesntExistException;
import com.example.backend.model.exceptions.UserExistsException;
import com.example.backend.repository.InMemoryProgressRepository;
import com.example.backend.repository.InMemoryTopicRepository;
import com.example.backend.repository.InMemoryUserRepository;
import com.example.backend.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final InMemoryUserRepository userRepository;
    private final InMemoryTopicRepository topicRepository;
    private final InMemoryProgressRepository progressRepository;

    public UserServiceImpl(InMemoryUserRepository userRepository, InMemoryTopicRepository topicRepository, InMemoryProgressRepository progressRepository) {
        this.userRepository = userRepository;
        this.topicRepository = topicRepository;
        this.progressRepository = progressRepository;
    }

    @Override
    public UserDto login(UserCredentialsDto userCredentialsDto) {
        User user = userRepository.getUserByUsername(userCredentialsDto.getUsername());

        if (user == null)
            throw new UserDoesntExistException();

        if (!user.getPassword().equals(userCredentialsDto.getPassword()))
            throw new InvalidPasswordException();

        return new UserDto(user.getId(), user.getUsername());
    }

    @Override
    public UserDto register(UserCredentialsDto userCredentialsDto) {
        if (userRepository.doesUserExist(userCredentialsDto.getUsername()))
            throw new UserExistsException();

        User user = userRepository.addUser(new User(userCredentialsDto.getUsername(), userCredentialsDto.getPassword()));

        List<Topic> allTopics = topicRepository.getAll();

        allTopics.forEach(topic ->
            progressRepository.newProgressForTopicForUser(topic.getId(), user.getId())
        );

        return new UserDto(user.getId(), user.getUsername());
    }
}
