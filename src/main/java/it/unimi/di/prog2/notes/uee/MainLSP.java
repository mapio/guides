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

package it.unimi.di.prog2.notes.uee;

import it.unimi.di.prog2.notes.uee.lsp.Client;
import it.unimi.di.prog2.notes.uee.lsp.R;
import it.unimi.di.prog2.notes.uee.lsp.S;
import it.unimi.di.prog2.notes.uee.lsp.T;

/*
 * Per una discussione di questo codice, si veda
 * https://prog2.di.unimi.it/notes/equalityandinheritance
 */

public class MainLSP {
  public static void main(String[] args) {
    S s = new S(1, 2);
    T t = new T(1);
    System.out.println(t.equals(s));
    System.out.println(s.equals(t));

    R r = new R(1);
    System.out.println(Client.isSmall(t));
    System.out.println(Client.isSmall(r));
  }
}
