package polylib;


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Polyhedron {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Polyhedron(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Polyhedron obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      PolylibJNI.delete_Polyhedron(swigCPtr);
    }
    swigCPtr = 0;
  }

  public long getDimension() {
    return PolylibJNI.Polyhedron_Dimension_get(swigCPtr);
  }

  public long getNbConstraints() {
    return PolylibJNI.Polyhedron_NbConstraints_get(swigCPtr);
  }

  public long getNbRays() {
    return PolylibJNI.Polyhedron_NbRays_get(swigCPtr);
  }

  public long getNbEq() {
    return PolylibJNI.Polyhedron_NbEq_get(swigCPtr);
  }

  public long getNbBid() {
    return PolylibJNI.Polyhedron_NbBid_get(swigCPtr);
  }

  public SWIGTYPE_p_p_int getConstraint() {
    long cPtr = PolylibJNI.Polyhedron_Constraint_get(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_int(cPtr, false);
  }

  public SWIGTYPE_p_p_int getRay() {
    long cPtr = PolylibJNI.Polyhedron_Ray_get(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int getP_Init() {
    long cPtr = PolylibJNI.Polyhedron_p_Init_get(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public int getP_Init_size() {
    return PolylibJNI.Polyhedron_p_Init_size_get(swigCPtr);
  }

  public Polyhedron getNext() {
    long cPtr = PolylibJNI.Polyhedron_next_get(swigCPtr);
    return (cPtr == 0) ? null : new Polyhedron(cPtr, false);
  }

  public long getFlags() {
    return PolylibJNI.Polyhedron_flags_get(swigCPtr);
  }

  public Polyhedron() {
    this(PolylibJNI.new_Polyhedron(), true);
  }

}
