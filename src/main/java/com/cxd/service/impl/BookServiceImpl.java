package com.cxd.service.impl;

import com.cxd.dao.system.BookMapper;
import com.cxd.dto.AppointExecution;
import com.cxd.entity.system.Book;
import com.cxd.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cxd
 * @description:
 * @create: 2022-06-01 08:17
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;

    @Override
    public List<Book> getList() {
        return bookMapper.selectAll();
    }

    @Override
    public Book getById(Long bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public AppointExecution appoint(Long bookId, Long studentId) {
        return null;
    }
}
