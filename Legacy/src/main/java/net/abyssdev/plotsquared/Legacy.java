package net.abyssdev.plotsquared;

import com.intellectualcrafters.plot.api.PlotAPI;
import com.intellectualcrafters.plot.object.Plot;
import org.bukkit.entity.Player;
import java.util.LinkedList;
import java.util.List;

public final class Legacy implements IPlotSquared {

    private static final PlotAPI API = new PlotAPI();

    @Override
    public List<IPlot> getPlayerPlots(final Player player) {
        final List<IPlot> plots = new LinkedList<>();

        for (final Plot plot : API.getPlayerPlots(player)) {
            plots.add(new LegacyPlot(plot));
        }

        return plots;
    }

}