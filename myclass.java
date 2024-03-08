public class myclass {
    public String public_var="public var";

    String kk;
    private String jj;

    protected String pro_var="pro var";
    public void public_method(){
        System.out.println("public method of myclass");
    }

    void default_methoid(){
        System.out.println("default method of myclass");
    }

    private void private_method(){
        System.out.println("private method of myclass");
    }

    protected void protected_method(){
        System.out.println("protected method of myclass");
    }

    public static void main(String[] args){
//        System.out.println();
        myclass obj=new myclass();
        obj.private_method();
    }
}
