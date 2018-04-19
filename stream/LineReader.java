package stream;

import java.io.*;

public class LineReader {
    public static void main(String[] args) {
        String prefix = System.getProperty("user.dir")+ File.separator+"src"+File.separator;
        try{
            BufferedReader input = new BufferedReader(new FileReader(prefix+"read.in"));

            PrintWriter output = new PrintWriter(new FileWriter(prefix+"write.bkp"));

            String line;
            StringBuilder finalContent = new StringBuilder();

            while((line = input.readLine()) != null){
                String[] command = line.split(" ");

                if (command[0].equals("CR")){
                    finalContent.append("Janela criada\n");
                }else if(command[0].equals("DN")){
                    finalContent.append("Botão do mouse pressionado\n");
                }else if(command[0].equals("UP")){
                    finalContent.append("Botão do mouse solto\n");
                }else if(command[0].equals("RE")){
                    finalContent.append("Janelas redesenhadas\n");
                }else if(command[0].equals("ZZ")){
                    finalContent.append("Fim do programa\n");
                    break;
                }
            }

            output.write(finalContent.toString());
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
