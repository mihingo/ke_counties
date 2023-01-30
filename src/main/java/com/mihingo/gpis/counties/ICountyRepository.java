package com.mihingo.gpis.counties;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICountyRepository extends MongoRepository<County, ObjectId> {
    Optional<County> findCountyByCode(Integer code);
}
