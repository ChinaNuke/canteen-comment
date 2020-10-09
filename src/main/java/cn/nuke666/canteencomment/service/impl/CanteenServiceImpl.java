package cn.nuke666.canteencomment.service.impl;

import cn.nuke666.canteencomment.model.Canteen;
import cn.nuke666.canteencomment.repository.CanteenRepository;
import cn.nuke666.canteencomment.service.CanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanteenServiceImpl implements CanteenService {

    @Autowired
    private CanteenRepository canteenRepository;

    @Override
    public List<Canteen> getCanteenList() {
        return canteenRepository.findAll();
    }

}
