package com.iquiz.backend.controller;

import com.iquiz.backend.entity.LiteratureEntity;
import com.iquiz.backend.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/literature")
public class LiteratureController {
    private LiteratureService literatureService;

    @Autowired
    public LiteratureController(LiteratureService literatureService) {
        this.literatureService = literatureService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<LiteratureEntity> getLiteratureById(@PathVariable(name = "id") Integer id) {
        Optional<LiteratureEntity> literatureEntity = literatureService.getLiteratureById(id);
        if (literatureEntity.isPresent()) {
            return ResponseEntity.ok(literatureEntity.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<LiteratureEntity> getAllLiterature() {
        return literatureService.getAllLiterature();
    }

    @RequestMapping(method = RequestMethod.POST)
    public LiteratureEntity saveLiterature(@RequestBody LiteratureEntity literature) {
        return literatureService.saveLiterature(literature);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteLiterature(@PathVariable(name = "id") Integer id) {
        literatureService.deleteLiterature(id);
    }
}
