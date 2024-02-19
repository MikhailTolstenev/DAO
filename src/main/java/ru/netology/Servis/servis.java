package ru.netology.Servis;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.repository.Repository;

import java.util.List;

@Service
@AllArgsConstructor
public class servis {
    private Repository repository;

    public List<String> getProductName(String name) {

        return repository.getProductName(name);
    }
}