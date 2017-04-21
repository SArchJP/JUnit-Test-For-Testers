import lt.itakademija.DocumentConsumer;
import lt.itakademija.DocumentOrganizer;
import lt.itakademija.DocumentProducer;
import lt.itakademija.DocumentTypeDetector;

public class DocOrganizer implements DocumentOrganizer {

    DocumentTypeDetector documentTypeDetector;

    public DocOrganizer(DocumentTypeDetector documentTypeDetector) {
        this.documentTypeDetector = documentTypeDetector;
    }

    @Override
    public long getTotalCount() {

        return 0;
    }

    @Override
    public long getTotalLinesCount() {
        return 0;
    }

    @Override
    public void organize(DocumentProducer documentProducer, DocumentConsumer documentConsumer) {

    }

    public DocumentTypeDetector getDocumentTypeDetector() {
        return documentTypeDetector;
    }

    public void setDocumentTypeDetector(DocumentTypeDetector documentTypeDetector) {
        this.documentTypeDetector = documentTypeDetector;
    }
}
