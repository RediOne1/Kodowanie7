import java.io.File;
import java.io.IOException;
/**
 * @author kgb_putin
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test3");
        File file2 = new File("test.lzw");
        File file3 = new File("odkodowany.txt");
        LZW.kompresor(file, file2);
        LZW.dekompresor(file2,file3);  
    } 
}
