 package homework;
 
//2nd */
/*Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
*/
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
    	super.getName();
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
    	super.getNumberOfTeamMembers();
        System.out.println( "Each team has 11 players in " + getName() );
    }

public static void main(String[] args) {
	Soccer s=new Soccer();
	s.getName();
	s.getNumberOfTeamMembers();
}
}
