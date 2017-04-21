import lt.itakademija.*;

import java.util.Iterator;

public class BaseTestExt extends BaseTest {
    @Override
    protected DocumentOrganizer createDocumentOrganizer(DocumentTypeDetector documentTypeDetector) {
        return null;
    }

    @Override
    protected DocumentProducer createDocumentProducer(Iterator<Document> iterator) {
        DocProducer dp = new DocProducer(iterator);
        return dp;
    }

    @Override
    protected DocumentConsumer createDocumentConsumer(FileRepository fileRepository) {
        return null;
    }
}
