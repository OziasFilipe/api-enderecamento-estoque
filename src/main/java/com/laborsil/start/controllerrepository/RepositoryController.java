package com.laborsil.start.controllerrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.laborsil.start.model.ControllerEntity;

@Service
public interface RepositoryController extends JpaRepository<ControllerEntity,Long> {

	@Query("FROM ControllerEntity WHERE andamento_chamado = ?1")
	List<ControllerEntity> findByAndamentoChamado(String andamento_chamado);
	
}
