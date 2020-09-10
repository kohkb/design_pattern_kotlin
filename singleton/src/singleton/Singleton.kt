package singleton

class Singleton {
    companion object{
        private var singleton: Singleton = Singleton()
        
        fun getInstance(): Singleton {
            return singleton
        }
    }
}