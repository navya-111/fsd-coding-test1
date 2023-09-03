package com.repo.docs.repository;

import com.repo.docs.entity.FileItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileItemRepository extends MongoRepository<FileItem, Long> {
}
