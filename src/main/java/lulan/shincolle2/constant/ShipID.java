package lulan.shincolle2.constant;

public enum ShipID
{
    
    DD_LAFFEY(1, "EntityDDLaffey");
    
    private int id;
    private String entityName;
    
    private ShipID(int id, String entityName)
    {
        this.id = id;
        this.entityName = entityName;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getEntityName()
    {
        return entityName;
    }
    
    /**
     * get enum by id
     * 
     * @param id
     * @return null or ShipID
     */
    public static ShipID idToEnum(int id)
    {
        for (ShipID e : values())
        {
            if (e.getId() == id)
            {
                return e;
            }
        }
        
        return null;
    }
    
    /**
     * get enum by entityName
     * 
     * @param entityName
     * @return null or ShipID
     */
    public static ShipID entityNameToEnum(String entityName)
    {
        for (ShipID e : values())
        {
            if (e.getEntityName().equals(entityName))
            {
                return e;
            }
        }
        
        return null;
    }
    
}
