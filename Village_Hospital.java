/*  Given number of Villages and Hospital You need to assign hospital to each Village in such a way that population to hostpital ratio(density) is least .
    
    Input :
    
    1. Village population of n villages(here I have taken only 3 villages) 
    2. No of Hospitals .
    

    Output :
    
    The maximum density which remains after assigning hospitals to villages . 
*/

import java.util.* ;
class Village implements Comparable<Village>
{
    private final int population ;
    public int hospitals ;
    public float density ;
    
    public Village(int population)
    {
        this.population = population ;
        this.hospitals = 1 ;    // *1 
    }
    public void addHospital()
    {
        this.hospitals++ ;
    }
    public float getDensity()
    {
         float d = (float)this.population/this.hospitals;
         return d ;
    }
    @Override
    public int compareTo(Village a)
    {
         return (int)((this.population/this.hospitals) - (a.population/a.hospitals)) ;
    }
    
}   
class Village_Hospital
{
    public static void main(String[] arg)
    {
    	PriorityQueue<Village> p = new PriorityQueue<Village>(Collections.reverseOrder()) ;
       
        
    	p.add(new Village(500)) ;  // let population of 3 village be 500, 400, 300 resp
    	p.add(new Village(200)) ;
    	p.add(new Village(300)) ;
        int m = 5 ;   //taking 5 hospitals 
        m = m - 3 ;   //Since there are 3 villages hence 1 hospital already been added to each village refer *1 . 
        while(m > 0)
        {
            Village temp = p.poll() ;
 	    temp.addHospital() ;
            p.add(temp) ;
            m-- ;
        }
        System.out.println("Maximum density of village-" + p.poll().getDensity()) ;

    }
}
