class Box_Demo{
    //declare variables
    double width;
    double height;  
    double depth;

    //volume method
    void volume(){
        double vol = width * height * depth;
        System.out.println("Volume is " + vol);
    }
}

//volume method

class box{
    public static void main(String args[]){
        //1st box
        Box_Demo mybox1 = new Box_Demo();
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;
        mybox1.volume();

        //2nd box
        Box_Demo mybox2 = new Box_Demo();
        mybox2.width = 40;       
        mybox2.height = 50;
        mybox2.depth = 60;
        mybox2.volume();
    }
}
