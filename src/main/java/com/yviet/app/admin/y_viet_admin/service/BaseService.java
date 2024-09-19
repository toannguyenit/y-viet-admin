package com.yviet.app.admin.y_viet_admin.service;

import java.util.Optional;

public interface BaseService<T> {
   Optional<T>  create(T t);
    T update(T t);
    T delete(int id);
}
