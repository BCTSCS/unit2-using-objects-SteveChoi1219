import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WordGames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordGames extends Actor
{
    /**
     * Act - do whatever the WordGames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    private String word;
    
    public WordGames(String text){
        word = text;
        img = new GreenfootImage(word, 24, Color.BLACK, Color.WHITE);
        
    }
    public String scramble()
    {
        // switch first half
        // and second half
        int mid = word.length() / 2;
        String firstHalf = word.substring(0,mid);
        String secondHalf = word.substring(mid);
        return secondHalf + firstHalf;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        String beforeInsert = word.substring(0, insertIdx);
        String afterInsert = word.substring(insertIdx);
        img = new GreenfootImage(word, 24, Color.BLUE, Color.WHITE);
        setImage(img);
        return beforeInsert + insertText + afterInsert;
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int idx = word.indexOf(insertChar);
        if(idx == -1){
           return word; 
        }
        String beforeInsert = word.substring(0, idx);
        String afterInsert = word.substring(idx);
        return beforeInsert + insertText + afterInsert;
    }
    
    @Override
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
        
        
    }
    public void act(){
        scramble();
        Greenfoot.delay(100);
        int index=Greenfoot.getRandomNumber(word.length());
        bananaSplit(index, "Hello");
        Greenfoot.delay(100);
       
        bananaSplit("e", "World");
        Greenfoot.delay(100);

        
    }

}
