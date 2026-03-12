class Main
{
    static public void main(String []chetas)
    {
        Thread alpha = new Thread( () ->{
            try{
            for(char ch='A';ch<='Z';ch++)
            {
                System.out.println(ch );
                Thread.sleep(2000);
            }
            }
            catch(Exception ex){}
        } );
        alpha.start();
        Thread num = new Thread(()->{
            try{
                for(int i=1;i<=50;i++){
                    System.out.println(i);
                    Thread.sleep(1500);
                }
            }
            catch(Exception ex){}
        } );
        num.start();
    }
}