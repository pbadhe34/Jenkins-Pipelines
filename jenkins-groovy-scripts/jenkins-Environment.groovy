  def env = System.getenv()
    env.each {
    println it
  }

  def envi = System.getenv()
  println envi['BUILD_NUMBER']