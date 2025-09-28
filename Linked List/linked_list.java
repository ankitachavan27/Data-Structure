 class node{
        int data;
        node next;
        public node(int data){
            this.data =data;
             this.next= null;
        }
     }


public  class linked_list{

   public  node head =null;
     //insertion node
    public void insertNode(int data){
        node newNode = new  node( data);
        if(head == null){
            head =newNode;
        }
        
        else{
            node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=newNode;

        }
       
    }
    //insertion of first node
    public  void insertFirst(int data){
        node newNode = new  node( data);
        
       if(head!=null){
         newNode.next = head;
        
           head=newNode;

       }  
        
    } 
    //length of linked list
    public  int  length_calculate(int length){

         if(head == null){
            System.out.println("null");
           
        }
        else{
            node current = head;
            while(current!=null){
                  length++;
                 current= current.next ;

                 
            }

    }

     return length;
}
  //display function
     public void displayNode(){
        if(head == null){
            System.out.println("null");
           
        }
        else{
            node current = head;
            while(current!=null){
                System.out.print(current.data+" ->");
                 current= current.next ;
                 
            }
            System.out.println("null");   

          
        }

     }
//finding the specific position element
    public int position_find(int position,int length){
        
         if(head == null){
            System.out.println("null");
           
        }
        else{
            node current = head;
            while(current!=null){
                  length++;
                 current= current.next ;
                if(length == position){
                    System.out.println("position" +"-"+current.data);
                }
                 
            }
    }
        return position;

    }
//even_positionelements
    public void  even_func(){
        int position =1;
        if(head == null){
            System.out.println("null");
           
        }
        else{
            node current = head;
            while(current!=null){
                position++;
                current= current.next ;

                   if(position%2 == 0){
                    System.out.println("even" +"-"+current.data);
                   }
                }
                 
            }
    }

    public void insertatMid(int data,int position){
        node newNode = new  node( data);
        if(head == null){
            head =newNode;
        }
        else{
        node temp = head;
         int i=1;
         
         while(i<position-1){
            temp = temp.next;
            i++;
         }
         newNode.next = temp.next;
         temp.next = newNode;

        }



    }
    public void find_mid( ){
       node slow  = head;
       node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        System.out.println("mid:"+" "+slow.data);



    }

    public void sum_func(){
         int position =1;
         int sum =0;
        if(head == null){
            System.out.println("null");
           
        }
        else{
            node current = head;
            while(current!=null){
                
               
                System.out.println(current.data);
                 position++;
                 sum= sum + current.data;
                  current= current.next ;
                
                }
                
                 System.out.println("SUM"+ " -"+sum);
            }
             

    }
   
   

     public static void main(String[] args) {
        linked_list l = new linked_list();
       
        l.insertNode(10);
        l.insertNode(20);
        l.insertNode(30);
        l.insertNode(5);
        // l.insertNode(13);
        l.insertFirst(40);
        l.insertNode(70);
        l.insertatMid(60, 3);
        l.find_mid();
        l.displayNode();
        int ln =  l.length_calculate(0);
        System.out.println("length is:" +ln);
        int data =  l.position_find(2, 1);
        System.out.println("length" +"-"+data);
        // l.even_func();
        l.sum_func();
       
      
         
     }
}
 