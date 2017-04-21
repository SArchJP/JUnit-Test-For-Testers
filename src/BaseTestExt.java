import lt.itakademija.*;

import java.util.Iterator;

public class BaseTestExt extends BaseTest {
    @Override
    protected DocumentOrganizer createDocumentOrganizer(DocumentTypeDetector documentTypeDetector) {
        DocOrganizer docOrganizer = new DocOrganizer(documentTypeDetector);
        return docOrganizer;
    }

    @Override
    protected DocumentProducer createDocumentProducer(Iterator<Document> iterator) {
        DocProducer docProducer = new DocProducer(iterator);
        return docProducer;
    }

    @Override
    protected DocumentConsumer createDocumentConsumer(FileRepository fileRepository) {
        DocumentConsumer documentConsumer = new DocConsumer(fileRepository);
        return documentConsumer;
    }
}
