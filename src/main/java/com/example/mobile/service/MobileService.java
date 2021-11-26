package com.example.mobile.service;

import com.example.mobile.entity.Mobile;
import com.example.mobile.repository.MobileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MobileService {
    @Autowired
    private MobileRepository mobileRepository;

    public Mobile saveMobileModel(Mobile mobile) {
        //log.info("in mobile service");
        return mobileRepository.save(mobile);
    }

  /*  public Mobile getMobileByModelName(String mobileName) {
        return mobileRepository.findByModel(mobileName);
    }

    public List<Mobile> getAllMobiles() {
        return mobileRepository.findAllMobiles();
    }*/
}
