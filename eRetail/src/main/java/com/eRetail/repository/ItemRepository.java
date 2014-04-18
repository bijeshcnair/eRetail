package com.eRetail.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.eRetail.pojo.Item;
import java.util.List;
public interface ItemRepository extends MongoRepository<Item, String> {

	public Item findByItemID(String itemID);
	public List<Item> findItemByLocation(float longi,float lati);
	
}
