import lt.itakademija.Document;
import lt.itakademija.DocumentProducer;

import java.util.Iterator;

public class DocProducer implements DocumentProducer {

    private Iterator<Document> iterator;

    public DocProducer(Iterator<Document> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Document get() {
        Document document;
        if(iterator.hasNext()){
            document = iterator.next();
            return document;
        }
        return null;
    }

    public Iterator<Document> getIterator() {
        return iterator;
    }

    public void setIterator(Iterator<Document> iterator) {
        this.iterator = iterator;
    }
}

