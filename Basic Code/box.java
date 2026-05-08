class Box_Demo{
    double width;
    double height;  
    double depth;
}

class box{
    public static void main(String args[]){
        Box_Demo mybox1 = new Box_Demo();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " + vol);

        Box_Demo mybox2 = new Box_Demo();
        mybox2.width = 40;       
        mybox2.height = 50;
        mybox2.depth = 60;
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);
    }
}
