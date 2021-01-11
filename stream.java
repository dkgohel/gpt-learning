import java.net.SocketPermission;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

class stream{
    public static void main(String[] args)
    {
        int max=1000000;
        List<String> l = new ArrayList<String>(max);
        for(int i=1;i<=max;i++)
        {
            UUID uuid=UUID.randomUUID();
            l.add(uuid.toString());
        }
        long t0=System.nanoTime();
        long count=l.parallelStream().sorted().count();
        System.out.println(count);
        long t1=System.nanoTime();
        long seconds = TimeUnit.NANOSECONDS.toMillis(t1-t0);
        System.out.println(String.format("sequential sort took: %d ms", seconds));
    }
}