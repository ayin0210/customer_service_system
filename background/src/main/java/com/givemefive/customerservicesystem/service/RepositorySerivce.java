package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.Repository;

public interface RepositorySerivce {

    void addQuestion(Repository repository);

    void delete(String id);

    String update(Repository repository);

}
