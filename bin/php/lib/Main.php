<?php
/**
 */

use \php\_Boot\HxAnon;
use \php\Boot;
use \haxe\Log;

/**
 * Класс Main
 */
class Main {
	/**
	 * @return void
	 */
	public static function main () {
		#src/Main.hx:8: characters 7-51
		$playerA = new _HxAnon_Main0("Simon", \Move::Paper());
		#src/Main.hx:9: characters 7-52
		$playerB = new _HxAnon_Main0("Nicolas", \Move::Rock());
		#src/Main.hx:12: lines 12-22
		$result = null;
		#src/Main.hx:12: characters 42-54
		$_g = $playerB->move;
		#src/Main.hx:12: characters 28-40
		$__hx__switch = ($playerA->move->index);
		if ($__hx__switch === 0) {
			#src/Main.hx:12: characters 42-54
			$__hx__switch = ($_g->index);
			if ($__hx__switch === 1) {
				#src/Main.hx:12: lines 12-22
				$result = \Result::Winner($playerB);
			} else if ($__hx__switch === 2) {
				$result = \Result::Winner($playerA);
			} else {
				$result = \Result::Draw();
			}
		} else if ($__hx__switch === 1) {
			#src/Main.hx:12: characters 42-54
			$__hx__switch = ($_g->index);
			if ($__hx__switch === 0) {
				#src/Main.hx:12: lines 12-22
				$result = \Result::Winner($playerA);
			} else if ($__hx__switch === 2) {
				$result = \Result::Winner($playerB);
			} else {
				$result = \Result::Draw();
			}
		} else if ($__hx__switch === 2) {
			#src/Main.hx:12: characters 42-54
			$__hx__switch = ($_g->index);
			if ($__hx__switch === 0) {
				#src/Main.hx:12: lines 12-22
				$result = \Result::Winner($playerB);
			} else if ($__hx__switch === 1) {
				$result = \Result::Winner($playerA);
			} else {
				$result = \Result::Draw();
			}
		}
		#src/Main.hx:24: characters 7-12
		(Log::$trace)("result: " . \Std::string($result), new _HxAnon_Main1("src/Main.hx", 24, "Main", "main"));
	}

	/**
	 * @return void
	 */
	public function __construct () {
	}
}

class _HxAnon_Main0 extends HxAnon {
	function __construct($name, $move) {
		$this->name = $name;
		$this->move = $move;
	}
}

class _HxAnon_Main1 extends HxAnon {
	function __construct($fileName, $lineNumber, $className, $methodName) {
		$this->fileName = $fileName;
		$this->lineNumber = $lineNumber;
		$this->className = $className;
		$this->methodName = $methodName;
	}
}

Boot::registerClass(Main::class, 'Main');
