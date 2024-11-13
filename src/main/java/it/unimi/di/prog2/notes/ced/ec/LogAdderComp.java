/*

Copyright 2024 Massimo Santini

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

package it.unimi.di.prog2.notes.ced.ec;

import java.util.ArrayList;
import java.util.List;

public class LogAdderComp {
  private final Adder adder = new Adder();
  private final List<Integer> seen = new ArrayList<>();

  public void add(int x) {
    seen.add(x);
    adder.add(x);
  }

  public void add(List<Integer> l) {
    seen.addAll(l);
    adder.add(l);
  }

  public int result() {
    return adder.result();
  }

  public List<Integer> log() {
    return List.copyOf(seen);
  }
}
