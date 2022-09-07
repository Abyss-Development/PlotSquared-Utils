package net.abyssdev.plotsquared;


import com.plotsquared.core.location.Location;
import com.plotsquared.core.plot.Plot;

public final class ModernPlot implements IPlot {

    private final Plot plot;

    public ModernPlot(final Plot plot) {
        this.plot = plot;
    }

    @Override
    public boolean contains(final org.bukkit.Location location) {
        return this.plot.getArea().contains(
                Location.at(
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
