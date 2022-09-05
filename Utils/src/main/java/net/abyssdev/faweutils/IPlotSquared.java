package net.abyssdev.faweutils;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.List;

public interface IPlotSquared {

    List<IPlot> getPlayerPlots(final Player player);

}