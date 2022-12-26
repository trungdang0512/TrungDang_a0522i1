package com.example.bt_tokhaiyte.service;

import com.example.bt_tokhaiyte.model.CovidForm;

public interface IFormService {
    void updateForm(CovidForm newForm);
    CovidForm displayForm();
}
