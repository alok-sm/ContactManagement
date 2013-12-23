package contactmanagement;

import java.util.Objects;

class Node implements Comparable<Node>{
    String email;
    String name;
    String contact1;
    String contact2;
    String address;
    public Node(String _name, String _contact1, String _contact2, String _email, String _address){
	address=_address;
	name=_name;
	email=_email;
	contact1=_contact1;
	contact2=_contact2;
    }
    @Override
    public int compareTo(Node node) {
        return (this.name).compareTo(node.name);
    }
    @Override
    public boolean equals(Object o){
        if(o==null)return false;
        if(!(o instanceof Node)) return false;
        Node node = (Node)o;
        boolean eqName = (node.name).equals(this.name);
        boolean eqCon1 = (node.contact1).equals(this.contact1);
        boolean eqCon2 = (node.contact2).equals(this.contact2);
        boolean eqEmail = (node.email).equals(this.email);
        boolean eqAddr = (node.address).equals(this.address);
        return (eqName&&eqCon1&&eqCon2&&eqEmail&&eqAddr);
    }
}
	

