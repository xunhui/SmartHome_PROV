### Entity
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该实体的ID |
Type | String | 实体类型 |
Value | String | 属性值 |
Time | String | 时间属性值 |

### Agent
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该代理的ID |
Type | String | 代理类型 |
Attribute | String | 属性值 |

### Activity
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该活动的ID |
Type | String | 代理类型 |
StartTime | String | 活动开始时间 |
EndTime | String | 活动结束时间 |

### Relation
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该依赖关系的ID |
RelationType | String | 依赖关系类型 |
Cause | Int | 依赖对象ID |
Effect | Int | 被依赖对象ID |
