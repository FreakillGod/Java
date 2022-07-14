import java.util.ArrayList;

class Interval{
    int start;
    int end;

    Interval(int s, int e){
        this.start=s;
        this.end=e;
    }
}

public class Intervals {

    public ArrayList<Interval> insertInterval(ArrayList<Interval> Intervals, Interval newInterval){

        if(Intervals== null){
            Intervals= new ArrayList<Interval>();

            Intervals.add(newInterval);
            return Intervals;
        }else if(Intervals.size()==0){
            Intervals= new ArrayList<Interval>();

            Intervals.add(newInterval);
            return Intervals;
        }

        Interval toInsert= newInterval;

        int i=0;

        while(i<Intervals.size()){

        }

        return Intervals;

    }

    public static void main(String[] args) {
        
    }
}
