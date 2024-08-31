package data

class Percentage(private val value: Int) {
  init {
    require(value in 0..100) { "Percentage value must be between 0 and 100" }
  }

  override fun toString(): String {
    return "$value%"
  }
}

val Int.pct: Percentage
  get() = Percentage(this)