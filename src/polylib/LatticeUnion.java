package polylib;


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class LatticeUnion {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected LatticeUnion(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LatticeUnion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      PolylibJNI.delete_LatticeUnion(swigCPtr);
    }
    swigCPtr = 0;
  }

  public Matrix getM() {
    long cPtr = PolylibJNI.LatticeUnion_M_get(swigCPtr);
    return (cPtr == 0) ? null : new Matrix(cPtr, false);
  }

  public LatticeUnion getNext() {
    long cPtr = PolylibJNI.LatticeUnion_next_get(swigCPtr);
    return (cPtr == 0) ? null : new LatticeUnion(cPtr, false);
  }

  public LatticeUnion() {
    this(PolylibJNI.new_LatticeUnion(), true);
  }

}
