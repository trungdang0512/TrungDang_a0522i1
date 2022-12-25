package com.example.bt_dictionary.Service;

import com.example.bt_dictionary.repository.DictionaryRepositoryImpl;
import com.example.bt_dictionary.repository.IDictionaryRepository;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService{
    private DictionaryRepositoryImpl dictionaryRepository = new DictionaryRepositoryImpl();

    @Override
    public String find(String input) {
        return dictionaryRepository.find(input);
    }
}
