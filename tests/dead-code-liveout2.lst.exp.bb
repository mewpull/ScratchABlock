// Predecessors: []
// Node props:
//  live_gen: set()
//  live_in: set()
//  live_kill: {$a}
//  live_out: set()
10:
// $a = 1
DEAD()
$a = 2
$a += 1
use($a)
Exits: []
