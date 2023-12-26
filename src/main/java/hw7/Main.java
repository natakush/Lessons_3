package hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Users> list = new ArrayList<>();
        list.add(new Users ("Nata", "Kyiv", "Ukraine", 55));
        list.add(new Users ("Roman", "Lviv","Ukraine", 50));
        list.add(new Users ("Mary", "NY", "United States", 15));
        list.add(new Users ("Petro", "Kyiv", "Ukraine", 40));

        List<Users> filteredlist = new ArrayList<>();
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).getCountry().equals("Ukraine")) {
                filteredlist.add(list.get(i));
            }
        }

        Collections.sort(filteredlist);
        filteredlist.forEach(System.out::println);
    }
}
