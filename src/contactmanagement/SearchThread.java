package contactmanagement;
import java.util.ArrayList;
public class SearchThread extends Thread{
    private ArrayList<Node> original,searched,temp;
    private String query;
    public SearchThread(ArrayList<Node> _original,String _query){
        original = _original;
        query = _query;
        searched = null;
    }
    @Override
    public void run(){
        temp = new ArrayList<Node>();
        for(Node x : original)
            if((x.name.toLowerCase()).indexOf(query.toLowerCase())!=-1)
                temp.add(x);
        searched = temp;
        temp = null;
    }
    public boolean ifDone(){
        return (searched!=null);
    }
    public ArrayList<Node> getResult(){
        return searched;
    }
}