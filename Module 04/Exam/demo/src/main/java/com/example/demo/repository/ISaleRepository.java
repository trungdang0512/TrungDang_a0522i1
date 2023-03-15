package com.example.demo.repository;

import com.example.demo.model.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ISaleRepository extends JpaRepository<Sale, Long> {
    @Query(value = "select c.* from customer where c.name like ?1 or c.birthday like ?1 or c.genger like ?1 or c.id_card like ?1 or c.phone like ?1 or c.mail like ?1 or c.address like ?1",
            countQuery = "select c.* from customer c\n" +
                    " join customertype ct on c.customer_type_id=ct.customer_type_id\n" +
                    " where c.name like ?1 or c.birthday like ?1 or c.genger like ?1 or c.id_card like ?1 or c.phone like ?1 or c.mail like ?1 or c.address like ?1", nativeQuery = true)
    List<Sale> findAllByValue(String concat);

    @Query(value = "select * from sale where price like ?1",
            countQuery = "select count(*) from sale where price like ?1", nativeQuery = true)
    List<Sale> findByPriceContaining(String searchVal);

    @Query(value = "select * from sale where start_date like ?1",
            countQuery = "select count(*) from sale where start_date like ?1", nativeQuery = true)
    List<Sale> findByStartDateContaining(String searchVal);

    @Query(value = "select * from sale where end_date like ?1",
            countQuery = "select count(*) from sale where end_date like ?1", nativeQuery = true)
    List<Sale> findByEndDateContaining(String searchVal);

    @Query(value = "select * from sale where price like ?1", countQuery = "select * from sale where price like ?1", nativeQuery = true)
    List<Sale> findByPrice(Integer s);


    @Query(value = "select * from sale where start_date like ?1", countQuery = "select * from sale where start_date like ?1", nativeQuery = true)
    List<Sale> findByStart(String start);
    @Query(value = "select * from sale where end_date like ?1", countQuery = "select * from sale where end_date like ?1", nativeQuery = true)

    List<Sale> findByEnd(String end);
}
