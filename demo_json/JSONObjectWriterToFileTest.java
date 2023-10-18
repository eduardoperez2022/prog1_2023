package demo_json;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class JSONObjectWriterToFileTest {
   public static void main(String[] args) throws IOException {
      JSONObject obj = new JSONObject();
      obj.put("Name", "Adithya");
      obj.put("Course", "MCA");
      JSONArray subjects = new JSONArray();
      subjects.add("Subject1: DBMS");
      subjects.add("Subject2: JAVA");
      subjects.add("Subject3: PYTHON");
      obj.put("Subjects:", subjects);
      // try (FileWriter file = new FileWriter("Users/User/Desktop/course1.json")) {
      try (FileWriter file = new FileWriter("C:/temporal/course1.json")) {
         file.write(obj.toJSONString());
         System.out.println("JSON Object write to a File successfully");
         System.out.println("JSON Object: " + obj);
      }
   }
}