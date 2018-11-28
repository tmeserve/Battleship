
/**
 * Write a description of class Ships here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ships
{
    private ShipTypes shipType;
    
    public Ships(String type)
    {
        shipType = ShipTypes.valueOf(type);
    }
}