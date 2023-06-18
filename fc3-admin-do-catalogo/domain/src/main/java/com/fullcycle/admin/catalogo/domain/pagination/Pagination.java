package com.fullcycle.admin.catalogo.domain.pagination;

import java.util.List;

//o papel do record é ser um dto imutavel que vai passar informação de um lado pro outro.
public record Pagination<T>(
        int currentPage,
        int perPage,
        long total,
        List<T> items
) {
}
