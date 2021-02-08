package com.github.alexeylapin.oca;

import java.io.Serializable;

/**
 * <b>public</b> - access modifier - optional <br>
 * <b>final</b> - nonaccess modifier - optional <br>
 * <b>class</b> - keyword - required <br>
 * <b>N05_ClassDeclaration</b> - name of class - required <br>
 * <b>extends</b> - keyword - optional <br>
 * <b>Thread</b>- name of base class - optional <br>
 * <b>implements</b> - keyword - optional <br>
 * <b>Serializable, Runnable</b> - names of implemented interfaces <br>
 * <b>{}</b> - class body - required
 */
public final class N05_ClassDeclaration extends Thread implements Serializable, Runnable {
}

