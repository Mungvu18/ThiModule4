package thi_module4.test.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import thi_module4.test.model.City;

import java.nio.file.Path;
import java.util.List;

@Repository
public interface CityRepo extends PagingAndSortingRepository<City,Integer> {
    @Query(nativeQuery = true,value = "select * from city where country_id = ?")
    Page<City> showAllCityByCountry(int country_id, Pageable pageable);
    @Query(nativeQuery = true,value = "select * from city where name like ?")
    Page<City> showAllCityByContainerName(String name, Pageable pageable);
}
