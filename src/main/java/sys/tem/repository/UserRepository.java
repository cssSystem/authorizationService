package sys.tem.repository;

import org.springframework.stereotype.Repository;
import sys.tem.auto.Authorities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        Map<String, String> users = new HashMap<>();
        users.put("Oleg", "1234");
        users.put("Ivan", "0000");

        if (users.containsKey(user) && users.get(user).equals(password)) {
            List<Authorities> list = new ArrayList<>();
            list.add(Authorities.READ);
            list.add(Authorities.WRITE);
            list.add(Authorities.DELETE);
            return list;
        } else {
            return new ArrayList<>();
        }
    }
}