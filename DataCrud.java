public interface DataCrud {
    
    void create();
    void retrieve(int id);
    void retrieveAll();
    void update(int id);
    void delete(int id);

}