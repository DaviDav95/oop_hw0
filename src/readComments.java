import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

//test
/**
 * @requires: path to a java file
 * modifies: nothing
 * effects: print all the code's comments (properly indented as written), if a the file given was not found or to many
 *          arguments were given, a message will be printed.
 */
public class readComments {

    /**
     * @param toIndent - string you want indented
     * @param indentBy - sting whose length you want to indent by
     * @return spaces and tab the length of the indentBy sting concatenated with toIntend string
     */
    private static String indentBy(String toIndent, String indentBy){
        for (int i = 0; i < indentBy.length() - 2; i++){
            if (indentBy.charAt(i) == '\t') {
                toIndent = '\t' + toIndent;
            }
            else toIndent = ' ' + toIndent;
        }
        return toIndent;
    }

    /**
     * 
     * @param line - line of codes under inspection
     * @param commentSign - comment syntax searched in the line
     * @param after - boolean flag to decide which part of the line you want
     * @return the words written before or after the commentSign as specified in after flag
     */
    private static String getComment(String line, String commentSign, boolean after){
       int index = line.indexOf(commentSign);
       String beforeComment = line.substring(0, index +2);
       String afterComment = line.substring(index, line.length());
       if (after){
           return indentBy(afterComment, beforeComment);
       }
       return beforeComment;
    }

    public static void main(String[] args) {
        try {
            if (args.length != 1){
                System.out.println("Wrong number of arguments");
                System.exit(0);
            }
            File path = new File(args[0]);
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                 if (line.contains("/*")) {
                     String checkForMore = getComment(line, "/*", false); //check if the '//' sign
                                                                                          // appears before the '/*' sign
                    if (checkForMore.contains("//")) System.out.println(getComment(line, "//", true));
                    else System.out.println(getComment(line, "/*", true));

                    if (!line.contains("*/")) { //print all line between "/*" and "*/"
                        line = reader.readLine();
                        while (!line.contains("*/") && line != null) {
                            System.out.println(line);
                            line = reader.readLine();
                        }
                        System.out.println(getComment(line, "*/", false));
                     }
                }
                else if (line.contains("//")) System.out.println(getComment(line, "//", true));
                line = reader.readLine();
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File not found"); // check
        }
        catch (java.io.IOException e){
            System.out.print(e);
        }
    }
}
