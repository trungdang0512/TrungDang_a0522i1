package com.example.demo.service;

import com.example.demo.model.Sale;
import com.example.demo.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@Service
public class SaleService implements ISaleService {
    @Autowired
    private ISaleRepository saleRepository;

    @Override
    public List<Sale> findAll() {
        return saleRepository.findAll();
    }

    @Override
    public void save(Sale sale) {
        saleRepository.save(sale);
    }

    @Override
    public Sale findById(Long id) {
        return saleRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        saleRepository.deleteById(id);
    }

    public List<Sale> find(String q) {
        if (!StringUtils.isEmpty(q)) {
            String[] tmp = q.split(":");
            String searchBy = tmp[0];
            String searchVal = tmp[1];
            switch (searchBy) {
                case "price":
                    return saleRepository.findByPriceContaining("%".concat(searchVal).concat("%"));
                case "startDate":
                    return saleRepository.findByStartDateContaining("%".concat(searchVal).concat("%"));
                case "endDate":
                    return saleRepository.findByEndDateContaining("%".concat(searchVal).concat("%"));
                default:
                    List<Sale> sale = saleRepository.findAllByValue("%".concat(searchVal).concat("%"));
                    return sale;
            }
        }
        return saleRepository.findAll();
    }

    @Override
    public List<Sale> findByPrice(Integer price) {
        return saleRepository.findByPrice(price);
    }

    @Override
    public List<Sale> findByStart(String start) {
        return saleRepository.findByStart(start);
    }

    @Override
    public List<Sale> findByEnd(String end) {
        return saleRepository.findByEnd(end);
    }
}
