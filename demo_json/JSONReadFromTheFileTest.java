package demo_json;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class JSONReadFromTheFileTest {
   public static void main(String[] args) {
      JSONParser parser = new JSONParser();
      try {
         // Object obj = parser.parse(new FileReader("/Users/User/Desktop/course.json"));
         Object obj = parser.parse(new FileReader("c:/Users/eduardo/Documents/NetBeansProjects_2023/demo_json/src/demo_json/course.json"));
         JSONObject jsonObject = (JSONObject)obj;
         String name = (String)jsonObject.get("Name");
         String course = (String)jsonObject.get("Course");
         JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
         System.out.println("Name: " + name);
         System.out.println("Course: " + course);
         System.out.println("Subjects:");
         Iterator iterator = subjects.iterator();
         while (iterator.hasNext()) {
            System.out.println(iterator.next());
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}
