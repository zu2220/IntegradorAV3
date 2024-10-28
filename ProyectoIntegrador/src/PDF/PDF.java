
package PDF;
import com.itextpdf.text.pdf.PdfReader;
import java.io.IOException;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDF {
     public void main(String[] args) {
        try {
            // Ruta del archivo PDF, ruta érronea, no va a funcionar, porfavor Tener presente la ruta
            String filePath = "path/to/your/file.pdf";
            
            // Crear un lector de PDF
            PdfReader reader = new PdfReader(filePath);

            // Obtener el número de páginas
            int numberOfPages = reader.getNumberOfPages();
            System.out.println("Número de páginas: " + numberOfPages);

            // Leer el contenido de la primera página
            String pageContent = PdfTextExtractor.getTextFromPage(reader, 1);
            System.out.println("Contenido de la primera página:");
            System.out.println(pageContent);

            // Cerrar el lector
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
    
    

