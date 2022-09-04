package com.cronycommunity.inventorymanagementsystem.loginrepository;
import com.cronycommunity.inventorymanagementsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginRepository extends JpaRepository<User, Long>{
	User findByLoginNameAndParola(String loginName, String parola);
}
