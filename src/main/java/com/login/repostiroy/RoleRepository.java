/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login.repostiroy;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.login.model.Role;



public interface RoleRepository extends MongoRepository<Role, String> {
    
    Role findByRole(String role);
}
