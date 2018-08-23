package gameframework.services.wordgame.strategies;

import java.util.List;

/**
 * This interface contains the logic to play to wordgame game.
 * 
 * @author mzue mzukisi
 */
public interface WordgameStrategy {
	/**
	 * Checks whether the concrete strategy is linked with the specified level.
	 * 
	 * @param level
	 * @return
	 */
	public abstract boolean isStrategyForLevel(Integer level);

	/**
	 * Find a letter according to the strategy to continue playing.
	 * 
	 * @param string
	 * @return
	 */
	public abstract String addLetter(List<String> choices, String currentString);
}
