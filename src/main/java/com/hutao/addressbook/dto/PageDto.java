package com.hutao.addressbook.dto;

import lombok.Data;

import java.util.List;

/**
 * @author xxx
 * @date 2023/10/31 19:54
 */
@Data
public class PageDto<T> {
    protected Long totalElements;
    private Long pages;
    protected List<T> content;

    public PageDto(Long totalElements, Long pages, List<T> content) {
        this.totalElements = totalElements;
        this.pages = pages;
        this.content = content;
    }
}
