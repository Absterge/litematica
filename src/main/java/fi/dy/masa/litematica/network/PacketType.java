package fi.dy.masa.litematica.network;

/**
 * Example PacketType file for Downstream Mods
 */
@Deprecated(forRemoval = true)
public class PacketType
{
    public record CarpetHello()
    {
        public static String HI = "69";
        public static String HELLO = "420";
    }
}
