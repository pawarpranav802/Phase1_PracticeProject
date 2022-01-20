  package Simplilearn.com;

	class MyException extends Exception 
	{ 
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MyException(String s) 
	    { 
	        super(s); 
	    } 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new MyException("temp"); 
	        } 
	        catch (MyException ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}
