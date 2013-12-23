package contactmanagement;
import java.util.*;
public class Controller{
    TreeSet<Node> list;
    ParsingCSV p = new ParsingCSV();
    public Controller(){
        list = new TreeSet<Node>();
    }
    public void insert(Node node){
            list.add(node);
    }
    public boolean delete(Node node){
        return list.remove(node);
    }
    public boolean isEmpty(){
        return list.isEmpty() ;
    }
    public void getFromFile(String csv){
        ArrayList<Node> list = p.parse(csv);
        for( Node node : list)insert(node);
    }
    public void getFromFile(){
        ArrayList<Node> list = p.parse();
        if(list!=null)
            for( Node node : list)insert(node);
    }
    public void clearList(){
        list = new TreeSet<Node>();
    }
    public void writeToFile(String csv){
        p.write(new ArrayList<Node>(list),csv);
    }
    public void writeToFileOverwrite(String csv){
        p.overwrite(new ArrayList<Node>(list),csv);
    }
    public ArrayList<Node> getArrayList(){
        return new ArrayList<Node>(list);
    }
    public void editList(Node _old,Node _new){
        delete(_old);
        insert(_new);
    }
    public ArrayList<Node> search(String query){
        //Multi threaded linear search algorithm
        ArrayList<Node> originalList = new ArrayList<>(list), searched = new ArrayList<>();
        int partitionSize = 10;//number of contacts searched per thread
        ArrayList<ArrayList<Node>> partitions = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i < originalList.size(); i += partitionSize){ 
            partitions.add(new ArrayList(originalList.subList(i,
                i + Math.min(partitionSize, originalList.size() - i))));
        }
        SearchThread[] threadList = new SearchThread[partitions.size()];
        for(int i = 0; i<threadList.length; i++){
            threadList[i] = new SearchThread(partitions.get(i), query);
            threadList[i].run();
        }
        boolean flag = false;
        while(!flag){
            flag = true;
            for(SearchThread s : threadList) flag = flag&s.ifDone();
        }
        for(SearchThread s : threadList) searched.addAll(s.getResult());
        return searched;
    }
    public void export(){
        p.export(new ArrayList<Node>(list));
    }
}