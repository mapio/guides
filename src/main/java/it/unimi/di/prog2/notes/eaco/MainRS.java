/*

Copyright 2021 Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

package it.unimi.di.prog2.notes.eaco;

import it.unimi.di.prog2.notes.eaco.rs.Histogram;
import it.unimi.di.prog2.notes.eaco.rs.Rectangle;

public class MainRS {
  public static void main(String[] args) {
    Histogram hist = new Histogram();
    Rectangle r1 = new Rectangle(4, 4), r2 = new Rectangle(3, 3);
    hist.add(r1);
    hist.add(r2);
    System.out.println(hist);
    hist.changeBase(r2, 6);
    System.out.println(hist);
  }
}
