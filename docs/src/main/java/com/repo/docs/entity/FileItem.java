package com.repo.docs.entity;

import lombok.Data;
import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "filestorage")
public class FileItem {

    @Transient
    public static final String SEQUENCE_NAME = "fileItemSeq";

    @Id
    private long id;

    private String userId;

    private String fileName;

    private LocalDateTime uploadDate;

    private ObjectId fileData;
}
