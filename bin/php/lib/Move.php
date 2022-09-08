<?php
/**
 */

use \php\Boot;
use \php\_Boot\HxEnum;

class Move extends HxEnum {
	/**
	 * @return Move
	 */
	static public function Paper () {
		static $inst = null;
		if (!$inst) $inst = new Move('Paper', 1, []);
		return $inst;
	}

	/**
	 * @return Move
	 */
	static public function Rock () {
		static $inst = null;
		if (!$inst) $inst = new Move('Rock', 0, []);
		return $inst;
	}

	/**
	 * @return Move
	 */
	static public function Scissors () {
		static $inst = null;
		if (!$inst) $inst = new Move('Scissors', 2, []);
		return $inst;
	}

	/**
	 * Returns array of (constructorIndex => constructorName)
	 *
	 * @return string[]
	 */
	static public function __hx__list () {
		return [
			1 => 'Paper',
			0 => 'Rock',
			2 => 'Scissors',
		];
	}

	/**
	 * Returns array of (constructorName => parametersCount)
	 *
	 * @return int[]
	 */
	static public function __hx__paramsCount () {
		return [
			'Paper' => 0,
			'Rock' => 0,
			'Scissors' => 0,
		];
	}
}

Boot::registerClass(Move::class, 'Move');
