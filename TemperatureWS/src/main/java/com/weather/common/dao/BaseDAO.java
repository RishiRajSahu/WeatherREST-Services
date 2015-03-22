package com.weather.common.dao;

import org.springframework.data.mongodb.core.MongoOperations;


public class BaseDAO {
	MongoOperations mongoOperations;

	public MongoOperations getMongoOperations() {
		return mongoOperations;
	}

	public void setMongoOperations(MongoOperations mongoOperations) {
        System.out.println("setMongoOperations:   ");
		this.mongoOperations = mongoOperations;
	}

	public void saveCollection(Object data) {
        System.out.println("saveCollection:   ");
		mongoOperations.save(data);
	}
}
