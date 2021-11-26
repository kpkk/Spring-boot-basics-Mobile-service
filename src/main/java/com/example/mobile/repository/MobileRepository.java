package com.example.mobile.repository;

import com.example.mobile.entity.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,String> {

   /* Mobile findByModel(String mobileModel);

    List<Mobile> findAllMobiles();*/
}
