package com.cxd.service;

import com.cxd.dto.AppointExecution;
import com.cxd.entity.system.Book;

import java.util.List;

/**
 * @author cxd
 * @description:
 * @create: 2022-06-01 08:15
 */
public interface BookService {

    List<Book> getList();

    Book getById(Long bookId);

    AppointExecution appoint(Long bookId, Long studentId);
}
