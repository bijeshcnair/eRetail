package com.eRetail.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.eRetail.pojo.Item;

import java.util.List;

@RepositoryRestResource(collectionResourceRel="item",path="item")
public interface ItemRepository extends MongoRepository<Item, String> {

	public Item findByItemID(@Param("itemid") String itemID);
	//	public List<Item> findItemByLocation(float longi,float lati);
	
}
