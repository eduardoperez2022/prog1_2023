package demo_pila_java;

public class pilaArray implements pila{
    
    private int top = -1;
    private Object[] s;
    private int capacidad = 0;
    
    public pilaArray() {
        this(1000);
    }
    
    public pilaArray(int cap) {
        this.capacidad = cap;
        s = new Object[capacidad];
    }
    
    public int longitud() {
        return top+1;
    }
    
    public boolean esVacia() {
        return (top<0);
    }
    
    public void push(Object po) {
        if (longitud() < capacidad) {
            top++;
            s[top]=po;
        }
    }
    
    public Object pop() {
        Object aux;
        if (esVacia()) {
            return null;
        }
        aux = s[top];
        s[top] = null;
        top--;
        return aux;
    }
    
    public Object primero() {
        if (esVacia()) {
            return null;
        }
        else {
            return s[top];
        }
    }
    

}
