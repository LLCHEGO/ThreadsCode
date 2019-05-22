public class ThreadExample {

  public static void main(String[] args){
	  
    System.out.println(Thread.currentThread().getName());
	
    for(int i=0; i<=26; i++){
		
      new Thread("A " + i + " B" + i + "C  " + i +"D " + i +"E " + i +"F " + i +"G " + i +"H " + i +"I " + i +"J " + i +"J " + i +"K " + i +"L " + i +"M " + i +"N " + i +"O " + i +"P " + i +"Q " + i +"R " + i +"S " + i +"T " + i +"U " + i + "V " + i + "W " + i + "X " + i +"Y " + i + "Z " + i){
        
		public void run()
		{
          System.out.println("Thread: " + getName() + " running");
        }
      }
			.start();
    }
  }
}