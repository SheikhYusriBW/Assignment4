public class Account
{
    protected String VidDescription;
    protected String ProfileDescription;
    protected String username;
    protected String MediaName;
    protected String NumLikes;
    protected String data;
    
    public Account(String data)
    {
        this.data=data;
        
        if (data.contains("Create"))
        {
            String[] words = data.split(" ");
            for (int i=0; i<words.length; i++){
            this.username = words[1];
            this.ProfileDescription = words[2];
            }}
        if (data.contains("Add"))
        {
            String[] words = data.split(" ");
            for (int i=0; i<words.length; i++){
            this.username = words[1];
            this.MediaName = words[2];
            this.NumLikes = words[3];
            this.VidDescription = words[4];
           } }
            
    }     
}    

 
        
