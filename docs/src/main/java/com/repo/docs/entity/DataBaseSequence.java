package com.repo.docs.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
@Data
public class DataBaseSequence {

    @Id
    private String id;

    private long seq;
}
