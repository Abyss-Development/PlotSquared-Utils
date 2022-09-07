package net.abyssdev.plotsquared;

import org.bukkit.entity.Player;

import java.util.List;

public interface IPlotSquared {

    List<IPlot> getPlayerPlots(final Player player);

}