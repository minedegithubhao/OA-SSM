package com.cxd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 图书实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private int bookId;
	private String bookName;
	private int number;
}
