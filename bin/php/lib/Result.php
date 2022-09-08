<?php
/**
 */

use \php\Boot;
use \php\_Boot\HxEnum;

class Result extends HxEnum {
	/**
	 * @return Result
	 */
	static public function Draw () {
		static $inst = null;
		if (!$inst) $inst = new Result('Draw', 1, []);
		return $inst;
	}

	/**
	 * @param object $player
	 * 
	 * @return Result
	 */
	static public function Winner ($player) {
		return new Result('Winner', 0, [$player]);
	}

	/**
	 * Returns array of (constructorIndex => constructorName)
	 *
	 * @return string[]
	 */
	static public function __hx__list () {
		return [
			1 => 'Draw',
			0 => 'Winner',
		];
	}

	/**
	 * Returns array of (constructorName => parametersCount)
	 *
	 * @return int[]
	 */
	static public function __hx__paramsCount () {
		return [
			'Draw' => 0,
			'Winner' => 1,
		];
	}
}

Boot::registerClass(Result::class, 'Result');
