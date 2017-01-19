package org.manifold.compiler.middle.serialization;

import java.util.Map;

import org.manifold.compiler.BooleanTypeValue;
import org.manifold.compiler.IntegerTypeValue;
import org.manifold.compiler.RealTypeValue;
import org.manifold.compiler.StringTypeValue;
import org.manifold.compiler.TypeValue;

import com.google.common.collect.ImmutableMap;

public interface SerializationConsts {
  public interface GlobalConsts {
    String NODE_PORT_DELIM = ":";
    String SCHEMATIC_NAME = "name";
    String ATTRIBUTES = "attributes";
    String TYPE = "type";
    String SUPERTYPE = "supertype";
    String SIGNAL_TYPE = "signalType";
  }

  public interface UDTConsts {
    String ARRAY_ELEMENT_TYPE = "elementType";
    String INFERRED_TYPE = "inferredType";
  }

  public interface SchematicConsts {
    String USER_DEF_TYPES = "userDefinedTypes";
    String PORT_TYPES = "portTypes";
    String NODE_TYPES = "nodeTypes";
    String CONSTRAINT_TYPES = "constraintTypes";
    String CONNECTION_TYPES = "connectionTypes";

    String NODE_DEFS = "nodes";
    String CONNECTION_DEFS = "connections";
    String CONSTRAINT_DEFS = "constraints";
  }

  public interface NodeTypeConsts {
    String PORT_MAP = "ports";
  }

  public interface NodeConsts {
    String PORT_ATTRS = "portAttrs";
  }

  public interface ConnectionConsts {
    String FROM = "from";
    String TO = "to";
  }

  public interface PrimitiveTypes {
    Map<String, TypeValue> PRIMITIVE_TYPES = ImmutableMap.of(
        "Bool", BooleanTypeValue.getInstance(),
        "Int", IntegerTypeValue.getInstance(),
        "String", StringTypeValue.getInstance(),
        "Real", RealTypeValue.getInstance());
  }
}
