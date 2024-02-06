package hw7;

import java.util.*;

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

        Map<String, String> Meal1 = new HashMap<>();
        Meal1.put("mealName","Pizza Verona");
        Meal1.put("eatingType","fast");
        Meal1.put("cookingTime","40");

        Map<String, String> Meal2 = new HashMap<>();
        Meal2.put("mealName","Sushi Dragon");
        Meal2.put("eatingType","slow");
        Meal2.put("cookingTime","115");

        List<Map> Datalist = new ArrayList<>();
        Datalist.add(Meal1);
        Datalist.add(Meal2);

        Map<String, List> Data = new HashMap<>();
        Data.put("data",Datalist);

        Map<String, String> PaginationData = new HashMap<>();
        PaginationData.put("total","4308");
        PaginationData.put("limit","2");
        PaginationData.put("offset","30");

        Map<String, Map> Pagination = new HashMap<>();
        Pagination.put("pagination",PaginationData);

        List<Map> Json = new ArrayList<>();
        Json.add(Data);
        Json.add(Pagination);

        System.out.println();
        System.out.println("{"+Json.get(0)+", "+Json.get(1)+"}");
        System.out.println();

        Datalist.add(new HashMap<>(Map.of("mealName", "PizzaSSSS")));
        System.out.println("New object added to 'data' list");
        System.out.println("{"+Json.get(0)+", "+Json.get(1)+"}");
        System.out.println();

        System.out.println("Searching for pizza in our json");
        List<Map> SearchResult = new ArrayList<>();
        for (int i=0; i<Datalist.size(); i++) {
            if (Datalist.get(i).get("mealName").toString().contains("Pizza")) {
                SearchResult.add(Datalist.get(i));
            }
        }
        System.out.println(SearchResult);
        System.out.println(PaginationData);
    }
}
