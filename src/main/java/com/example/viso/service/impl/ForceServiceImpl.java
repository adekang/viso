package com.example.viso.service.impl;

import com.example.viso.entity.ForceEntity;
import com.example.viso.entity.ForceLinkEntity;
import com.example.viso.entity.ForceNodeEntity;
import com.example.viso.mapper.ForceMapper;
import com.example.viso.service.IForceService;
import com.example.viso.service.ex.SelectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ForceServiceImpl implements IForceService {
    @Autowired
    private ForceMapper mapper;

    @Override
    public ForceEntity selectForce(String category) {

//        根据类别查询边
        List<ForceLinkEntity> list_link = mapper.selectLink(category);
        if (list_link == null && list_link.size() == 0) {
            throw new SelectException("数据库异常");
        }
//        将边对应的名字存入链表中
        Set<String> set = new HashSet();
        for (ForceLinkEntity entity : list_link) {
            set.add(entity.getSource());
            set.add(entity.getTarget());
        }
        List<String> list_name = new ArrayList<>();
        list_name.addAll(set);

//        根据类别和名字查询节点
        List<ForceNodeEntity> list_node = mapper.selectNode(category, list_name);
        if (list_node == null && list_node.size() == 0) {
            throw new SelectException("数据库异常");
        }

//        合并边与节点
        ForceEntity force = new ForceEntity();
        force.setLink(list_link);
        force.setNode(list_node);
        return force;
    }

    @Override
    public List<ForceLinkEntity> selectByName(String name) {
        return mapper.selectByName(name);
    }
}
