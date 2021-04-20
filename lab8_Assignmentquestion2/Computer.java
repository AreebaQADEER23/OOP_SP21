public class Computer {
    int wordize;
    int memoryisze;
    int storagesize;
    int speed;
    public Computer(){
        wordize=0;
        memoryisze=0;
        storagesize=0;
        speed=0;
    }
    public Computer(int a, int b , int c , int d){
        wordize=a;
        memoryisze=b;
        storagesize=c;
        speed=d;
    }
    public void display(){
        System.out.println("the word size is :"+wordize+"the memory size is :"+memoryisze+"the storage size is :"+storagesize+"the speed is :"+speed);
    }

}
