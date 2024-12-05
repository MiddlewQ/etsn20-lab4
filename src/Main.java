import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        if(args.length < 3) {
            System.out.println("Usage: search <pattern> <filename>");
            System.exit(1);
        }
        if(!args[0].equals("search")) {
            System.out.println("Unknown command, only search implemented");
            System.exit(1);
        }


        List<String> pattern_words = Arrays.asList(args).subList(1, args.length - 1);

        File input_file = new File(args[args.length - 1]);
        String my_pattern = create_pattern(pattern_words);

        print_lines(my_pattern, input_file);
    }

    static void print_lines(String pattern, File input_file) {
        try {
            Scanner file_reader = new Scanner(input_file);
            while(file_reader.hasNextLine()) {
                String line = file_reader.nextLine();
                if (line.contains(pattern)) {
                    System.out.println(line);
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("Could not open file");
        }
    }

    static String create_pattern(List<String> words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0  ; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i != words.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}