import processing.core.PApplet

class Sketch: PApplet() {
    override fun settings(){
        size(800, 600)
    }

    override fun setup(){

    }

    override fun draw(){
        background(frameCount % 255)
    }
}

fun main() {
    PApplet.main(Sketch::class.java.name)
}