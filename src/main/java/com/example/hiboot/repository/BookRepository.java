package com.example.hiboot.repository;

import com.example.hiboot.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * description :
 *
 * @author : HandSomeMaker
 * @date : 2020/7/18 22:27
 */

public interface BookRepository extends ElasticsearchRepository<Book,Integer> {
}
