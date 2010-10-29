package polylib;


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Param_Polyhedron {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Param_Polyhedron(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Param_Polyhedron obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      PolylibJNI.delete_Param_Polyhedron(swigCPtr);
    }
    swigCPtr = 0;
  }

  public int getNbV() {
    return PolylibJNI.Param_Polyhedron_nbV_get(swigCPtr);
  }

  public Param_Vertices getV() {
    long cPtr = PolylibJNI.Param_Polyhedron_V_get(swigCPtr);
    return (cPtr == 0) ? null : new Param_Vertices(cPtr, false);
  }

  public Param_Domain getD() {
    long cPtr = PolylibJNI.Param_Polyhedron_D_get(swigCPtr);
    return (cPtr == 0) ? null : new Param_Domain(cPtr, false);
  }

  public Param_Polyhedron() {
    this(PolylibJNI.new_Param_Polyhedron(), true);
  }

}
