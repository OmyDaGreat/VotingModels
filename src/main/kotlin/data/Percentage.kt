package data

import kotlin.math.round

/**
 * Class representing a percentage value.
 *
 * @property value The percentage value, which must be between 0 and 100.
 * @constructor Creates a Percentage instance with the given value.
 * @throws IllegalArgumentException if the value is not between 0 and 100.
 */
class Percentage(var value: Double) {
  init {
    value /= 100
    value = round(value * 10000) / 10000 // Round to four decimal places
    require(value in 0.0..1.0) { "Percentage value must be between 0 and 100" }
  }

  /**
   * Returns the string representation of the percentage.
   *
   * @return A string in the format of "value%".
   */
  override fun toString(): String {
    return String.format("%.4f", value)
  }
}

/** Extension property to convert a Double to a Percentage. */
val Double.pct: Percentage
  get() = Percentage(this)

/** Extension property to convert an Int to a Percentage. */
val Int.pct: Percentage
  get() = Percentage(this.toDouble())