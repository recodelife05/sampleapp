package contracts;

import models.Book;
import models.Inventory;

import java.util.ArrayList;

public interface IDataProvider {

    public ArrayList<Book> GetRecords();
    public  ArrayList<Book> GetRecordsFromTextFile();

    public  ArrayList<Inventory> GetInventories();
}