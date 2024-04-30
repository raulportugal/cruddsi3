package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cCustomer;

public interface iCustomer {
    public List<cCustomer> find();
    public Optional<cCustomer> findById(int id);
    public int save(cCustomer obj);
    public void delete(int id);
}
