package com.xworkz.choclate.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.choclate.dto.ChoclateDto;

public class ChoclateRepoImpl implements ChoclateRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ChoclateData");
	EntityManager em = emf.createEntityManager();
	
	public boolean createAll(ChoclateDto dto) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return true;
	}

	public List<ChoclateDto> readAll() {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll", ChoclateDto.class);
			em.getTransaction().commit();
			return query.getResultList();
		}
		return null;
	}

	public ChoclateDto findByColorAndWeight(String color, int weight) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByColorAndWeight",ChoclateDto.class);
			query.setParameter("color", color);
			query.setParameter("weight", weight);
			em.getTransaction().commit();
			return (ChoclateDto) query.getSingleResult();
		}
		return null;	
	}

	public ChoclateDto findByPriceAndName(int price, String name) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByPriceAndName",ChoclateDto.class);
			query.setParameter("price", price);
			query.setParameter("name", name);
			em.getTransaction().commit();
			return (ChoclateDto) query.getSingleResult();
		}
		return null;
	}

	public boolean updateWeightByNameAndColor(int weight, String name, String color) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateWeightByNameAndColor");
			query.setParameter("weight", weight);
			query.setParameter("name", name);
			query.setParameter("color", color);
			query.executeUpdate();
			return true;
		}
		return false;
	}

	public boolean updateNameByidAndWeight(String name, int id, int weight) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateNameByidAndWeight");
			query.setParameter("name", name);
			query.setParameter("id", id);
			query.setParameter("weight", weight);
			query.executeUpdate();
			return true;
		}
		return false;
	}

	public boolean deletebyColorAndName(String color, String name) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deletebyColorAndName");
			query.setParameter("color", color);
			query.setParameter("name", name);
			query.executeUpdate();
			return true;
		}
		return false;
	}

	public boolean updateNameById(String name, int id) {
		em.getTransaction().begin();
		ChoclateDto dto = em.find(ChoclateDto.class, id);
		dto.setName(name);
		em.merge(dto);
		em.getTransaction().commit(); 
		return true;
	}

	public ChoclateDto findById(int id) {
		em.getTransaction().begin();
		ChoclateDto dto = em.find(ChoclateDto.class, id);
		em.getTransaction().commit();
		return dto;
	}

	public boolean deleteById(int id) {
		em.getTransaction().begin();
		ChoclateDto dto = em.find(ChoclateDto.class, id);
		em.remove(dto);
		em.getTransaction().commit();
		return true;
	}

}
