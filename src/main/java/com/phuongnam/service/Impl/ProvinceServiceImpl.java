package com.phuongnam.service.Impl;

import com.phuongnam.model.Province;
import com.phuongnam.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceServiceImpl implements com.phuongnam.service.ProvinceService {
@Autowired
private ProvinceRepository provinceRepository;
    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}