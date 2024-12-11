package az.abbtech.lesson_9.lesson;

import az.abbtech.lesson_7.equals_tostring_hashcode.Employee;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> studentsScores = new HashMap<>();
        studentsScores.put("students1", 10);
        studentsScores.put("students2", 20);
        studentsScores.put("students3", 30);
        studentsScores.put("students4", 40);
        studentsScores.put("student5", null);
        studentsScores.put("student6", null);
        studentsScores.put("student7", null);
        studentsScores.put("student8", null);
        Integer student4Value = studentsScores.get("students4");
        Integer i = studentsScores.remove("students4");

        boolean isKeyContains = studentsScores.containsKey("students5");
        boolean isValueContains = studentsScores.containsValue("10");

        // 1.
        Set<String> keys = studentsScores.keySet();
        for(String key : keys) {
            System.out.println("key" + ": " + studentsScores.get(key));
        }
        
        // 2.
        Collection<Integer> values = studentsScores.values();
        for(Integer value : values) {
            System.out.println("value" + ": " + studentsScores.get(value));
        }

        // 3.
        Set<Map.Entry<String, Integer>> entries = studentsScores.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + ": " + next.getValue());
        }

        Map<Student, Boolean> studentsMap = new HashMap<>();
        Student student1 = new Student("student1", 30);
        Student student2 = new Student("student1", 20);

        studentsMap.put(student1, true);
        studentsMap.put(student2, false);

        var aBoolean = studentsMap.get(student2);
        System.out.println(aBoolean.toString());




        // unique keys, duplicate value ola biler, null key yalniz bir defe ola biler, unordered,
    }
}
