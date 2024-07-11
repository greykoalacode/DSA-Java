package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsernameValidation {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    public static String validateUser(String username) {
        return username.matches(regularExpression) ? "Valid" : "Invalid";
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File(System.getProperty("user.dir") + "\\leetcodePractice\\src\\string\\input.txt");
            File output = new File(System.getProperty("user.dir") + "\\leetcodePractice\\src\\string\\output.txt");
            Scanner myReader = new Scanner(inputFile);
            Scanner outputReader = new Scanner(output);
            List<String> results = new ArrayList<>();
//            int input = myReader.nextInt();
            int index = 0;

            while (outputReader.hasNextLine()) {
                String result_String = outputReader.nextLine();
                results.add(result_String);
            }

            while (myReader.hasNextLine()) {
                String input_data = myReader.nextLine();
                String output_data = validateUser(input_data);
                String expected_output = results.get(index);
                if (!output_data.equals(expected_output)) {
                    System.out.println(input_data + " " + output_data + " "+ expected_output);
                }
                index++;
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
