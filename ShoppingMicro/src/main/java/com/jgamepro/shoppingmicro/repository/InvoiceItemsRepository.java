package com.jgamepro.shoppingmicro.repository;


import com.jgamepro.shoppingmicro.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
