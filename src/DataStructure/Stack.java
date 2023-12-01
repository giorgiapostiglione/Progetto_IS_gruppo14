package DataStructure;
import Exceptions.*;
/**
 *
 * @author Andrea
 */
public class Stack{
    private Studente array[];
    private final int dimensione;
    private int numEle;
    
    public Stack(int dimensione){
        this.dimensione = dimensione;
        this.array = new Studente[dimensione];
        this.numEle = 0;
    }
    
    private boolean isFull(){
        return dimensione==numEle;
    }
    private boolean isEmpty(){
        return numEle==0;
    }
    
    public void push(Studente aggiungi) throws FullStackException{
        if(isFull())
            throw new FullStackException("Non è possibile inserire ulteriori Studenti.");
        array[numEle] = aggiungi;
        numEle++;
    }
    
    public Studente pop() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException("Non ci sono più studenti da eliminare.");
        numEle--;
        return array[numEle];
    }
    
    public Studente top() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException("Non ci sono studenti da visualizare.");
        return array[numEle-1];
    }
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<numEle; i++)
            sb.append(array[i].toString());
        return sb.toString();
    }
}
