package data

/**
 * Class representing a percentage value.
 *
 * @property value The percentage value, which must be between 0 and 100.
 * @constructor Creates a Percentage instance with the given value.
 * @throws IllegalArgumentException if the value is not between 0 and 100.
 */
class Percentage(val value: Double) {
  init {
    require(value in 0.0..100.0) { "Percentage value must be between 0 and 100" }
  }

  /**
   * Returns the string representation of the percentage.
   *
   * @return A string in the format of "value%".
   */
  override fun toString(): String {
    return "$value%"
  }
}

/** Extension property to convert a Double to a Percentage. */
val Double.pct: Percentage
  get() = Percentage(this)

/** Extension property to convert an Int to a Percentage. */
val Int.pct: Percentage
  get() = Percentage(this.toDouble())
