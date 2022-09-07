package net.abyssdev.plotsquared;

import com.intellectualcrafters.plot.object.Plot;
import org.bukkit.Location;

public final class LegacyPlot implements IPlot {

    private final Plot plot;

    public LegacyPlot(final Plot plot) {
        this.plot = plot;
    }

    @Override
    public boolean contains(final Location location) {
        return this.plot.getArea().contains(
                new com.intellectualcrafters.plot.object.Location(
                        location.getWorld().getName(),
                        location.getBlockX(),
                        location.getBlockY(),
                        location.getBlockZ(),
                        location.getYaw(),
                        location.getPitch()
                )
        );
    }

}
