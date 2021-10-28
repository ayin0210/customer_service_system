package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.Repository;



public interface RepositoryDao {

    void addQuestion(Repository repository);

    void delete(String id);

    void update(Repository repository);

    Repository queryById(String id);


}
