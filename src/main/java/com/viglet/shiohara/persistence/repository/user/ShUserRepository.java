package com.viglet.shiohara.persistence.repository.user;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.viglet.shiohara.persistence.model.site.ShSite;
import com.viglet.shiohara.persistence.model.user.ShUser;

public interface ShUserRepository extends JpaRepository<ShUser, String> {

	List<ShUser> findAll();

	Optional<ShUser> findById(String id);

	@SuppressWarnings("unchecked")
	ShUser save(ShUser shUser);
	
	ShUser findByUsername(String username);
	
	@Modifying
	@Query("delete from ShUser p where p.id = ?1")
	void delete(String id);
}
