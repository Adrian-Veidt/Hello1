public class Queue {

    char q[]; //creating masive for testing
    int putloc, getloc; //index'a for in and out

    Queue(int size) {
        q = new char[size++];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    char get(){
        if (getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        getloc ++;
        return q[getloc];
    }
}