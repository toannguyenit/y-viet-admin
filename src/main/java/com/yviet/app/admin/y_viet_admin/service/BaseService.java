package com.yviet.app.admin.y_viet_admin.service;

import java.util.Optional;

public interface BaseService<E, I, O, U> {
    Optional<O> create(I t);

    Optional<O> update(U u);

    Optional<O> delete(String id);

    Optional<?> updateInfor(String id,U u);

}
