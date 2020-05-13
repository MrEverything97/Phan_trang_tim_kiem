package com.phuongnam.repository;

import com.phuongnam.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;




public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
