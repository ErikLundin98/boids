# Multidimensional Boids

A boids implementation written in Java. Boids are a form of simulation of a flock of boids (artificial birds). Each bird follows a few simple rules:

* If a boid sees another boid, it moves towards it
* If it comes too close to another boid, it flies away
* Each boid tries to mimic the movement of nearby boids

![boids](https://github.com/ErikLundin98/public/blob/main/boids/media/boids.gif)

Head over to https://eriklundin98.github.io/ to see the results and experiment! It is possible to change simulation parameters such as the boids' viewing range, amount of boids, velocity etc. in real time using the sliders and the drop down menu. The boids are four dimensional, and the fourth dimension is visualized by using color. The closer two boids are to each other in the fourth dimension, the more their colors match.

The program is made in such a way that the boids can act in an unlimited amount of dimensions. If you're interested in the source code, it can be found in the [`boids`](https://github.com/ErikLundin98/public/tree/main/boids/core/src/com/mygdx/game) folder. The rendering is done using the [`LibGDX engine`](https://libgdx.badlogicgames.com/)
