/**
 * html
 */

import java.util.Scanner;
import java.io.*;
public class html {
    public static void main(String[] args) 
    throws FileNotFoundException{

        String fileName = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter in file name to convert to HTML: ");
        fileName = in.nextLine();
        Scanner fileIn = new Scanner(new File(fileName + ".txt"));

        PrintWriter out = new PrintWriter(new File(fileName + ".html"));
        
        out.println("<html>\n<body>");

        boolean list = false;
        while(fileIn.hasNextLine()) {
            String line = fileIn.nextLine();
            out.println(convertToHtml(line, list));
            if(line.length() != 0){
                if(line.charAt(0) == '-'){
                    if(list == false){
                        list = true;
                }
            }
            }else{
                list = false;
            }
            
        }


        out.println("</html>\n</body>");
        
        in.close();
        fileIn.close();
        out.close();
    }

    public static String convertToHtml(String inputLine, boolean list) {
        String outputLine = "";
        char firstChar = ' ';
        
        if(inputLine.length() != 0){
            firstChar = inputLine.charAt(0);
        }

        if(firstChar == '-'){
            if(list == false){
                list = true;
                outputLine = "<ul>\n";
            }
            outputLine += "<li>";
            for(int i=1; i<inputLine.length(); i++){
                outputLine += inputLine.charAt(i);
            }
            outputLine += "</li>";
            
        }else if(list == true){
            list = false;
            outputLine += "</ul>\n";
        }


        if(firstChar == '_'){
            outputLine += "<h1>";

            for(int i=1; i<inputLine.length()-1; i++){
                outputLine += inputLine.charAt(i);
            }
            outputLine += "</h1>";
        }


        if(inputLine.length() == 0){
            outputLine += "<p>";
        }
  
        if(outputLine.length() == 0){
            for(int i=0; i<inputLine.length(); i++){
                outputLine += inputLine.charAt(i);
            }
            outputLine += "<br />";
        }
        
        
        return outputLine;
    }
}