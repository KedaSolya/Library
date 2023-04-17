package com.Library.services;

import com.Library.data.Database;
import com.Library.data.Worker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    private final Database database = new Database();

    public List<Worker> findAll() {
        return database.getWorkerArrayList();
    }

    public Worker findById(long id) {
        for (int i = 0; i < database.getWorkerArrayList().size(); i++) {
            if (database.getWorkerArrayList().get(i).getId() == (id)) {
                return database.getWorkerArrayList().get(i);
            }
        }
        return null;
    }

    public void save(Worker worker) {
        database.setWorkerArrayList(worker);
    }

    public void deleteAll() {
        database.getWorkerArrayList().clear();
    }

    public void deleteByID(long id) {
        database.getWorkerArrayList().remove(findById(id));
    }

    public void update(long id, Worker member) {
        Worker toUpdateMember = findById(id);
        toUpdateMember.setId(member.getId());
        toUpdateMember.setName(member.getName());
        toUpdateMember.setAge(member.getAge());
        toUpdateMember.setSex(member.getSex());
        toUpdateMember.setPosition(member.getPosition());
        toUpdateMember.setWorkingYears(member.getWorkingYears());
    }
}
