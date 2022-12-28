package com.example.bt_tokhaiyte.service;

import com.example.bt_tokhaiyte.model.CovidForm;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements IFormService{
    private CovidForm covidForm = new CovidForm();
    @Override
    public void updateForm(CovidForm newForm) {
        covidForm = newForm;
    }

    @Override
    public CovidForm displayForm() {
        return covidForm;
    }

}
