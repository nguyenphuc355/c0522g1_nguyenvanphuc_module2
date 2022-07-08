package ss6_inheritance.excecise.point_and_moveablePoint.controller;

import ss6_inheritance.excecise.point_and_moveablePoint.model.MoveablePoint;


public class MainMoveablePointController {
    public static void main(String[] args) {

        MoveablePoint movablePoint = new MoveablePoint();
        System.out.println(movablePoint);

        movablePoint = new MoveablePoint(1, 2, 10, 12);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());

    }
}
