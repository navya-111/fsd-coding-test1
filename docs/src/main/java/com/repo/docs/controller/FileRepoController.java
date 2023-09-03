package com.repo.docs.controller;

import com.repo.docs.entity.FileItem;
import com.repo.docs.service.FileItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/filerepo")
public class FileRepoController {

    @Autowired
    private FileItemService fileItemService;
    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file,
                                                   @RequestHeader(value="userId") String userId) throws IOException {
        fileItemService.uploadFile(file, userId);

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping("/getall")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<FileItem> getAllFileItems() {
        return fileItemService.getAllFileItems();
    }

    @PostMapping("/delete")
    @CrossOrigin(origins = "http://localhost:4200")
    public String deleteFileRepoItem(@RequestParam(name = "id") long itemId) {
        return fileItemService.deleteItem(itemId);
    }

    @GetMapping("/download")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<ByteArrayResource> download(@RequestParam(name = "id") long id) throws IOException {
        return fileItemService.downloadFile(id);
    }
}