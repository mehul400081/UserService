package com.user.service.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserComponent {

    @Value( "${testUser.name}" )
    private String userName;

    @Value( "${testUser.age}" )
    private String age;
    
    @Value( "${testUser.pin}" )
    private String pinCode;


    public String getUserName(){
         return this.userName;
    }
    
    public String getAge(){
        return this.age;
   }

   public String getPinCode(){
    return this.pinCode;
}

}
