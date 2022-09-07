package net.abyssdev.plotsquared;

import com.plotsquared.core.PlotAPI;
import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.Plot;
import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;

public final class Modern implements IPlotSquared {

    private static final PlotAPI API = new PlotAPI();

    @Override
    public List<IPlot> getPlayerPlots(final Player player) {
        final List<IPlot> plots = new LinkedList<>();

        for (final Plot plot : API.getPlayerPlots(PlotPlayer.from(player))) {
            plots.add(new ModernPlot(plot));
        }

        return plots;
    }
}