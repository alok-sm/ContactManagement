package contactmanagement;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
public class ParsingCSV{
    ArrayList<Node> node;
    public ParsingCSV(){   
        node= new ArrayList<Node>();
    }
    public ArrayList<Node> parse(String csv){
        BufferedReader br= null;
        String line="";
        try{
            FileReader f = new FileReader(csv);
            br= new BufferedReader(f);
            while((line=br.readLine())!=null){
                String[] contact = line.split(",");
                node.add(new Node(contact[0],contact[1],contact[2],contact[3],contact[4]));
            }
        }
        catch(FileNotFoundException e){
	    e.printStackTrace();
        }
        catch(IOException e){
	    e.printStackTrace();
        }
        finally{
            if(br!=null){
                try{
                    br.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        return node;
    }
    public ArrayList<Node> parse(){
        BufferedReader br= null;
        String line="";
        try{
            File x = null;
            final JFileChooser fc = new JFileChooser();
            int option = fc.showOpenDialog(fc);
            if(fc.showOpenDialog(fc) == JFileChooser.APPROVE_OPTION)
                x = fc.getSelectedFile();
            else if(fc.showOpenDialog(fc) == JFileChooser.CANCEL_OPTION)
                return null;
            if(x==null)return null;
            FileReader f = new FileReader(x);
            br= new BufferedReader(f);
            while((line=br.readLine())!=null){
                String[] contact = line.split(",");
                node.add(new Node(contact[0],contact[1],contact[2],contact[3],contact[4]));
            }
        }
        catch(FileNotFoundException e){
	    e.printStackTrace();
        }
        catch(IOException e){
	    e.printStackTrace();
        }
        finally{
            if(br!=null){
                try{
                    br.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        return node;
    }
    public void write(ArrayList<Node> node, String csv){
        PrintWriter pw= null;
        try{
            File file= new File(csv);
            if(!file.exists())
                file.createNewFile();
            pw = new PrintWriter(new BufferedWriter(new FileWriter(csv, true)));
            for(int i=0; i<node.size();i++){
                if(!node.get(i).name.equals(";")){
                    if(!node.get(i).contact1.equals(";") && !node.get(i).contact2.equals(";") && !node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                        pw.print(node.get(i).name+",");
                    else
                        pw.print(node.get(i).name);
                    if(!node.get(i).contact1.equals(";")){
                        if(!node.get(i).contact2.equals(";") && !node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                            pw.print(node.get(i).contact1+",");
                        else
                            pw.print(node.get(i).contact1);
                    }
                    if(!node.get(i).contact2.equals(";")){
                        if(!node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                            pw.print(node.get(i).contact2+",");
                        else
                            pw.print(node.get(i).contact2);
                    }
                    if(!node.get(i).email.equals(";")){
                        if(!node.get(i).address.equals(";"))
                            pw.print(node.get(i).email+",");
                        else
                            pw.print(node.get(i).email);
                    }
                    if(!node.get(i).address.equals(";"))
                        pw.print(node.get(i).address);
                }
                pw.println();
            }
            pw.close();	
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void overwrite(ArrayList<Node> node, String csv){
        PrintWriter pw= null;
        try{
            File file= new File(csv);
            if(!file.exists())
                file.createNewFile();
            pw = new PrintWriter(new BufferedWriter(new FileWriter(csv, false)));
            for(int i=0; i<node.size();i++){
                if(!node.get(i).name.equals(";")){
                    if(!node.get(i).contact1.equals(";") && !node.get(i).contact2.equals(";") && !node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                        pw.print(node.get(i).name+",");
                    else
                        pw.print(node.get(i).name);
                    if(!node.get(i).contact1.equals(";")){
                        if(!node.get(i).contact2.equals(";") && !node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                            pw.print(node.get(i).contact1+",");
                        else
                            pw.print(node.get(i).contact1);
                    }
                    if(!node.get(i).contact2.equals(";")){
                        if(!node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                            pw.print(node.get(i).contact2+",");
                        else
                            pw.print(node.get(i).contact2);
                    }
                    if(!node.get(i).email.equals(";")){
                        if(!node.get(i).address.equals(";"))
                            pw.print(node.get(i).email+",");
                        else
                            pw.print(node.get(i).email);
                    }
                    if(!node.get(i).address.equals(";"))
                        pw.print(node.get(i).address);
                }
                pw.println();
            }
            pw.close();	
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void export(ArrayList<Node> node){
        PrintWriter pw= null;
        try{
            
            File file = null;
            final JFileChooser fc = new JFileChooser();
            int option = fc.showOpenDialog(fc);
            if(fc.showOpenDialog(fc) == JFileChooser.APPROVE_OPTION)
                file = fc.getSelectedFile();
            else if(fc.showOpenDialog(fc) == JFileChooser.CANCEL_OPTION)
                return;
            if(!file.exists())
                file.createNewFile();
            pw = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
            for(int i=0; i<node.size();i++){
                if(!node.get(i).name.equals(";")){
                    if(!node.get(i).contact1.equals(";") && !node.get(i).contact2.equals(";") && !node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                        pw.print(node.get(i).name+",");
                    else
                        pw.print(node.get(i).name);
                    if(!node.get(i).contact1.equals(";")){
                        if(!node.get(i).contact2.equals(";") && !node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                            pw.print(node.get(i).contact1+",");
                        else
                            pw.print(node.get(i).contact1);
                    }
                    if(!node.get(i).contact2.equals(";")){
                        if(!node.get(i).email.equals(";") && !node.get(i).address.equals(";"))
                            pw.print(node.get(i).contact2+",");
                        else
                            pw.print(node.get(i).contact2);
                    }
                    if(!node.get(i).email.equals(";")){
                        if(!node.get(i).address.equals(";"))
                            pw.print(node.get(i).email+",");
                        else
                            pw.print(node.get(i).email);
                    }
                    if(!node.get(i).address.equals(";"))
                        pw.print(node.get(i).address);
                }
                pw.println();
            }
            pw.close();	
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}