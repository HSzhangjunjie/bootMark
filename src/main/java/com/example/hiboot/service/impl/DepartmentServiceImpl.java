package com.example.hiboot.service.impl;

import com.example.hiboot.dao.IDepartmentDao;
import com.example.hiboot.entity.Department;
import com.example.hiboot.service.IDepartmentService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.service.impl
 * @ClassName: DepartmentServiceImpl
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/15 20:30
 * @Version: 1.0
 */
@CacheConfig
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private IDepartmentDao departmentDao;

    @Cacheable(cacheNames = "dept")
    @Override
    public Department findById(Integer id) {
        return departmentDao.findById(id).get();
    }

    @CachePut(cacheNames = "dept", key = "#department.id")
    @Override
    public Department update(Department department) {
        departmentDao.save(department);
        return department;
    }

    @CacheEvict(cacheNames = "dept")
    @Override
    public void delete(Integer id) {
        departmentDao.deleteById(id);
    }

    @RabbitListener(queues = "handsome.news")
    @Override
    public void receive(Department department) {
        System.out.println("收到消息：" + department);
    }

}
