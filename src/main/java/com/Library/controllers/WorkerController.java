package com.Library.controllers;

import com.Library.data.Worker;
import com.Library.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workers")
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @GetMapping("/all")
    public List<Worker> findAll() {
        return workerService.findAll();
    }

    @GetMapping("/{id}")
    public Worker findById(@PathVariable long id) {
        return workerService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Worker member) {
        workerService.save(member);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Worker worker) {
        workerService.update(id, worker);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        workerService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id) {
        workerService.deleteByID(id);
    }
}



