package C3_Queue_Deque;

/*
class Node{
    int key;
    Node next;

    public Node(int key){
        this.key=key;
        this.next=null;
    }
}

class Queue{
    Node front,rear;
    public Queue(){
        this.front=this.rear=null;
    }

    void enqueue(int key){
        Node temp=new Node(key);

        if(this.rear==null){
            this.front=this.rear=temp;
            return;
        }
        this.rear.next=temp;
        this.rear=temp;
    }

    void dequeue(){
        if (this.front==null)
            return;
        Node temp=this.front;
        this.front=this.front.next;

        if (this.front==null)
            this.rear=null;

    }
}
class main{
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(12);
        q.enqueue(14);
        q.dequeue();
        q.dequeue();
        q.enqueue(15);
        q.enqueue(154);
        q.enqueue(155);
        q.enqueue(156);

        System.out.println("Queue front "+ q.front.key);
        System.out.println("Queue rear "+ q.rear.key);
    }
}*/// Queue using Linked list

/*
 class Stacck {

    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new ArrayDeque<>();


    static int curr_size;
    Stacck() {
        curr_size = 0;
    }

    static void push(int x) {
        curr_size++;


        q2.add(x);


        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }


        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    static void pop()
    {


        if (q1.isEmpty())
            return;
        q1.remove();
        curr_size--;
    }

    static int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    static int size() {
        return curr_size;
    }



    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(5);
        s.push(15);
        s.push(20);

        System.out.println("current size: " + s.size());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

        System.out.println("current size: " + s.size());
    }
}

 *///Stack using Queue  IMP

/*
class main{
static Queue<Integer> queue;


static void Print()
        {
        for(Integer x: queue)
        System.out.print(x + " ");
        }


static void reversequeue()
        //we traverse the queue item ,take them out and put then to a
        // stack and take them to a out of the queue
        {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
        stack.add(queue.peek());
        queue.remove();
        }
        // we traverse the stack take top item and
       // put it in queue and remove from the stack
        while (!stack.isEmpty()) {
        queue.add(stack.peek());
        stack.pop();
        }
        }


public static void main(String args[])
        {
        queue = new LinkedList<Integer>();
        queue.add(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);

        reversequeue();
        Print();
        }
        }

 */// reverse the queue iterative sol IMP

/*
class main{
static void Print(Queue<Integer> q)
        {
        for(Integer x: q)
        System.out.print(x + " ");
        }


static void reverse(Queue<Integer> q)
        {
        if(q.isEmpty())
        return;

        int x = q.peek();
        q.remove();

        reverse(q);
        q.add(x);

        }


public static void main(String args[])
        {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);

        reverse(queue);
        Print(queue);
        }
        }

 */// reverse a queue recursive sol  IMP

/*
class main{

static void printFirstN(int n) {
        Queue<String> q = new LinkedList<>();

        q.add("5");
        q.add("6");

        for(int i = 0; i < n; i++) {
        String curr = q.poll();

        System.out.print(curr+ " ");

        q.add(curr + "5");
        q.add(curr + "6");
            }
        }


public static void main(String args[]) {
        int n = 5;

        printFirstN(n);
    }
}

 */ // Generate number with given digit IMP

/*
class MYDS{
    Deque<Integer>dq;
    MYDS(){
       dq=new ArrayDeque<>();
    }
    void insertMin(int x){
        dq.offerFirst(x);
    }
    void insertMax(int x){
        dq.offerLast(x);
    }
    int getMin(){
        return dq.peekFirst();
    }
    int getMax(){
        return dq.peekLast();
    }
    int extractMIN(){
        return dq.pollLast();
    }

}
class main{
    public static void main(String[] args) {
        MYDS dq=new MYDS();
        dq.insertMax(10);
        dq.insertMax(100);
        dq.insertMax(100);
        dq.insertMin(1);
        dq.insertMin(2);
        dq.insertMin(3);
        dq.insertMin(4);

        System.out.println(dq.getMin());//last element added in front
        System.out.println(dq.getMax());//last element
        System.out.println(dq.extractMIN());//last element
    }
}

 */ //Deque DS MIN/MAX functions

/*
class main{
    private static void max(int[] a, int k, int n) {

        for (int i=0;i<n-k+1;i++){
            int max=a[i];
            for (int j=i+1;j<i+k;j++){
                max=Math.max(a[j],max);
            }
            System.out.println(max);

        }
    }
    public static void main(String[] args) {
        int a[]={20,5,3,8,6,15};
        int k=4;

        max(a,k,a.length);
    }
}

 *///Maximum of all sub_Array of size k naive sol

/*
class test{
    private static void max(int[] a, int k, int n) {
        Deque<Integer> dq= new ArrayDeque<>();

        for (int i=0;i<k;++i)
        {
            while (!dq.isEmpty() &&  a[i]>=a[dq.peek()])
            dq.removeLast();


            dq.addLast(i);
        }

        for (int i=k;i<n;++i){
            System.out.println(a[dq.peek()]+" ");

            while(!dq.isEmpty() && dq.peek()<=i-k)
                dq.removeFirst();

            while (!dq.isEmpty() && a[i]>=a[dq.peek()])
                dq.removeLast();

            dq.addLast(i);
        }
        System.out.println(a[dq.peek()]);
    }


        public static void main(String[] args) {
            int a[]={20,5,3,8,6,15};
            int k=4;
            int n=a.length;

            max(a,k,n);

    }


}

 *///Maximum of all sub_Array of size k efficient sol




